package com.example.presentation

import androidx.appcompat.app.AppCompatActivity
import com.example.data.database.HabitsRepository
import com.example.domain.DomainModule
import com.example.domain.operations.habit.HabitOperationFactory
import com.example.presentation.fragments.AppInfoFragment
import com.example.presentation.fragments.habitEditor.HabitsEditorFragment
import com.example.presentation.fragments.habitList.HabitListFragmentFactory
import com.example.presentation.fragments.tab.HabitPagerAdapter
import com.example.presentation.fragments.tab.TabFragment
import com.example.presentation.service.ToastService
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresentationModule(private val habitOperationFactory: HabitOperationFactory, private val habitsRepository: HabitsRepository,
                         private val activity: AppCompatActivity) {
    @Provides
    @Singleton
    fun provideHabitsEditorFragment(): HabitsEditorFragment {
        return HabitsEditorFragment.newInstance(habitOperationFactory)
    }

    @Provides
    @Singleton
    fun provideTabFragment(habitPagerAdapter: HabitPagerAdapter): TabFragment {
        return TabFragment.newInstance(habitPagerAdapter)
    }

    @Provides
    @Singleton
    fun provideAppInfoFragment(): AppInfoFragment {
        return AppInfoFragment.newInstance()
    }

    @Provides
    @Singleton
    fun provideHabitListFragmentFactory(): HabitListFragmentFactory {
        return HabitListFragmentFactory(habitsRepository)
    }

    @Provides
    @Singleton
    fun provideHabitPagerAdapter(habitListFragmentFactory: HabitListFragmentFactory): HabitPagerAdapter {
        return HabitPagerAdapter(activity, habitListFragmentFactory)
    }

    @Provides
    @Singleton
    fun provideToastService(): ToastService {
        return ToastService(activity.applicationContext)
    }
}

@Singleton
@Component(modules = [PresentationModule::class, DomainModule::class])
interface PresentationComponent {
    fun getHabitsEditorFragment(): HabitsEditorFragment

    fun getTabFragment(): TabFragment

    fun getAppInfoFragment(): AppInfoFragment

    fun getToastService(): ToastService
}