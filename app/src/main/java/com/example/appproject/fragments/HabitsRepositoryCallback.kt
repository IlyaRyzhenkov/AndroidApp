package com.example.appproject.fragments

import com.example.appproject.Habit

interface HabitsRepositoryCallback {
    fun onHabitInserted(habit: Habit, position: Int)

    fun onHabitChanged(habit: Habit, position: Int)

    fun onHabitDeleted(habit: Habit, position: Int)
}
