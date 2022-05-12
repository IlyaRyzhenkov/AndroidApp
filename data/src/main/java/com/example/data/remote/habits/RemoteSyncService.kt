package com.example.data.remote.habits

import com.example.data.database.HabitsRepository
import com.example.domain.models.Habit
import com.example.domain.repositories.ISyncHabitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext

class RemoteSyncService(private val localHabitRepository: HabitsRepository,
                        private val remoteHabitRepository: RemoteHabitRepository): ISyncHabitService {

    override suspend fun syncLocalAndRemote() {
        val localHabits = localHabitRepository.habitsFlow.first()
        val remoteHabits = remoteHabitRepository.getHabitsFromRemote()
        if (remoteHabits != null) {
            sync(localHabits, remoteHabits)
        }
    }

    private suspend fun sync(localHabits: List<Habit>, remoteHabits: List<Habit>) {
        withContext(Dispatchers.IO) {
            val localHabitUids = localHabits.map { habit -> habit.uid }
            val remoteHabitUids = remoteHabits.map { habit -> habit.uid }

            // Добавляем в локальную бд новые привычки с сервера
            val remoteHabitsToAdd = remoteHabits.filter { rHabit -> !localHabitUids.contains(rHabit.uid) }
            for (rHabit in remoteHabitsToAdd) {
                localHabitRepository.addHabit(rHabit)
            }

            // Добавляем на сервер новые привычки из локальной бд
            val localHabitsToUpload = localHabits.filter { habit -> habit.uid == null || !remoteHabitUids.contains(habit.uid) }
            for (habit in localHabitsToUpload) {
                // Если у привычки был uid, то нужно его выставить в null,
                // чтобы отработал запрос на добавление а не обновление привычки
                habit.uid = null
                val newHabitUid = remoteHabitRepository.putHabitToRemote(habit)
                if (newHabitUid != null) {
                    habit.uid = newHabitUid.uid
                    localHabitRepository.changeHabit(habit)
                }
            }

            // Синхронизируем остальные привычки. Если в какой-то из баз время последнего обновления позднее,
            // считаем эту базу более актуальной для данной привычки
            val localHabitsToCheck = localHabits.filter { habit -> remoteHabitUids.contains(habit.uid) }
            for (habit in localHabitsToCheck) {
                val remoteHabit = remoteHabits.find { h -> h.uid == habit.uid }!!
                if (habit.date > remoteHabit.date) {
                    remoteHabitRepository.putHabitToRemote(habit)
                } else if (remoteHabit.date > habit.date) {
                    localHabitRepository.changeHabit(remoteHabit)
                }
            }
        }
    }
}
