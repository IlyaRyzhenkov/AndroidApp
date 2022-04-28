package com.example.appproject.viewModels

import androidx.lifecycle.ViewModel
import com.example.appproject.Habit
import com.example.appproject.SyncRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

enum class CreateButtonClickMode {
    CHANGE_HABIT,
    DELETE_HABIT,
    ADD_HABIT;
}

class HabitEditorViewModel(private val habitsRepository: SyncRepository) : ViewModel(), CoroutineScope {
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
        launch { withContext(Dispatchers.IO) { habitsRepository.addHabit(habit) } }
    }

    private fun deleteHabit(habit: Habit?) {
        if (habit != null) {
            launch { withContext(Dispatchers.IO) { habitsRepository.deleteHabit(habit) } }
        }
    }

    private fun changeHabit(newHabit: Habit) {
        launch { withContext(Dispatchers.IO) { habitsRepository.changeHabit(newHabit) } }
    }

    override fun onCleared() {
        super.onCleared()
        coroutineContext.cancelChildren()
    }
}
