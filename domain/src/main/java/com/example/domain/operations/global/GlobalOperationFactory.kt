package com.example.domain.operations.global

import com.example.domain.repositories.IHabitsRepository
import com.example.domain.repositories.IRemoteHabitRepository
import com.example.domain.repositories.ISyncHabitService
import kotlinx.coroutines.CoroutineScope

class GlobalOperationFactory(private val habitsRepository: IHabitsRepository,
                             private val remoteHabitRepository: IRemoteHabitRepository,
                             private val syncService: ISyncHabitService,
                             private val coroutineScope: CoroutineScope) {

    fun createSyncOperation(): SyncHabitsOperation {
        return SyncHabitsOperation(syncService, coroutineScope)
    }

    fun createClearRemoteRepositoryOperation(): ClearRemoteRepositoryOperation {
        return ClearRemoteRepositoryOperation(remoteHabitRepository, coroutineScope)
    }

    fun createClearLocalRepositoryOperation(): ClearLocalRepositoryOperation {
        return ClearLocalRepositoryOperation(habitsRepository, coroutineScope)
    }
}