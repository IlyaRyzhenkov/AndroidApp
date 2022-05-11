package com.example.presentation.fragments.tab

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.domain.models.HabitType
import com.example.presentation.fragments.habitList.HabitListFragment
import com.example.presentation.fragments.habitList.HabitListFragmentFactory

class HabitPagerAdapter(activity: AppCompatActivity, habitListFragmentFactory: HabitListFragmentFactory) : FragmentStateAdapter(activity) {
    private val goodHabitFragment = habitListFragmentFactory.createHabitListFragment(HabitType.GOOD)
    private val badHabitFragment = habitListFragmentFactory.createHabitListFragment(HabitType.BAD)

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> goodHabitFragment
        1 -> badHabitFragment
        else -> throw IllegalArgumentException("Cant bind habit type to tab position $position")
    }

    fun getFragmentByType(type: HabitType) : HabitListFragment = when(type) {
        HabitType.GOOD -> goodHabitFragment
        HabitType.BAD -> badHabitFragment
    }

    fun setNameFilter(nameFilter: String) {
        goodHabitFragment.setNameFilter(nameFilter)
        badHabitFragment.setNameFilter(nameFilter)
    }
}
