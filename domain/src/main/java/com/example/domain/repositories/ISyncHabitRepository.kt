package com.example.domain.repositories

import com.example.domain.models.Habit

interface ISyncHabitRepository {
    suspend fun addHabit(habit: Habit)

    suspend fun updateHabit(newHabit: Habit)

    suspend fun deleteHabit(habit: Habit)
}