package com.example.appproject.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.graphics.drawable.toDrawable
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.Habit
import com.example.appproject.HabitType
import com.example.appproject.HabitsRepository
import com.example.appproject.R
import com.example.appproject.viewModels.HabitEditorViewModel

enum class RadiobuttonsToHabitTypes(val id: Int, val type: HabitType) {
    GOOD_BUTTON(R.id.goodHabitButton, HabitType.GOOD),
    BAD_BUTTON(R.id.badHabitButton, HabitType.BAD);
    companion object {
        fun getTypeById(id: Int) : HabitType {
            for (button in values()) {
                if (button.id == id)
                    return button.type
            }
            throw IllegalArgumentException("Can`t find type, linked to button id $id")
        }

        fun getIdByType(habitType: HabitType) : Int {
            for (button in values()) {
                if (button.type == habitType) {
                    return button.id
                }
            }
            throw IllegalArgumentException("Can`t find id, linked to habit type ${habitType.repr}")
        }
    }
}

class HabitsEditorFragment : Fragment() {
    private lateinit var editViewModel: HabitEditorViewModel
    var callback: HabitsEditorCallback? = null

    var habit: Habit? = null
    var position: Int = 0

    private lateinit var res: Resources
    private lateinit var habitNameEditTextView: TextView
    private lateinit var habitDescriptionEditTextView: TextView
    private lateinit var habitPrioritySeekBar: SeekBar
    private lateinit var habitTypeRadioGroup: RadioGroup
    private lateinit var habitPeriodEditTextView: TextView
    private lateinit var habitCounterEditTextView: TextView
    private lateinit var habitColorPickerView: ImageView
    private lateinit var habitColorPickerRGBView: TextView

    private var habitColor: Int = 0XFF00FFFF.toInt()

