package com.example.appproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HabitListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val habitNameView: TextView = itemView.findViewById(R.id.habit_name)
    private val habitDescriptionView: TextView = itemView.findViewById(R.id.habit_description)
    private val habitPeriodView: TextView = itemView.findViewById(R.id.habit_period)
    private val habitPriorityView: TextView = itemView.findViewById(R.id.habit_priority)
    private val habitTypeView: TextView = itemView.findViewById(R.id.habit_type)
    private val habitCounterView: TextView = itemView.findViewById(R.id.habit_counter)

    private val defaultPeriodText: String
    private val defaultPriorityText: String
    private val defaultCounterText: String
    private val defaultTypeText: String

    private val goodHabitRepr: String
    private val badHabitRepr: String

    init {
        val res = itemView.resources
        defaultPeriodText = res.getString(R.string.habit_period)
        defaultPriorityText = res.getString(R.string.habit_priority)
        defaultCounterText = res.getString(R.string.habit_counter)
        defaultTypeText = res.getString(R.string.habit_type)
        goodHabitRepr = res.getString(R.string.good_habit_repr)
        badHabitRepr = res.getString(R.string.bad_habit_repr)
    }

    fun bind(habit: Habit) {
        habitNameView.text = habit.name
        habitNameView.setTextColor(habit.color)

        habitDescriptionView.text = habit.description
        habitPeriodView.text = getPeriodText(habit.period)
        habitPriorityView.text = getPriorityText(habit.priority)
        habitTypeView.text = getTypeText(habit.type)
        habitCounterView.text = getCounterText(habit.counter)
    }

    private fun getPeriodText(period: Int) : String {
        return "$defaultPeriodText $period"
    }

    private fun getPriorityText(priority: Int) : String {
        return "$defaultPriorityText $priority"
    }

    private fun getTypeText(habitType: HabitType) : String {
        val habitTypeRepr = when (habitType) {
            HabitType.GOOD -> goodHabitRepr
            HabitType.BAD -> badHabitRepr
        }
        return "$defaultTypeText $habitTypeRepr"
    }

    private fun getCounterText(counter: Int): String {
        return "$defaultCounterText $counter"
    }
}

class HabitListAdapter(
    private val habits: MutableList<Habit>,
    private val clickListener: (Habit, Int) -> Unit
) : RecyclerView.Adapter<HabitListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HabitListViewHolder(inflater.inflate(R.layout.habit_list_element, parent, false))
    }

    override fun getItemCount(): Int = habits.size

    override fun onBindViewHolder(holder: HabitListViewHolder, position: Int) {
        holder.bind(habits[position])
        holder.itemView.setOnClickListener { clickListener(habits[position], position) }
    }
}
