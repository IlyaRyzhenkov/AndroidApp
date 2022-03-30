package com.example.appproject.viewModels

import com.example.appproject.Habit

interface HabitListObserverViewModel {
    fun onItemAdded(habit: Habit)
    fun onItemChanged(oldHabit: Habit, newHabit: Habit, position: Int)
    fun onItemRemoved(position: Int)
}
