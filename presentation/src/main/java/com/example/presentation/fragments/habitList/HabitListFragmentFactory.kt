package com.example.presentation.fragments.habitList

import com.example.data.database.HabitsRepository
import com.example.domain.models.HabitType
import kotlinx.coroutines.GlobalScope

class HabitListFragmentFactory(private val habitsRepository: HabitsRepository) {
    fun createHabitListFragment(type: HabitType): HabitListFragment {
        return HabitListFragment.newInstansce(type, habitsRepository, GlobalScope.coroutineContext)
    }
}