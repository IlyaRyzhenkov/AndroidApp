package com.example.presentation.fragments.habitList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/presentation/fragments/habitList/HabitListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lcom/example/presentation/fragments/habitList/HabitListCallback;", "habitListAdapter", "Lcom/example/presentation/viewHolders/HabitListAdapter;", "habitListView", "Landroidx/recyclerview/widget/RecyclerView;", "habitType", "Lcom/example/domain/models/HabitType;", "habitsListViewModel", "Lcom/example/presentation/viewModels/HabitListViewModel;", "habitsRepository", "Lcom/example/data/database/HabitsRepository;", "nameFilter", "", "onAttach", "", "context", "Landroid/content/Context;", "onCompleteHabitClick", "habit", "Lcom/example/domain/models/Habit;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "position", "", "onViewCreated", "view", "setNameFilter", "Companion", "presentation_debug"})
public final class HabitListFragment extends androidx.fragment.app.Fragment {
    private com.example.data.database.HabitsRepository habitsRepository;
    private com.example.presentation.viewModels.HabitListViewModel habitsListViewModel;
    private com.example.domain.models.HabitType habitType;
    private java.lang.String nameFilter = "";
    private com.example.presentation.fragments.habitList.HabitListCallback callback;
    private androidx.recyclerview.widget.RecyclerView habitListView;
    private com.example.presentation.viewHolders.HabitListAdapter habitListAdapter;
    @org.jetbrains.annotations.NotNull
    public static final com.example.presentation.fragments.habitList.HabitListFragment.Companion Companion = null;
    private static final java.lang.String HABIT_TYPE_BUNDLE = "HABIT_TYPE";
    
    public HabitListFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void setNameFilter(@org.jetbrains.annotations.NotNull
    java.lang.String nameFilter) {
    }
    
    private final void onItemClick(com.example.domain.models.Habit habit, int position) {
    }
    
    private final void onCompleteHabitClick(com.example.domain.models.Habit habit) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/presentation/fragments/habitList/HabitListFragment$Companion;", "", "()V", "HABIT_TYPE_BUNDLE", "", "newInstansce", "Lcom/example/presentation/fragments/habitList/HabitListFragment;", "habitType", "Lcom/example/domain/models/HabitType;", "habitsRepository", "Lcom/example/data/database/HabitsRepository;", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.presentation.fragments.habitList.HabitListFragment newInstansce(@org.jetbrains.annotations.NotNull
        com.example.domain.models.HabitType habitType, @org.jetbrains.annotations.NotNull
        com.example.data.database.HabitsRepository habitsRepository) {
            return null;
        }
    }
}