    @SuppressLint("StaticFieldLeak")
    companion object {
        private val HABIT_BUNDLE = "HABIT"
        private val POSITION_BUNDLE = "POSITION"

        @SuppressLint("StaticFieldLeak")
        var INSTANCE: HabitsEditorFragment? = null

        fun newInstance(habit: Habit?, position: Int) : HabitsEditorFragment {
            val fragment = HabitsEditorFragment()
            val bundle = Bundle().apply {
                putParcelable(HABIT_BUNDLE, habit)
                putInt(POSITION_BUNDLE, position)
            }
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        habit = arguments!!.getParcelable(HABIT_BUNDLE)
        position = arguments!!.getInt(POSITION_BUNDLE)
        editViewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return HabitEditorViewModel(HabitsRepository) as T
            }
        }).get(HabitEditorViewModel::class.java)
        INSTANCE = this
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callback = activity as HabitsEditorCallback
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_habit_edition, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        res = resources
        habitNameEditTextView = view.findViewById(R.id.editTextHabitName)
        habitDescriptionEditTextView = view.findViewById(R.id.editTextHabitDescr)
        habitPrioritySeekBar = view.findViewById(R.id.seekBar)
        habitTypeRadioGroup = view.findViewById(R.id.radioGroup)
        habitPeriodEditTextView = view.findViewById(R.id.editTextHabitPeriod)
        habitCounterEditTextView = view.findViewById(R.id.editTextHabitCounter)
        initColorPicker(view)
        habit?.let { setUpWithHabit(it, position) }
        view.findViewById<Button>(R.id.HabitCreateButton).setOnClickListener { onButtonClick() }
    }

    fun setUpWithHabit(habit: Habit, position: Int) {
        this.position = position
        this.habit = habit
        habitNameEditTextView.text = habit.name
        habitDescriptionEditTextView.text = habit.description
        habitPrioritySeekBar.progress = habit.priority
        habitTypeRadioGroup.check(RadiobuttonsToHabitTypes.getIdByType(habit.type))
        habitPeriodEditTextView.text = habit.period.toString()
        habitCounterEditTextView.text = habit.counter.toString()
        onClickColorPicker(habit.color)

        view?.findViewById<Button>(R.id.HabitCreateButton)?.text = getString(R.string.habit_edit_button_text)
        view?.findViewById<TextView>(R.id.habitEditHeader)?.text = getString(R.string.habit_edit_header_text)
    }

    private fun createHabitFromViews() : Habit {
        return Habit(
            name = habitNameEditTextView.text.toString(),
            description = habitDescriptionEditTextView.text.toString(),
            priority = habitPrioritySeekBar.progress,
            type = RadiobuttonsToHabitTypes.getTypeById(habitTypeRadioGroup.checkedRadioButtonId),
            period = habitPeriodEditTextView.text.toString().toInt(),
            counter = habitCounterEditTextView.text.toString().toInt(),
            color = habitColor
        )
    }

    private fun onButtonClick() {
        val newHabit = createHabitFromViews()
        editViewModel.onCreateButtonClick(habit, newHabit, position)
        if (habit != null) {
            callback?.onHabitEdited(habit!!, newHabit, position)
        } else {
            callback?.onHabitCreated(newHabit, position)
        }
    }

    private fun initColorPicker(view: View) {
        val gradient = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            intArrayOf(
                0XFFFF0000.toInt(),
                0XFFFFFF00.toInt(),
                0XFF00FF00.toInt(),
                0XFF00FFFF.toInt(),
                0XFF0000FF.toInt(),
                0XFFFF00FF.toInt(),
                0XFFFF0000.toInt()))
        view.findViewById<LinearLayout>(R.id.colorPickerItemsLayout).background = gradient
        habitColorPickerView = view.findViewById(R.id.pickedColor)
        habitColorPickerRGBView = view.findViewById(R.id.HabitColorRGB)

        //Init views with default color
        onClickColorPicker(res.getColor(R.color.color1))

        //set handlers
        view.findViewById<ImageView>(R.id.colorPickerColor1).setOnClickListener {onClickColorPicker(res.getColor(R.color.color1))}
        view.findViewById<ImageView>(R.id.colorPickerColor2).setOnClickListener {onClickColorPicker(res.getColor(R.color.color2))}
        view.findViewById<ImageView>(R.id.colorPickerColor3).setOnClickListener {onClickColorPicker(res.getColor(R.color.color3))}
        view.findViewById<ImageView>(R.id.colorPickerColor4).setOnClickListener {onClickColorPicker(res.getColor(R.color.color4))}
        view.findViewById<ImageView>(R.id.colorPickerColor5).setOnClickListener {onClickColorPicker(res.getColor(R.color.color5))}
        view.findViewById<ImageView>(R.id.colorPickerColor6).setOnClickListener {onClickColorPicker(res.getColor(R.color.color6))}
        view.findViewById<ImageView>(R.id.colorPickerColor7).setOnClickListener {onClickColorPicker(res.getColor(R.color.color7))}
        view.findViewById<ImageView>(R.id.colorPickerColor8).setOnClickListener {onClickColorPicker(res.getColor(R.color.color8))}
        view.findViewById<ImageView>(R.id.colorPickerColor9).setOnClickListener {onClickColorPicker(res.getColor(R.color.color9))}
        view.findViewById<ImageView>(R.id.colorPickerColor10).setOnClickListener {onClickColorPicker(res.getColor(R.color.color10))}
        view.findViewById<ImageView>(R.id.colorPickerColor11).setOnClickListener {onClickColorPicker(res.getColor(R.color.color11))}
        view.findViewById<ImageView>(R.id.colorPickerColor12).setOnClickListener {onClickColorPicker(res.getColor(R.color.color12))}
        view.findViewById<ImageView>(R.id.colorPickerColor13).setOnClickListener {onClickColorPicker(res.getColor(R.color.color13))}
        view.findViewById<ImageView>(R.id.colorPickerColor14).setOnClickListener {onClickColorPicker(res.getColor(R.color.color14))}
        view.findViewById<ImageView>(R.id.colorPickerColor15).setOnClickListener {onClickColorPicker(res.getColor(R.color.color15))}
        view.findViewById<ImageView>(R.id.colorPickerColor16).setOnClickListener {onClickColorPicker(res.getColor(R.color.color16))}
    }

    private fun onClickColorPicker(intColor: Int) {
        val color = Color.valueOf(intColor)
        habitColor = intColor
        habitColorPickerView.background = color.toDrawable()
        habitColorPickerRGBView.text = "(R:${colorToInt(color.red())}, G:${colorToInt(color.green())}, B:${colorToInt(color.blue())})"
    }

    private fun colorToInt(color: Float) : Int {
        return (color * 255).toInt()
    }
}
