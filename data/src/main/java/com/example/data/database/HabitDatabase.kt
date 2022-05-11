package com.example.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.database.entities.DbHabit

@Database(entities = [DbHabit::class], version = 3)
abstract class HabitDatabase: RoomDatabase() {
    abstract fun habitsDAO(): HabitsDAO
}