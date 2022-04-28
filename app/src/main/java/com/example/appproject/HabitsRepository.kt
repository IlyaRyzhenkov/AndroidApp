package com.example.appproject

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import com.example.appproject.database.DatabaseMigrations
import com.example.appproject.database.HabitConverter
import com.example.appproject.database.HabitDatabase
import com.example.appproject.database.entities.DbHabit

object HabitsRepository {
    private lateinit var habitDatabase: HabitDatabase
    private lateinit var dbHabitsLiveData: LiveData<List<DbHabit>>
    val habits: MutableLiveData<List<Habit>> = MutableLiveData()

    operator fun invoke(context: Context, lifecycleOwner: LifecycleOwner) : HabitsRepository {
        habitDatabase = Room.databaseBuilder(context, HabitDatabase::class.java, "habitDatabase")
            .addMigrations(DatabaseMigrations.MIGRATION_1_2, DatabaseMigrations.MIGRATION_2_3)
            .build()
        dbHabitsLiveData = habitDatabase.habitsDAO().getAllHabits()
        dbHabitsLiveData.observe(lifecycleOwner) { dbHabits -> handleHabitsUpdateFromDb(dbHabits) }
        return this
    }

    fun getHabitsCount(): Int {
        return habits.value?.size ?: 0
    }

    suspend fun getHabitUidById(id: Long): String? {
        val kek = habitDatabase.habitsDAO().getHabitById(id)
        return kek.uid
    }

    suspend fun addHabit(habit: Habit): Long {
        val dbHabit = HabitConverter.habitToDbHabit(habit)
        return habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun removeHabit(habit: Habit) {
        val dbHabit = HabitConverter.habitToDbHabit(habit)
        habitDatabase.habitsDAO().deleteHabit(dbHabit)
    }

    suspend fun changeHabit(newHabit: Habit) {
        val dbHabit = HabitConverter.habitToDbHabit(newHabit)
        habitDatabase.habitsDAO().deleteHabit(dbHabit)
        habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun clearHabits() {
        habitDatabase.habitsDAO().clear()
    }

    private fun handleHabitsUpdateFromDb(dbHabits: List<DbHabit>) {
        habits.value = dbHabits.map(HabitConverter::dbHabitToHabit).toList()
    }
}
