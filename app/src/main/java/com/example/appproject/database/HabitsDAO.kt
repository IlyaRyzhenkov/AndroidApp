package com.example.appproject.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appproject.database.entities.DbHabit

@Dao
interface HabitsDAO {
    @Query("SELECT * FROM habits")
    fun getAllHabits() : LiveData<List<DbHabit>>

    @Insert
    fun insertHabit(habit: DbHabit)

    @Update
    fun updateHabit(habit: DbHabit)

    @Delete
    fun deleteHabit(habit: DbHabit)

    @Query("DELETE FROM habits")
    fun clear()
}
