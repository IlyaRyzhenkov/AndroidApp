package com.example.data.database

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.database.entities.DbHabit
import com.example.data.database.entities.DbHabitCompletion

@Database(entities = [DbHabit::class, DbHabitCompletion::class], version = 4)
abstract class HabitDatabase: RoomDatabase() {
    abstract fun habitsDAO(): HabitsDAO

    abstract fun habitsCompletionDAO(): HabitsCompletionDAO
}