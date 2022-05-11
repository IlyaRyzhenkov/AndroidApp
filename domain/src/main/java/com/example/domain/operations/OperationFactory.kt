package com.example.domain.operations

import com.example.domain.models.Habit
import com.example.domain.repositories.ISyncHabitRepository
import com.example.domain.repositories.ISyncHabitService
import kotlinx.coroutines.CoroutineScope

class OperationFactory(private val syncRepository: ISyncHabitRepository,
                       private val syncService: ISyncHabitService,
                       private val coroutineScope: CoroutineScope) {
    fun createAddHabitOperation(habit: Habit): AddHabitOperation {
        return AddHabitOperation(syncRepository, habit, coroutineScope)
    }

    fun createUpdateHabitOperation(habit: Habit): UpdateHabitOperation {
        return UpdateHabitOperation(syncRepository, habit, coroutineScope)
    }

    fun createDeleteHabitOperation(habit: Habit?): DeleteHabitOperation {
        return DeleteHabitOperation(syncRepository, habit, coroutineScope)
    }

    fun createSyncOperation(): SyncHabitsOperation {
        return SyncHabitsOperation(syncService, coroutineScope)
    }
}