package com.example.appproject.database

import com.example.appproject.Habit
import com.example.appproject.HabitType
import com.example.appproject.database.entities.DbHabit
import java.time.Instant

object HabitConverter {
    fun dbHabitToHabit(dbHabit: DbHabit) : Habit {
        return Habit(
            id = dbHabit.id ?: -1,
            name = dbHabit.name,
            description = dbHabit.description,
            type = HabitType.getTypeByTypeId(dbHabit.type),
            priority = dbHabit.priority,
            period = dbHabit.period,
            counter = dbHabit.counter,
            color = dbHabit.intColor,
            date = Instant.ofEpochSecond(0),
            uid = dbHabit.uid,
        )
    }

    fun habitToDbHabit(habit: Habit) : DbHabit {
        return DbHabit(
            id = if (habit.id != -1L) habit.id else null,
            name = habit.name,
            description = habit.description,
            type = habit.type.typeId,
            priority = habit.priority,
            period = habit.period,
            counter = habit.counter,
            intColor = habit.color,
            uid = habit.uid,
            date = habit.date.epochSecond,
        )
    }
}
