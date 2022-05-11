package com.example.presentation.fragments.habitEditor

import com.example.domain.models.Habit

interface HabitsEditorCallback {
    fun onHabitCreated(habit: Habit, position: Int)

    fun onHabitEdited(oldHabit: Habit, newHabit: Habit, oldPosition: Int)
}