package com.example.appproject.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appproject.Habit
import com.example.appproject.database.entities.DbHabit

@Dao
interface HabitsDAO {
    @Query("SELECT * FROM habits")
    fun getAllHabits() : LiveData<List<DbHabit>>

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
