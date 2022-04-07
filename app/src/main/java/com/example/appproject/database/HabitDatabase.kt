package com.example.appproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appproject.database.entities.DbHabit

@Database(entities = [DbHabit::class], version = 1)
abstract class HabitDatabase: RoomDatabase() {
    abstract fun habitsDAO(): HabitsDAO
}
