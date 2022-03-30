package com.example.appproject.viewModels

import androidx.lifecycle.ViewModel
import com.example.appproject.Habit
import com.example.appproject.HabitsRepository

class HabitEditorViewModel(private val habitsRepository: HabitsRepository) : ViewModel() {
    fun onCreateButtonClick(oldHabit: Habit?, newHabit: Habit?, position: Int) {
        if (oldHabit != null && newHabit != null) {
            changeHabit(oldHabit, newHabit, position)
        } else if (oldHabit == null && newHabit == null) {
            deleteHabit(position)
        } else if (oldHabit == null && newHabit != null) {
            addHabit(newHabit)
        } else {
            throw IllegalArgumentException("Can`t find correct action for arguments oldHabit=$oldHabit, " +
                    "newHabit=$newHabit, position=$position")
        }
    }

    private fun addHabit(habit: Habit) {
        habitsRepository.addHabit(habit)
    }

    private fun deleteHabit(position: Int) {
        habitsRepository.removeHabit(position)
    }

    private fun changeHabit(oldHabit: Habit, newHabit: Habit, position: Int) {
        habitsRepository.changeHabit(oldHabit, newHabit, position)
    }
}
