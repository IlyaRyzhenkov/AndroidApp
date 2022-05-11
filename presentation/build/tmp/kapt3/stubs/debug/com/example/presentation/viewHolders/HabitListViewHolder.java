package com.example.presentation.viewHolders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/presentation/viewHolders/HabitListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "badHabitRepr", "", "defaultCounterText", "defaultPeriodText", "defaultPriorityText", "defaultTypeText", "goodHabitRepr", "habitCounterView", "Landroid/widget/TextView;", "habitDescriptionView", "habitNameView", "habitPeriodView", "habitPriorityView", "habitTypeView", "bind", "", "habit", "Lcom/example/domain/models/Habit;", "getCounterText", "counter", "", "getPeriodText", "period", "getPriorityText", "priority", "getTypeText", "habitType", "Lcom/example/domain/models/HabitType;", "presentation_debug"})
public final class HabitListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView habitNameView = null;
    private final android.widget.TextView habitDescriptionView = null;
    private final android.widget.TextView habitPeriodView = null;
    private final android.widget.TextView habitPriorityView = null;
    private final android.widget.TextView habitTypeView = null;
    private final android.widget.TextView habitCounterView = null;
    private final java.lang.String defaultPeriodText = null;
    private final java.lang.String defaultPriorityText = null;
    private final java.lang.String defaultCounterText = null;
    private final java.lang.String defaultTypeText = null;
    private final java.lang.String goodHabitRepr = null;
    private final java.lang.String badHabitRepr = null;
    
    public HabitListViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View itemView) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit) {
    }
    
    private final java.lang.String getPeriodText(int period) {
        return null;
    }
    
    private final java.lang.String getPriorityText(int priority) {
        return null;
    }
    
    private final java.lang.String getTypeText(com.example.domain.models.HabitType habitType) {
        return null;
    }
    
    private final java.lang.String getCounterText(int counter) {
        return null;
    }
}