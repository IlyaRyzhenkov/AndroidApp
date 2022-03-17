package com.example.appproject

import android.graphics.Color
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

enum class HabitType(val repr: String, val color: Int) {
    GOOD("Good", Color.GREEN),
    BAD("Bad", Color.RED)
}

@Parcelize
class Habit(
    var name: String,
    var description: String,
    var priority: Int,
    var type: HabitType,
    var period: Int,
    var counter: Int,
    var color: Int
) : Parcelable
