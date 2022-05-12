package com.example.domain.operations.habit

import com.example.domain.models.Habit
import com.example.domain.operations.OperationWithResult
import com.example.domain.repositories.ISyncHabitRepository
import kotlinx.coroutines.*

class CompleteHabitOperation(private val habitRepository: ISyncHabitRepository,
                             private val habit: Habit,
                             private val completionDate: Long,
                             private val coroutineScope: CoroutineScope): OperationWithResult<CompleteHabitOperationResult> {
    private var isAlreadyRun = false
    private var operationResult: CompleteHabitOperationResult = CompleteHabitOperationResult(0)

    override fun run(): CompleteHabitOperationResult {
        if (!isAlreadyRun) {
            isAlreadyRun = true
            val res = runBlocking { runCompleteOperation() }
            operationResult = CompleteHabitOperationResult(res)
        }
        return operationResult
    }

    private suspend fun runCompleteOperation(): Int {
        val result = coroutineScope.async { withContext(Dispatchers.IO) { habitRepository.completeHabit(habit, completionDate) } }
        return result.await()
    }
}

data class CompleteHabitOperationResult(
    val completionsByHabitPeriod: Int,
)