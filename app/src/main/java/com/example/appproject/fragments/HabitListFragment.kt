package com.example.appproject.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.appproject.Habit
import com.example.appproject.HabitListAdapter
import com.example.appproject.HabitType
import com.example.appproject.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HabitListFragment(var habitType: HabitType, var habits: MutableList<Habit>) : Fragment() {
    var callback: HabitListCallback? = null
    private lateinit var habitListView: RecyclerView
    private val habitListAdapter = HabitListAdapter(habits, this::onItemClick)

    companion object {
        fun newInstansce(habitType: HabitType, habits: MutableList<Habit>) : HabitListFragment {
            return HabitListFragment(habitType, habits)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.element_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        habitListView = view.findViewById(R.id.habit_list)
        habitListView.adapter = habitListAdapter
        view.findViewById<FloatingActionButton>(R.id.new_habit_button).setOnClickListener { openEditFragment() }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callback = activity as HabitListCallback
    }

    fun onItemAdded(position: Int) {
        habitListAdapter.notifyItemInserted(position)
    }

    fun onItemChanged(position: Int) {
        habitListAdapter.notifyItemChanged(position)
    }

    fun onItemDeleted(position: Int) {
        habitListAdapter.notifyItemRemoved(position)
    }

    private fun onItemClick(habit: Habit, position : Int) {
        callback?.onItemClicked(habit, position)
    }

    private fun openEditFragment() {
        callback?.onNewHabitButtonClicked(habits.size)
    }
}
