package com.example.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.data.database.entities.DbHabit
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitsDAO {
    @Query("SELECT * FROM habits")
    fun getAllHabits() : Flow<List<DbHabit>>

    @Query("SELECT * FROM habits WHERE habit_id=:id")
    fun getHabitById(id: Long) : DbHabit

    @Insert
    fun insertHabit(habit: DbHabit): Long

    @Update
    fun updateHabit(habit: DbHabit)

    @Delete
    fun deleteHabit(habit: DbHabit)

    @Query("DELETE FROM habits")
    fun clear()
}