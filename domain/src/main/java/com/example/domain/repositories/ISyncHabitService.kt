package com.example.domain.repositories

interface ISyncHabitService {
    suspend fun syncLocalAndRemote()
}
