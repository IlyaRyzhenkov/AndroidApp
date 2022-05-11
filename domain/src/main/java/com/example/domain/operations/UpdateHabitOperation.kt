package com.example.domain.operations

import com.example.domain.models.Habit
import com.example.domain.repositories.ISyncHabitRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UpdateHabitOperation(private val habitRepository: ISyncHabitRepository,
                           private val habit: Habit,
                           private val coroutineScope: CoroutineScope
) : BaseOperation {
    private var isAlreadyRun = false

    override fun run() {
        if (!isAlreadyRun) {
            isAlreadyRun = true
            runUpdateOperation()
        }
    }

    private fun runUpdateOperation() {
        coroutineScope.launch { withContext(Dispatchers.IO) { habitRepository.updateHabit(habit) } }
    }
}