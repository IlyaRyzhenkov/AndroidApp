package com.example.appproject.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appproject.Habit
import com.example.appproject.HabitType
import com.example.appproject.HabitsRepository

class HabitListViewModel(private val habitsRepository: HabitsRepository,
                         private val filterByType: HabitType,
                         private var filterByName: String) : ViewModel(), HabitListObserverViewModel {
    val habitsList: MutableLiveData<List<Habit>> = MutableLiveData()
    init {
        habitsRepository.subscribe(this)
        habitsList.value = habitsRepository.getHabits(filterByType, filterByName)
    }

    override fun onItemAdded(habit: Habit) {
        habitsList.value = habitsRepository.getHabits(filterByType, filterByName)
    }

    override fun onItemChanged(oldHabit: Habit, newHabit: Habit, position: Int) {
        habitsList.value = habitsRepository.getHabits(filterByType, filterByName)
    }

    override fun onItemRemoved(position: Int) {
        habitsList.value = habitsRepository.getHabits(filterByType, filterByName)
    }

    override fun onCleared() {
        super.onCleared()
        habitsRepository.unsubscribe(this)
    }

    fun getHabitsCount(): Int {
        return habitsRepository.getHabitsCount()
    }

    fun setNameFilter(nameFilter: String) {
        filterByName = nameFilter
        habitsList.value = habitsRepository.getHabits(filterByType, filterByName)
    }
}
