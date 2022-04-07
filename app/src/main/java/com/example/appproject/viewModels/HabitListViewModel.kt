package com.example.appproject.viewModels

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appproject.Habit
import com.example.appproject.HabitType
import com.example.appproject.HabitsRepository

class HabitListViewModel(private val habitsRepository: HabitsRepository,
                         private val filterByType: HabitType,
                         private var filterByName: String,
                         lifecycleOwner: LifecycleOwner) : ViewModel() {
    val habitsList: MutableLiveData<List<Habit>> = MutableLiveData()
    init {
        habitsRepository.habits.observe(lifecycleOwner) { habits -> updateHabitsList(habits) }
    }

    fun getHabitsCount(): Int {
        return habitsRepository.getHabitsCount()
    }

    fun setNameFilter(nameFilter: String) {
        filterByName = nameFilter
        habitsList.value = filterHabits(habitsRepository.habits.value ?: listOf())
    }

    private fun updateHabitsList(habits: List<Habit>) {
        habitsList.value = filterHabits(habits)
    }

    private fun filterHabits(habitsToFilter: List<Habit>): List<Habit> {
        val filteredByType = habitsToFilter.filter { habit -> habit.type == filterByType }
        val filteredByName = if (filterByName != "") {
            filteredByType.filter { habit -> habit.name.contains(filterByName, ignoreCase = true) }
        } else {
            filteredByType
        }
        return filteredByName
    }
}
