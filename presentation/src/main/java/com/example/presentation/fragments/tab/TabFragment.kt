package com.example.presentation.fragments.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.presentation.R
import com.example.domain.models.HabitType
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabFragment : Fragment() {
    private lateinit var viewPager: ViewPager2
    private lateinit var habitPagerAdapter: HabitPagerAdapter

    companion object {
        fun newInstance(habitPagerAdapter: HabitPagerAdapter): TabFragment{
            val args = Bundle()
            val fragment = TabFragment()
            fragment.arguments = args
            fragment.habitPagerAdapter = habitPagerAdapter
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tab_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = view.findViewById(R.id.habitsViewPager)
        viewPager.adapter = habitPagerAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position -> tab.text = when(position) {
            0 -> HabitType.GOOD.repr
            1 -> HabitType.BAD.repr
            else -> throw IllegalArgumentException("Can`t find label for tab position $position")
        } }.attach()
    }

    fun setNameFiler(nameFilter: String) {
        habitPagerAdapter.setNameFilter(nameFilter)
    }
}
