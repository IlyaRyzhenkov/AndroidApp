package com.example.domain.operations

import com.example.domain.repositories.ISyncHabitService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SyncHabitsOperation(private val syncRemoteService: ISyncHabitService, private val coroutineScope: CoroutineScope): BaseOperation {
    private var isAlreadyRun = false

    override fun run() {
        if (!isAlreadyRun) {
            isAlreadyRun = true
            runSyncOperation()
        }
    }

    private fun runSyncOperation() {
        coroutineScope.launch { withContext(Dispatchers.IO) { syncRemoteService.syncLocalAndRemote() } }
    }

}