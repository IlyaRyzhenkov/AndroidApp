package com.example.presentation.activities

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
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.data.DaggerDataComponent
import com.example.data.DataComponent
import com.example.data.DataModule
import com.example.domain.DaggerOperationsComponent
import com.example.domain.DomainModule
import com.example.domain.OperationsComponent
import com.example.domain.models.Habit
import com.example.domain.operations.OperationFactory
import com.example.presentation.DaggerPresentationComponent
import com.example.presentation.PresentationComponent
import com.example.presentation.PresentationModule
import com.example.presentation.R
import com.example.presentation.fragments.AppInfoFragment
import com.example.presentation.fragments.habitEditor.HabitsEditorCallback
import com.example.presentation.fragments.habitEditor.HabitsEditorFragment
import com.example.presentation.fragments.habitList.HabitListCallback
import com.example.presentation.fragments.tab.TabFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.GlobalScope

class MainActivity : AppCompatActivity(), HabitsEditorCallback, HabitListCallback {
    private lateinit var dataComponent: DataComponent
    private lateinit var operationsComponent: OperationsComponent
    private lateinit var presentationComponent: PresentationComponent

    private lateinit var operationFactory: OperationFactory

    private lateinit var tabFragment: TabFragment
    private lateinit var editorFragment: HabitsEditorFragment
    private var appInfoFragment: AppInfoFragment? = null

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataComponent = DaggerDataComponent.builder().dataModule(
            DataModule(applicationContext, this)).build()
        operationsComponent = DaggerOperationsComponent.builder().domainModule(
            DomainModule(dataComponent.getSyncHabitRepository(), dataComponent.getRemoteSyncService(), GlobalScope)).build()
        presentationComponent = DaggerPresentationComponent.builder().presentationModule(
            PresentationModule(operationsComponent.getOperationFactory(), dataComponent.getHabitsRepository(), this)
        ).build()

        // Синхронизируем привычки
        operationFactory = operationsComponent.getOperationFactory()
        operationFactory.createSyncOperation().run()
        editorFragment = presentationComponent.getHabitsEditorFragment()
        tabFragment = presentationComponent.getTabFragment()

        setContentView(R.layout.bottom_sheet_wrapper)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
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
        supportFragmentManager.beginTransaction()
            .remove(editorFragment)
            .show(tabFragment)
            .commit()
        showBottomSheet()
    }

    private fun menuHabitsClicked() {
        val transaction = supportFragmentManager.beginTransaction().show(tabFragment)
        if (appInfoFragment != null) {
            transaction.remove(appInfoFragment!!)
        }
        transaction.commit()
    }

    private fun menuAppInfoClicked() {
        val transaction = supportFragmentManager.beginTransaction()
        if (appInfoFragment == null) {
            appInfoFragment = presentationComponent.getAppInfoFragment()
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
        // TODO clear local operation
        operationFactory.createSyncOperation().run()
    }

    private fun menuClearRemoteHabitsClicked() {
        // TODO clear remote operation
        operationFactory.createSyncOperation().run()
    }

    private fun menuSyncHabitsClicked() {
        operationFactory.createSyncOperation().run()
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
