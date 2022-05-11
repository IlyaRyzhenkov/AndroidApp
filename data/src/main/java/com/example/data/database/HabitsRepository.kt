package com.example.data.database

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.data.database.entities.DbHabit
import com.example.domain.models.Habit

class HabitsRepository(lifecycleOwner: LifecycleOwner,
                       private val habitDatabase: HabitDatabase, val habitConverter: HabitConverter) {
    private val dbHabitsLiveData: LiveData<List<DbHabit>> = habitDatabase.habitsDAO().getAllHabits()
    val habits: MutableLiveData<List<Habit>> = MutableLiveData()
    init {
        dbHabitsLiveData.observe(lifecycleOwner) { dbHabit -> handleHabitsUpdateFromDb(dbHabit) }
    }

    fun getHabitsCount(): Int {
        return habits.value?.size ?: 0
    }

    suspend fun getHabitUidById(id: Long): String? {
        return habitDatabase.habitsDAO().getHabitById(id).uid
    }

    suspend fun addHabit(habit: Habit): Long {
        val dbHabit = habitConverter.habitToDbHabit(habit)
        return habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun removeHabit(habit: Habit) {
        val dbHabit = habitConverter.habitToDbHabit(habit)
        habitDatabase.habitsDAO().deleteHabit(dbHabit)
    }

    suspend fun changeHabit(newHabit: Habit) {
        val dbHabit = habitConverter.habitToDbHabit(newHabit)
        habitDatabase.habitsDAO().updateHabit(dbHabit)
        // TODO Понять почему это было так
        // habitDatabase.habitsDAO().deleteHabit(dbHabit)
        // habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun clearHabits() {
        habitDatabase.habitsDAO().clear()
    }

    private fun handleHabitsUpdateFromDb(dbHabits: List<DbHabit>) {
        habits.value = dbHabits.map(habitConverter::dbHabitToHabit).toList()
    }
}
