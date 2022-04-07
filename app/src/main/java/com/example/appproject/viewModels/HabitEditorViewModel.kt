package com.example.appproject.viewModels

import androidx.lifecycle.ViewModel
import com.example.appproject.Habit
import com.example.appproject.HabitsRepository

enum class CreateButtonClickMode {
    CHANGE_HABIT,
    DELETE_HABIT,
    ADD_HABIT;
}

class HabitEditorViewModel(private val habitsRepository: HabitsRepository) : ViewModel() {
    fun onCreateButtonClick(oldHabit: Habit?, newHabit: Habit, mode: CreateButtonClickMode) {
        when(mode) {
            CreateButtonClickMode.CHANGE_HABIT -> changeHabit(newHabit)
            CreateButtonClickMode.DELETE_HABIT -> deleteHabit(oldHabit)
            CreateButtonClickMode.ADD_HABIT -> addHabit(newHabit)
        }
    }

    private fun addHabit(habit: Habit) {
        habitsRepository.addHabit(habit)
    }

    private fun deleteHabit(habit: Habit?) {
        if (habit != null) {
            habitsRepository.removeHabit(habit)
        }
    }

    private fun changeHabit(newHabit: Habit) {
        habitsRepository.changeHabit(newHabit)
    }
}
