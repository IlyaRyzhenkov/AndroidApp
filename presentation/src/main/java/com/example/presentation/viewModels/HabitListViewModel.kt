package com.example.presentation.viewModels

import androidx.lifecycle.*
import com.example.data.database.HabitsRepository
import com.example.domain.models.Habit
import com.example.domain.models.HabitType
import kotlin.coroutines.CoroutineContext

class HabitListViewModel(private val habitsRepository: HabitsRepository,
                         private val filterByType: HabitType,
                         private var filterByName: String,
                         lifecycleOwner: LifecycleOwner,
                         coroutineContext: CoroutineContext,
) : ViewModel() {
    val habitsFlow = habitsRepository.habitsFlow.asLiveData(coroutineContext)
    val habitsList: MutableLiveData<List<Habit>> = MutableLiveData()
    var lastHabitsList: List<Habit> = emptyList()
    init {
        habitsFlow.observe(lifecycleOwner) { habits -> updateHabitsList(habits) }
    }


    fun setNameFilter(nameFilter: String) {
        filterByName = nameFilter
        habitsList.value = filterHabits(lastHabitsList ?: listOf())
    }

    private fun updateHabitsList(habits: List<Habit>) {
        lastHabitsList = habits
        habitsList.value = filterHabits(lastHabitsList)
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
