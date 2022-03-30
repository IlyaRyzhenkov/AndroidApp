package com.example.appproject.fragments

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appproject.HabitType

class HabitPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    private val goodHabitFragment = HabitListFragment.newInstansce(HabitType.GOOD)
    private val badHabitFragment = HabitListFragment.newInstansce(HabitType.BAD)

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
