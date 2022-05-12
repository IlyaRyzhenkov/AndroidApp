package com.example.data.database

import androidx.room.*
import com.example.data.database.entities.DbHabitCompletion

@Dao
interface HabitsCompletionDAO {
    @Insert
    fun insert(habitCompletion: DbHabitCompletion): Long

    @Query("DELETE FROM habits_completion WHERE habit_id=:habitId")
    fun deleteByHabitId(habitId: Long)

    @Query("SELECT COUNT(completion_id) FROM habits_completion WHERE habit_id=:habitId AND date>=:dateFrom")
    fun getCompletionCountByHabitId(habitId: Long, dateFrom: Long): Int
}