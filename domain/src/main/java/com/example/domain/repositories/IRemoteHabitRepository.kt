package com.example.domain.repositories

interface IRemoteHabitRepository {
    suspend fun clearHabits()
}