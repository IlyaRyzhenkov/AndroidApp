package com.example.appproject

import com.example.appproject.remote.habit.service.HabitUid
import com.example.appproject.remote.habit.service.RemoteHabitRepository

class SyncRepository(private val localRepository: HabitsRepository, private val remoteRepository: RemoteHabitRepository) {
    suspend fun addHabit(habit: Habit) {
        val id = localRepository.addHabit(habit)
        habit.id = id
        val uid = remoteRepository.putHabitToRemote(habit)
        if (uid != null) {
            habit.uid = uid.uid
            localRepository.changeHabit(habit)
        }
    }

    suspend fun changeHabit(newHabit: Habit) {
        // Привычка, созданная из View может не иметь uid (т.к. он получается асинхронно)
        if (newHabit.uid == null) {
            // В данный момент у привычки в локальной базе уже может быть uid
            val uid = localRepository.getHabitUidById(newHabit.id)
            if (uid == null) {
                // Если в базе не задан uid, то создаем новую привычку на сервере
                localRepository.changeHabit(newHabit)
                val newUid = remoteRepository.putHabitToRemote(newHabit)
                if (newUid != null) {
                    newHabit.uid = newUid.uid
                    localRepository.changeHabit(newHabit)
                }
            } else {
                // Используем uid из базы
                newHabit.uid = uid
                localRepository.changeHabit(newHabit)
                remoteRepository.putHabitToRemote(newHabit)
            }
        } else {
            localRepository.changeHabit(newHabit)
            remoteRepository.putHabitToRemote(newHabit)
        }
    }

    suspend fun deleteHabit(habit: Habit) {
        if (habit.uid == null) {
            val uid = localRepository.getHabitUidById(habit.id)
            if (uid == null) {
                localRepository.removeHabit(habit)
            } else {
                habit.uid = uid
                localRepository.removeHabit(habit)
                remoteRepository.deleteHabitFromRemote(HabitUid(uid))
            }
        } else {
            localRepository.removeHabit(habit)
            remoteRepository.deleteHabitFromRemote(HabitUid(habit.uid!!))
        }
    }
}
