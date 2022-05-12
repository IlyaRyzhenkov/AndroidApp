package com.example.domain.operations.global

import com.example.domain.operations.BaseOperation
import com.example.domain.repositories.IHabitsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ClearLocalRepositoryOperation(private val habitsRepository: IHabitsRepository,
                                    private val coroutineScope: CoroutineScope): BaseOperation {
    private var isAlreadyRun = false

    override fun run() {
        if (!isAlreadyRun) {
            isAlreadyRun = true
            runClearOperation()
        }
    }

    private fun runClearOperation() {
        coroutineScope.launch { withContext(Dispatchers.IO) { habitsRepository.clearHabits() } }
    }
}