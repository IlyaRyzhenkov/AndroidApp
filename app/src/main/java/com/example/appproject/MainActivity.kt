package com.example.appproject

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.appproject.fragments.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), HabitsRepositoryCallback, HabitsEditorCallback, HabitListCallback {
    lateinit var habitsRepository : HabitsRepositoryFragment
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var drawerToggle: ActionBarDrawerToggle
    private lateinit var tabFragment: TabFragment
    private lateinit var editorFragment: HabitsEditorFragment
    private var appInfoFragment: AppInfoFragment? = null

    private val HABIT_REPOSITORY_TAG = "HABIT_REPOSITORY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            habitsRepository = HabitsRepositoryFragment.newInstance()
            tabFragment = TabFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .add(habitsRepository, HABIT_REPOSITORY_TAG)
                .add(R.id.fragment_layout, tabFragment)
                .commit()
        }
        drawerLayout = findViewById(R.id.main_layout)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open, R.string.menu_close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navView = findViewById<NavigationView>(R.id.navigation_view)
        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menu_habits -> menuHabitsClicked()
                R.id.menu_app_info -> menuAppInfoClicked()
                else -> throw IllegalArgumentException("Wrong menu item id ${it.itemId}")
            }
            true
        }
    }

    override fun onHabitCreated(habit: Habit, position: Int) {
        habitsRepository.insertHabit(habit, position)
        startHabitsLists()
    }

    override fun onHabitEdited(oldHabit: Habit, newHabit: Habit, oldPosition: Int) {
        habitsRepository.changeHabit(oldHabit, newHabit, oldPosition)
        startHabitsLists()
    }

    override fun onHabitInserted(habit: Habit, position: Int) {
        tabFragment.notifyItemInserted(habit, position)
    }

    override fun onHabitChanged(habit: Habit, position: Int) {
        tabFragment.notifyItemChanged(habit, position)
    }

    override fun onHabitDeleted(habit: Habit, position: Int) {
        tabFragment.notifyItemDeleted(habit, position)
    }

    override fun onItemClicked(habit: Habit, position: Int) {
        startEditorFragment(habit, position)
    }

    override fun onNewHabitButtonClicked(positionToAdd: Int) {
        startEditorFragment(position = positionToAdd)
    }

    private fun startEditorFragment(habit: Habit? = null, position: Int) {
        editorFragment = HabitsEditorFragment.newInstance(habit, position)
        supportFragmentManager.beginTransaction()
            .hide(tabFragment)
            .add(R.id.fragment_layout, editorFragment)
            .commit()
    }

    private fun startHabitsLists() {
        tabFragment
        supportFragmentManager.beginTransaction()
            .remove(editorFragment)
            .show(tabFragment)
            .commit()
    }

    private fun menuHabitsClicked() {
        val transaction = supportFragmentManager.beginTransaction()
            .show(tabFragment)
        if (appInfoFragment != null) {
            transaction.remove(appInfoFragment!!)
        }
        transaction.commit()
    }

    private fun menuAppInfoClicked() {
        val transaction = supportFragmentManager.beginTransaction()
        if (appInfoFragment == null) {
            appInfoFragment = AppInfoFragment.newInstance()
            transaction.add(R.id.fragment_layout, appInfoFragment!!)
        } else {
            transaction.show(appInfoFragment!!)
        }
        transaction.hide(tabFragment).commit()
    }
}
