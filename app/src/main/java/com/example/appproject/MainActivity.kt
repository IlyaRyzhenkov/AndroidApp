package com.example.appproject

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.Objects

class MainActivity : Activity() {
    private lateinit var habitListView: RecyclerView
    private var habits: ArrayList<Habit> = arrayListOf()
    private var habitsListAdapter = HabitListAdapter(habits, this::clickItem)

    companion object {
        const val HABIT_INTENT_HEADER = "HABIT"
        const val HABIT_LIST_HEADER = "HABITS"
        const val HABIT_POSITION_INTENT_HEADER = "HABIT_POSITION"

        const val ACTIVITY_HABIT_EDITOR_REQUEST_CODE = 100

        const val DEFAULT_POSITION_CODE = -1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        habitListView = findViewById(R.id.habit_list)
        habitListView.adapter = habitsListAdapter
        val newHabitFab: FloatingActionButton = findViewById(R.id.new_habit_button)
        newHabitFab.setOnClickListener { openEditActivity(null, DEFAULT_POSITION_CODE) }
        habitListView
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelableArrayList(HABIT_LIST_HEADER, habits)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        habits = savedInstanceState.getParcelableArrayList(HABIT_LIST_HEADER) ?: arrayListOf()
        habitsListAdapter = HabitListAdapter(habits, this::clickItem)
        habitListView.adapter = habitsListAdapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ACTIVITY_HABIT_EDITOR_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    val habit: Habit? = data.getParcelableExtra(HABIT_INTENT_HEADER)
                    val position = data.getIntExtra(HABIT_POSITION_INTENT_HEADER, DEFAULT_POSITION_CODE)
                    if (habit != null) {
                        if (position != DEFAULT_POSITION_CODE) {
                            habits[position] = habit
                            habitsListAdapter.notifyItemChanged(position)
                        } else {
                            habits.add(habit)
                            habitsListAdapter.notifyItemInserted(habits.size)
                        }
                    }
                }
            }
        }
    }

    private fun openEditActivity(habit: Habit?, position: Int) {
        val sendIntent = Intent(this, HabitEditionActivity::class.java)
            .apply {
                val bundle = Bundle().apply {
                    putParcelable(HABIT_INTENT_HEADER, habit)
                    putInt(HABIT_POSITION_INTENT_HEADER, position)
                }
                putExtras(bundle)
            }
        startActivityForResult(sendIntent, ACTIVITY_HABIT_EDITOR_REQUEST_CODE)
    }

    private fun clickItem(habit: Habit, position: Int) {
        openEditActivity(habit, position)
    }
}
