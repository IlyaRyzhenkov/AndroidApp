package com.example.domain.repositories

import com.example.domain.models.Habit

/*
    Предоставляет синхронный доступ к локальному и удаленному репозиториям
 */
interface ISyncHabitRepository {
    suspend fun addHabit(habit: Habit)

    suspend fun updateHabit(newHabit: Habit)

    suspend fun deleteHabit(habit: Habit)

    /*
        Выполнить привычку и возвратить колличество выполнений за период
     */
    suspend fun completeHabit(habit: Habit, completionDate: Long): Int
}