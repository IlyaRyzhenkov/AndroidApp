package com.example.presentation.fragments.habitList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/presentation/fragments/habitList/HabitListCallback;", "", "onCompleteHabitClicked", "", "habit", "Lcom/example/domain/models/Habit;", "onItemClicked", "position", "", "presentation_debug"})
public abstract interface HabitListCallback {
    
    public abstract void onItemClicked(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int position);
    
    public abstract void onCompleteHabitClicked(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit);
}