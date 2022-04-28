package com.example.appproject

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.doOnTextChanged
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.module.AppGlideModule
import com.example.appproject.fragments.*
import com.example.appproject.remote.habit.service.RemoteHabitRepository
import com.example.appproject.remote.habit.service.RemoteSyncService
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(), HabitsEditorCallback, HabitListCallback {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var drawerToggle: ActionBarDrawerToggle
    private lateinit var tabFragment: TabFragment
    private lateinit var editorFragment: HabitsEditorFragment
    private var appInfoFragment: AppInfoFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_sheet_wrapper)
        if (savedInstanceState == null) {
            HabitsRepository(applicationContext, this)
            tabFragment = TabFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_layout, tabFragment)
                .commit()

            // Синхронизируем привычки
            GlobalScope.launch(Dispatchers.IO) { delay(1000); RemoteSyncService.syncLocalAndRemote() }
        } else {
            tabFragment = TabFragment.INSTANCE!!
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
                R.id.menu_clear_habits_local -> menuClearLocalHabitsClicked()
                R.id.menu_clear_habits_remote -> menuClearRemoteHabitsClicked()
                R.id.menu_sync_habits -> menuSyncHabitsClicked()
                else -> throw IllegalArgumentException("Wrong menu item id ${it.itemId}")
            }
            true
        }
        loadUserAvatar(navView.getHeaderView(0).findViewById<ImageView>(R.id.avatarImageView))
        findViewById<FloatingActionButton>(R.id.new_habit_button).apply { setOnClickListener { onNewHabitButtonClicked() } }
        findViewById<ConstraintLayout>(R.id.bottom_sheet).findViewById<EditText>(R.id.bottom_sheet_filter_name_editor)
            .doOnTextChanged { text, _, _, _ -> onNameFilterSet(text.toString()) }
    }

    override fun onHabitCreated(habit: Habit, position: Int) {
        startHabitsLists()
    }

    override fun onHabitEdited(oldHabit: Habit, newHabit: Habit, oldPosition: Int) {
        startHabitsLists()
    }

    override fun onItemClicked(habit: Habit, position: Int) {
        startEditorFragment(habit, position)
    }

    private fun onNewHabitButtonClicked() {
        startEditorFragment()
    }

    private fun startEditorFragment(habit: Habit? = null, position: Int = 0) {
        hideBottomSheet()
        editorFragment = if (HabitsEditorFragment.INSTANCE == null) {
            HabitsEditorFragment.newInstance(habit, position)
        } else {
            HabitsEditorFragment.INSTANCE!!
        }
        supportFragmentManager.beginTransaction()
            .hide(tabFragment)
            .add(R.id.fragment_layout, editorFragment)
            .commitNow()
        if (habit != null) {
            editorFragment.setUpWithHabit(habit, position)
        } else {
            editorFragment.setUpWithoutHabit()
        }
    }

    private fun startHabitsLists() {
        editorFragment = HabitsEditorFragment.INSTANCE!!
        supportFragmentManager.beginTransaction()
            .remove(editorFragment)
            .show(tabFragment)
            .commit()
        showBottomSheet()
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

    private fun hideBottomSheet() {
        findViewById<ConstraintLayout>(R.id.bottom_sheet).visibility = View.INVISIBLE
        findViewById<FloatingActionButton>(R.id.new_habit_button).visibility = View.INVISIBLE
    }

    private fun showBottomSheet() {
        findViewById<ConstraintLayout>(R.id.bottom_sheet).visibility = View.VISIBLE
        findViewById<FloatingActionButton>(R.id.new_habit_button).visibility = View.VISIBLE
    }

    private fun onNameFilterSet(nameFilter: String) {
        tabFragment.setNameFiler(nameFilter)
    }

    private fun menuClearLocalHabitsClicked() {
        GlobalScope.launch(Dispatchers.IO) { HabitsRepository.clearHabits() }
    }

    private fun menuClearRemoteHabitsClicked() {
        GlobalScope.launch(Dispatchers.IO) { RemoteHabitRepository.clearHabits() }
    }

    private fun menuSyncHabitsClicked() {
        GlobalScope.launch(Dispatchers.IO) { RemoteSyncService.syncLocalAndRemote() }
    }

    private fun loadUserAvatar(avatarView: ImageView) {
        Glide.with(applicationContext)
            .load("https://images.unsplash.com/photo-1601247387431-7966d811f30b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cmFjY29vbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
            .placeholder(R.drawable.imagenotfound)
            .error(R.drawable.imagenotfound)
            .override(100, 100)
            .centerCrop()
            .transform(CircleCrop())
            .into(avatarView)
    }
}
