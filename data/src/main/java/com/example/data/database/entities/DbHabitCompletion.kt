package com.example.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "habits_completion",
        foreignKeys = [ForeignKey(entity = DbHabit::class, parentColumns = ["habit_id"], childColumns = ["habit_id"],
                          onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)],
        indices = [Index("habit_id", "date"), Index("habit_uid", "date")])
data class DbHabitCompletion(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "completion_id") val id: Long?,
    @ColumnInfo(name = "habit_id") val habitId: Long?,
    @ColumnInfo(defaultValue = "0") val date: Long,
    @ColumnInfo(name = "habit_uid") val habitUid: String?,
)