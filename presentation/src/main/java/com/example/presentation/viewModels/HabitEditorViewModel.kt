package com.example.presentation.viewModels

import androidx.lifecycle.ViewModel
import com.example.domain.models.Habit
import com.example.domain.operations.habit.HabitOperationFactory
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

enum class CreateButtonClickMode {
    CHANGE_HABIT,
    DELETE_HABIT,
    ADD_HABIT;
}

class HabitEditorViewModel(private val habitOperationFactory: HabitOperationFactory) : ViewModel(), CoroutineScope {
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
        habitOperationFactory.createAddHabitOperation(habit).run()
    }

    private fun deleteHabit(habit: Habit?) {
        habitOperationFactory.createDeleteHabitOperation(habit).run()
    }

    private fun changeHabit(newHabit: Habit) {
        habitOperationFactory.createUpdateHabitOperation(newHabit).run()
    }

    override fun onCleared() {
        super.onCleared()
        coroutineContext.cancelChildren()
    }
}
