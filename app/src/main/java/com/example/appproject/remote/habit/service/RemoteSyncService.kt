package com.example.appproject.remote.habit.service

import com.example.appproject.Habit
import com.example.appproject.HabitsRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

object RemoteSyncService {

    suspend fun syncLocalAndRemote() {
        val localHabits = HabitsRepository.habits.value
        val remoteHabits = RemoteHabitRepository.getHabitsFromRemote()
        if (localHabits != null && remoteHabits != null) {
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
                HabitsRepository.addHabit(rHabit)
            }

            // Добавляем на сервер новые привычки из локальной бд
            val localHabitsToUpload = localHabits.filter { habit -> habit.uid == null || !remoteHabitUids.contains(habit.uid) }
            for (habit in localHabitsToUpload) {
                // Если у привычки был uid, то нужно его выставить в null,
                // чтобы отработал запрос на добавление а не обновление привычки
                habit.uid = null
                val newHabitUid = RemoteHabitRepository.putHabitToRemote(habit)
                if (newHabitUid != null) {
                    habit.uid = newHabitUid.uid
                    HabitsRepository.changeHabit(habit)
                }
            }

            // Синхронизируем остальные привычки. Если в какой-то из баз время последнего обновления позднее,
            // считаем эту базу более актуальной для данной привычки
            val localHabitsToCheck = localHabits.filter { habit -> remoteHabitUids.contains(habit.uid) }
            for (habit in localHabitsToCheck) {
                val remoteHabit = remoteHabits.find { h -> h.uid == habit.uid }!!
                if (habit.date > remoteHabit.date) {
                    RemoteHabitRepository.putHabitToRemote(habit)
                } else if (remoteHabit.date > habit.date) {
                    HabitsRepository.changeHabit(remoteHabit)
                }
            }
        }
    }
}
