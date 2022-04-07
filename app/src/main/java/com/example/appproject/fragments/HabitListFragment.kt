package com.example.appproject.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.appproject.*
import com.example.appproject.viewModels.HabitListViewModel

class HabitListFragment : Fragment() {
    private lateinit var habitsListViewModel: HabitListViewModel
    private lateinit var habitType: HabitType
    private var nameFilter: String = ""

    private var callback: HabitListCallback? = null

    private lateinit var habitListView: RecyclerView
    private lateinit var habitListAdapter: HabitListAdapter

    companion object {
        private val HABIT_TYPE_BUNDLE = "HABIT_TYPE"

        fun newInstansce(habitType: HabitType) : HabitListFragment {
            val fragment = HabitListFragment()
            val bundle = Bundle().apply { putEnum(HABIT_TYPE_BUNDLE, habitType) }
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        habitType = arguments!!.getEnum(HABIT_TYPE_BUNDLE, HabitType.BAD)
        val fragment = this
        habitsListViewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return HabitListViewModel(HabitsRepository, habitType, nameFilter, fragment) as T
            }
        }).get(HabitListViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.element_list_fragment, container, false)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        habitListView = view.findViewById(R.id.habit_list)
        habitListAdapter = HabitListAdapter(habitsListViewModel.habitsList.value ?: listOf(), this::onItemClick)
        habitListView.adapter = habitListAdapter
        habitsListViewModel.habitsList.observe(this) {
            habitListAdapter.habits = it
            habitListAdapter.notifyDataSetChanged()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callback = activity as HabitListCallback
    }

    fun setNameFilter(nameFilter: String) {
        this.nameFilter = nameFilter
        if (this::habitsListViewModel.isInitialized) {
            habitsListViewModel.setNameFilter(nameFilter)
        }
    }

    private fun onItemClick(habit: Habit, position : Int) {
        callback?.onItemClicked(habit, position)
    }
}
