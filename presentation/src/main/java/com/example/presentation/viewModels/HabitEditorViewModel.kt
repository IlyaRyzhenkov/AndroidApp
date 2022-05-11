package com.example.presentation.viewModels

import androidx.lifecycle.ViewModel
import com.example.data.SyncHabitRepository
import com.example.domain.models.Habit
import com.example.domain.operations.OperationFactory
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

enum class CreateButtonClickMode {
    CHANGE_HABIT,
    DELETE_HABIT,
    ADD_HABIT;
}

class HabitEditorViewModel(private val operationFactory: OperationFactory) : ViewModel(), CoroutineScope {
    private val job = SupervisorJob()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job + CoroutineExceptionHandler { _, e -> throw e }

    fun onCreateButtonClick(oldHabit: Habit?, newHabit: Habit, mode: CreateButtonClickMode) {
        when(mode) {
            CreateButtonClickMode.CHANGE_HABIT -> changeHabit(newHabit)
            CreateButtonClickMode.DELETE_HABIT -> deleteHabit(oldHabit)
            CreateButtonClickMode.ADD_HABIT -> addHabit(newHabit)
        }
    }

    private fun addHabit(habit: Habit) {
        operationFactory.createAddHabitOperation(habit).run()
    }

    private fun deleteHabit(habit: Habit?) {
        operationFactory.createDeleteHabitOperation(habit).run()
    }

    private fun changeHabit(newHabit: Habit) {
        operationFactory.createUpdateHabitOperation(newHabit).run()
    }

    override fun onCleared() {
        super.onCleared()
        coroutineContext.cancelChildren()
    }
}
