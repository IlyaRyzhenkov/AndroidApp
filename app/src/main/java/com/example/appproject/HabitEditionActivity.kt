package com.example.appproject

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import com.example.appproject.MainActivity.Companion.DEFAULT_POSITION_CODE
import com.example.appproject.MainActivity.Companion.HABIT_INTENT_HEADER
import com.example.appproject.MainActivity.Companion.HABIT_POSITION_INTENT_HEADER

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

class HabitEditionActivity : AppCompatActivity() {
    private lateinit var habitNameEditTextView: TextView
    private lateinit var habitDescriptionEditTextView: TextView
    private lateinit var habitPrioritySeekBar: SeekBar
    private lateinit var habitTypeRadioGroup: RadioGroup
    private lateinit var habitPeriodEditTextView: TextView
    private lateinit var habitCounterEditTextView: TextView
    private lateinit var habitColorPickerView: ImageView
    private lateinit var habitColorPickerRGBView: TextView

    private var habitColor: Int = 0XFF00FFFF.toInt()

    private var position: Int = DEFAULT_POSITION_CODE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit_edition)
        habitNameEditTextView = findViewById(R.id.editTextHabitName)
        habitDescriptionEditTextView = findViewById(R.id.editTextHabitDescr)
        habitPrioritySeekBar = findViewById(R.id.seekBar)
        habitTypeRadioGroup = findViewById(R.id.radioGroup)
        habitPeriodEditTextView = findViewById(R.id.editTextHabitPeriod)
        habitCounterEditTextView = findViewById(R.id.editTextHabitCounter)
        initColorPicker()
        findViewById<Button>(R.id.HabitCreateButton).setOnClickListener { createHabit() }

        val habit: Habit? = intent.getParcelableExtra(HABIT_INTENT_HEADER)
        position = intent.getIntExtra(HABIT_POSITION_INTENT_HEADER, DEFAULT_POSITION_CODE)
        if (habit != null) {
            setUpWithHabit(habit)
        }
    }

    private fun setUpWithHabit(habit: Habit) {
        habitNameEditTextView.text = habit.name
        habitDescriptionEditTextView.text = habit.description
        habitPrioritySeekBar.progress = habit.priority
        habitTypeRadioGroup.check(RadiobuttonsToHabitTypes.getIdByType(habit.type))
        habitPeriodEditTextView.text = habit.period.toString()
        habitCounterEditTextView.text = habit.counter.toString()
        onClickColorPicker(habit.color)

        findViewById<Button>(R.id.HabitCreateButton).text = getString(R.string.habit_edit_button_text)
        findViewById<TextView>(R.id.habitEditHeader).text = getString(R.string.habit_edit_header_text)
    }

    private fun createHabit() {
        val habit = createHabitFromViews()
        val sendIntent = Intent().apply {
            putExtra(HABIT_INTENT_HEADER, habit)
            putExtra(HABIT_POSITION_INTENT_HEADER, position)
        }
        setResult(RESULT_OK, sendIntent)
        finish()
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

    private fun initColorPicker() {
        val gradient = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
            intArrayOf(
                0XFFFF0000.toInt(),
                0XFFFFFF00.toInt(),
                0XFF00FF00.toInt(),
                0XFF00FFFF.toInt(),
                0XFF0000FF.toInt(),
                0XFFFF00FF.toInt(),
                0XFFFF0000.toInt()))
        findViewById<LinearLayout>(R.id.colorPickerItemsLayout).background = gradient
        habitColorPickerView = findViewById(R.id.pickedColor)
        habitColorPickerRGBView = findViewById(R.id.HabitColorRGB)

        //Init views with default color
        onClickColorPicker(getColor(R.color.color1))

        //set handlers
        findViewById<ImageView>(R.id.colorPickerColor1).setOnClickListener {onClickColorPicker(getColor(R.color.color1))}
        findViewById<ImageView>(R.id.colorPickerColor2).setOnClickListener {onClickColorPicker(getColor(R.color.color2))}
        findViewById<ImageView>(R.id.colorPickerColor3).setOnClickListener {onClickColorPicker(getColor(R.color.color3))}
        findViewById<ImageView>(R.id.colorPickerColor4).setOnClickListener {onClickColorPicker(getColor(R.color.color4))}
        findViewById<ImageView>(R.id.colorPickerColor5).setOnClickListener {onClickColorPicker(getColor(R.color.color5))}
        findViewById<ImageView>(R.id.colorPickerColor6).setOnClickListener {onClickColorPicker(getColor(R.color.color6))}
        findViewById<ImageView>(R.id.colorPickerColor7).setOnClickListener {onClickColorPicker(getColor(R.color.color7))}
        findViewById<ImageView>(R.id.colorPickerColor8).setOnClickListener {onClickColorPicker(getColor(R.color.color8))}
        findViewById<ImageView>(R.id.colorPickerColor9).setOnClickListener {onClickColorPicker(getColor(R.color.color9))}
        findViewById<ImageView>(R.id.colorPickerColor10).setOnClickListener {onClickColorPicker(getColor(R.color.color10))}
        findViewById<ImageView>(R.id.colorPickerColor11).setOnClickListener {onClickColorPicker(getColor(R.color.color11))}
        findViewById<ImageView>(R.id.colorPickerColor12).setOnClickListener {onClickColorPicker(getColor(R.color.color12))}
        findViewById<ImageView>(R.id.colorPickerColor13).setOnClickListener {onClickColorPicker(getColor(R.color.color13))}
        findViewById<ImageView>(R.id.colorPickerColor14).setOnClickListener {onClickColorPicker(getColor(R.color.color14))}
        findViewById<ImageView>(R.id.colorPickerColor15).setOnClickListener {onClickColorPicker(getColor(R.color.color15))}
        findViewById<ImageView>(R.id.colorPickerColor16).setOnClickListener {onClickColorPicker(getColor(R.color.color16))}
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
