package com.example.appproject.database.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class DbHabit(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "habit_id") val id: Long? = null,
    val name: String,
    val description: String,
    val priority: Int,
    val type: Int,
    val period: Int,
    val counter: Int,
    @ColumnInfo(name = "int_color") val intColor: Int,
)
