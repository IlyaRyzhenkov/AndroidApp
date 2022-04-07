package com.example.appproject

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import com.example.appproject.database.HabitConverter
import com.example.appproject.database.HabitDatabase
import com.example.appproject.database.entities.DbHabit

object HabitsRepository {
    private lateinit var habitDatabase: HabitDatabase
    private lateinit var dbHabitsLiveData: LiveData<List<DbHabit>>
    val habits: MutableLiveData<List<Habit>> = MutableLiveData()

    operator fun invoke(context: Context, lifecycleOwner: LifecycleOwner) : HabitsRepository {
        habitDatabase = Room.databaseBuilder(context, HabitDatabase::class.java, "habitDatabase")
            .allowMainThreadQueries().build()
        dbHabitsLiveData = habitDatabase.habitsDAO().getAllHabits()
        dbHabitsLiveData.observe(lifecycleOwner) { dbHabits -> handleHabitsUpdateFromDb(dbHabits) }
        return this
    }

    fun getHabitsCount(): Int {
        return habits.value?.size ?: 0
    }

    fun addHabit(habit: Habit) {
        val dbHabit = HabitConverter.habitToDbHabit(habit)
        habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    fun removeHabit(habit: Habit) {
        val dbHabit = HabitConverter.habitToDbHabit(habit)
        habitDatabase.habitsDAO().deleteHabit(dbHabit)
    }

    fun changeHabit(newHabit: Habit) {
        val dbHabit = HabitConverter.habitToDbHabit(newHabit)
        habitDatabase.habitsDAO().updateHabit(dbHabit)
    }

    fun clearHabits() {
        habitDatabase.habitsDAO().clear()
    }

    private fun handleHabitsUpdateFromDb(dbHabits: List<DbHabit>) {
        habits.value = dbHabits.map(HabitConverter::dbHabitToHabit).toList()
    }
}
