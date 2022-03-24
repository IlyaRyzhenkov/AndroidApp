package com.example.appproject.fragments

import com.example.appproject.Habit

interface HabitsEditorCallback {
    fun onHabitCreated(habit: Habit, position: Int)

    fun onHabitEdited(oldHabit: Habit, newHabit: Habit, oldPosition: Int)
}
