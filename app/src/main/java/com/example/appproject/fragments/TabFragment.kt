package com.example.appproject.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.appproject.Habit
import com.example.appproject.HabitType
import com.example.appproject.MainActivity
import com.example.appproject.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabFragment : Fragment() {
    private lateinit var viewPager: ViewPager2
    private lateinit var habitsRepository: HabitsRepositoryFragment
    private lateinit var habitPagerAdapter: HabitPagerAdapter

    companion object {
        fun newInstance(): TabFragment{
            val args = Bundle()
            val fragment = TabFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tab_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = view.findViewById(R.id.habitsViewPager)
        habitPagerAdapter = HabitPagerAdapter(activity as AppCompatActivity, habitsRepository)
        viewPager.adapter = habitPagerAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position -> tab.text = when(position) {
            0 -> HabitType.GOOD.repr
            1 -> HabitType.BAD.repr
            else -> throw IllegalArgumentException("Can`t find label for tab position $position")
        } }.attach()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        habitsRepository = (activity as MainActivity).habitsRepository
    }

    fun notifyItemInserted(habit: Habit, position: Int) {
        val fragment = habitPagerAdapter.getFragmentByType(habit.type)
        fragment.onItemAdded(position)
    }

    fun notifyItemChanged(habit: Habit, position: Int) {
        val fragment = habitPagerAdapter.getFragmentByType(habit.type)
        fragment.onItemChanged(position)
    }

    fun notifyItemDeleted(habit: Habit, position: Int) {
        val fragment = habitPagerAdapter.getFragmentByType(habit.type)
        fragment.onItemDeleted(position)
    }
}
