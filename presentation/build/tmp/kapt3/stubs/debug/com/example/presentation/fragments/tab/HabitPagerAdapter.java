package com.example.presentation.fragments.tab;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/presentation/fragments/tab/HabitPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "habitListFragmentFactory", "Lcom/example/presentation/fragments/habitList/HabitListFragmentFactory;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/example/presentation/fragments/habitList/HabitListFragmentFactory;)V", "badHabitFragment", "Lcom/example/presentation/fragments/habitList/HabitListFragment;", "goodHabitFragment", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getFragmentByType", "type", "Lcom/example/domain/models/HabitType;", "getItemCount", "setNameFilter", "", "nameFilter", "", "presentation_debug"})
public final class HabitPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final com.example.presentation.fragments.habitList.HabitListFragment goodHabitFragment = null;
    private final com.example.presentation.fragments.habitList.HabitListFragment badHabitFragment = null;
    
    public HabitPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    com.example.presentation.fragments.habitList.HabitListFragmentFactory habitListFragmentFactory) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.presentation.fragments.habitList.HabitListFragment getFragmentByType(@org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType type) {
        return null;
    }
    
    public final void setNameFilter(@org.jetbrains.annotations.NotNull
    java.lang.String nameFilter) {
    }
}