package com.example.appproject.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "habits", indices = [Index("uid")])
data class DbHabit(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "habit_id") val id: Long? = null,
    val name: String,
    val description: String,
    val priority: Int,
    val type: Int,
    val period: Int,
    val counter: Int,
    @ColumnInfo(name = "int_color") val intColor: Int,
    val date: Long,
    val uid: String?,
)
