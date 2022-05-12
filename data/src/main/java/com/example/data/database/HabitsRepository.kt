package com.example.data.database

import com.example.domain.models.Habit
import com.example.domain.repositories.IHabitsRepository
import com.example.domain.utils.DateUtils
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class HabitsRepository(private val habitDatabase: HabitDatabase,
                       private val habitConverter: HabitConverter): IHabitsRepository {
    val habitsFlow: Flow<List<Habit>> = habitDatabase.habitsDAO().getAllHabits().map { list -> list.map { dbHabit -> habitConverter.dbHabitToHabit(dbHabit) } }

    suspend fun getHabitUidById(id: Long): String? {
        return habitDatabase.habitsDAO().getHabitById(id).uid
    }

    suspend fun addHabit(habit: Habit): Long {
        val dbHabit = habitConverter.habitToDbHabit(habit)
        return habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun removeHabit(habit: Habit) {
        val dbHabit = habitConverter.habitToDbHabit(habit)
        habitDatabase.habitsDAO().deleteHabit(dbHabit)
    }

    suspend fun changeHabit(newHabit: Habit) {
        val dbHabit = habitConverter.habitToDbHabit(newHabit)
        habitDatabase.habitsDAO().updateHabit(dbHabit)
        // TODO Понять почему это было так
        // habitDatabase.habitsDAO().deleteHabit(dbHabit)
        // habitDatabase.habitsDAO().insertHabit(dbHabit)
    }

    suspend fun completeHabit(habit: Habit, date: Long): Int {
        val completion = habitConverter.getCompletionByHabit(habit, date)
        habitDatabase.habitsCompletionDAO().insert(completion)
        val dateFrom = DateUtils.getFromDate(dateNow = date, habitPeriodInDays = habit.period)
        val result = habitDatabase.habitsCompletionDAO().getCompletionCountByHabitId(habit.id, dateFrom)
        return result
    }

    override suspend fun clearHabits() {
        habitDatabase.habitsDAO().clear()
    }
}
