package com.example.domain.operations.habit

import com.example.domain.models.Habit
import com.example.domain.operations.global.SyncHabitsOperation
import com.example.domain.repositories.ISyncHabitRepository
import com.example.domain.repositories.ISyncHabitService
import kotlinx.coroutines.CoroutineScope

class HabitOperationFactory(private val syncRepository: ISyncHabitRepository,
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

    fun createCompleteHabitOperation(habit: Habit, completionDate: Long): CompleteHabitOperation {
        return CompleteHabitOperation(syncRepository, habit, completionDate, coroutineScope)
    }
}