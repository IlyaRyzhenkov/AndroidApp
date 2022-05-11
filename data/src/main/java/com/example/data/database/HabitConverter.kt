package com.example.data.database

import com.example.data.database.entities.DbHabit
import com.example.domain.models.Habit
import com.example.domain.models.HabitType
import java.time.Instant

class HabitConverter {
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
            date = Instant.ofEpochSecond(dbHabit.date),
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