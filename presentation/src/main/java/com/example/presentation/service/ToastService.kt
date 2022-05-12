package com.example.presentation.service

import android.content.Context
import android.widget.Toast
import com.example.domain.models.Habit
import com.example.domain.models.HabitType

class ToastService(private val context: Context) {
    fun createToastOnHabitCompletion(habit: Habit, completionCount: Int) {
        val text = when(habit.type) {
            HabitType.GOOD -> if (completionCount < habit.counter) "Стоит выполнить ещё ${habit.counter - completionCount} раз" else "You are breathtaking!"
            HabitType.BAD -> if (completionCount < habit.counter) "Можете выполнить ещё ${habit.counter - completionCount} раз" else "Хватит это делать"
        }
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}
