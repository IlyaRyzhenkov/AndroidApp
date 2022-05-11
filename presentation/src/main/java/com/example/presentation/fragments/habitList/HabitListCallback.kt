package com.example.presentation.fragments.habitList

import com.example.domain.models.Habit

interface HabitListCallback {
    fun onItemClicked(habit: Habit, position : Int)
}