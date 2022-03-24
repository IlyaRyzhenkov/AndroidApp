package com.example.appproject.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appproject.Habit
import com.example.appproject.HabitType

class HabitsRepositoryFragment : Fragment() {
    private val habitsByType : MutableMap<HabitType, MutableList<Habit>> = getHabitsByTypeMap()
    var callback: HabitsRepositoryCallback? = null

    companion object {
        fun newInstance() : HabitsRepositoryFragment {
            val args = Bundle()
            val fragment = HabitsRepositoryFragment()
            fragment.arguments = args
            return fragment
        }

        private fun getHabitsByTypeMap() : MutableMap<HabitType, MutableList<Habit>> {
            val map = HashMap<HabitType, MutableList<Habit>>()
            for (type in HabitType.values()) {
                map[type] = mutableListOf()
            }
            return map
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callback = activity as HabitsRepositoryCallback
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun insertHabit(habit : Habit, position: Int) {
        val index = habitsByType[habit.type]!!.size
        habitsByType[habit.type]?.add(habit)
        callback?.onHabitInserted(habit, index)
    }

    fun changeHabit(oldHabit : Habit, newHabit: Habit, oldPosition: Int) {
        if (oldHabit.type == newHabit.type) {
            habitsByType[newHabit.type]!![oldPosition] = newHabit
            callback?.onHabitChanged(newHabit, oldPosition)
        } else {
            habitsByType[oldHabit.type]?.removeAt(oldPosition)
            callback?.onHabitDeleted(oldHabit, oldPosition)

            val index = habitsByType[newHabit.type]?.size ?: 0
            habitsByType[newHabit.type]?.add(newHabit)
            callback?.onHabitInserted(newHabit, index)
        }
    }

    fun getHabitsByType(type: HabitType) : MutableList<Habit> {
        return habitsByType[type] ?: mutableListOf()
    }

    private fun putHabitsByType(habits: List<Habit>) {
        for (habit in habits) {
            habitsByType[habit.type]?.add(habit)
        }
    }

    private fun getAllSavedHabits() : List<Habit> {
        val allHabits = mutableListOf<Habit>()
        for (habits in habitsByType) {
            allHabits.addAll(habits.value)
        }
        return allHabits
    }
}
