package com.example.appproject.fragments

import com.example.appproject.Habit

interface HabitListCallback {
    fun onItemClicked(habit: Habit, position : Int)
}
