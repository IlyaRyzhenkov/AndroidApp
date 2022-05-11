package com.example.presentation.fragments.habitEditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/example/presentation/fragments/habitEditor/HabitsEditorCallback;", "", "onHabitCreated", "", "habit", "Lcom/example/domain/models/Habit;", "position", "", "onHabitEdited", "oldHabit", "newHabit", "oldPosition", "presentation_debug"})
public abstract interface HabitsEditorCallback {
    
    public abstract void onHabitCreated(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int position);
    
    public abstract void onHabitEdited(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit oldHabit, @org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, int oldPosition);
}