package com.example.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.data.database.entities.DbHabit.class, com.example.data.database.entities.DbHabitCompletion.class}, version = 4)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/database/HabitDatabase;", "Landroidx/room/RoomDatabase;", "()V", "habitsCompletionDAO", "Lcom/example/data/database/HabitsCompletionDAO;", "habitsDAO", "Lcom/example/data/database/HabitsDAO;", "data_debug"})
public abstract class HabitDatabase extends androidx.room.RoomDatabase {
    
    public HabitDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.database.HabitsDAO habitsDAO();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.database.HabitsCompletionDAO habitsCompletionDAO();
}