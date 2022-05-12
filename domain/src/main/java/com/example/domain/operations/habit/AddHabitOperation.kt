package com.example.domain.operations.habit

import com.example.domain.models.Habit
import com.example.domain.operations.BaseOperation
import com.example.domain.repositories.ISyncHabitRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddHabitOperation(private val habitRepository: ISyncHabitRepository,
                        private val habit: Habit,
                        private val coroutineScope: CoroutineScope
) : BaseOperation {
    private var isAlreadyRun = false

    override fun run() {
        if (!isAlreadyRun) {
            isAlreadyRun = true
            runAddOperation()
        }
    }

    private fun runAddOperation() {
        coroutineScope.launch { withContext(Dispatchers.IO) { habitRepository.addHabit(habit) } }
    }
}