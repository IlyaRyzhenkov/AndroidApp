package com.example.appproject

import com.example.appproject.viewModels.HabitListObserverViewModel

object HabitsRepository {
    private val habits: ArrayList<Habit> = arrayListOf()
    private val viewModels: ArrayList<HabitListObserverViewModel> = arrayListOf()

    fun getHabits(typeFilter: HabitType?=null, nameFilter: String=""): List<Habit> {
        val filteredByType = if (typeFilter != null) {
           habits.filter { habit -> habit.type == typeFilter }
        } else {
            habits
        }
        val filteredByName = if (nameFilter != "") {
            filteredByType.filter { habit -> habit.name.contains(nameFilter, ignoreCase = true) }
        } else {
            filteredByType
        }
        return filteredByName
    }

    fun getHabitsCount(): Int {
        return habits.size
    }

    fun addHabit(habit: Habit) {
        habits.add(habit)
        for (viewModel in viewModels) {
            viewModel.onItemAdded(habit)
        }
    }

    fun removeHabit(position: Int) {
        habits.removeAt(position)
        for (viewModel in viewModels) {
            viewModel.onItemRemoved(position)
        }
    }

    fun changeHabit(oldHabit: Habit, newHabit: Habit, position: Int) {
        habits[position] = newHabit
        for (viewModel in viewModels) {
            viewModel.onItemChanged(oldHabit, newHabit, position)
        }
    }

    fun subscribe(viewModel: HabitListObserverViewModel) {
        viewModels.add(viewModel)
    }

    fun unsubscribe(viewModel: HabitListObserverViewModel) {
        viewModels.remove(viewModel)
    }
}
