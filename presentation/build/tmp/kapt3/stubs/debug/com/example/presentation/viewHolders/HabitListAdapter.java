package com.example.presentation.viewHolders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/example/presentation/viewHolders/HabitListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/presentation/viewHolders/HabitListViewHolder;", "habits", "", "Lcom/example/domain/models/Habit;", "clickListener", "Lkotlin/Function2;", "", "", "completeHabitListener", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getHabits", "()Ljava/util/List;", "setHabits", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "presentation_debug"})
public final class HabitListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.presentation.viewHolders.HabitListViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.domain.models.Habit> habits;
    private final kotlin.jvm.functions.Function2<com.example.domain.models.Habit, java.lang.Integer, kotlin.Unit> clickListener = null;
    private final kotlin.jvm.functions.Function1<com.example.domain.models.Habit, kotlin.Unit> completeHabitListener = null;
    
    public HabitListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.domain.models.Habit> habits, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.example.domain.models.Habit, ? super java.lang.Integer, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.domain.models.Habit, kotlin.Unit> completeHabitListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.domain.models.Habit> getHabits() {
        return null;
    }
    
    public final void setHabits(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.domain.models.Habit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.presentation.viewHolders.HabitListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.presentation.viewHolders.HabitListViewHolder holder, int position) {
    }
}