package com.example.data.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/data/database/HabitsDAO;", "", "clear", "", "deleteHabit", "habit", "Lcom/example/data/database/entities/DbHabit;", "getAllHabits", "Lkotlinx/coroutines/flow/Flow;", "", "getHabitById", "id", "", "insertHabit", "updateHabit", "data_debug"})
public abstract interface HabitsDAO {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM habits")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.data.database.entities.DbHabit>> getAllHabits();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM habits WHERE habit_id=:id")
    public abstract com.example.data.database.entities.DbHabit getHabitById(long id);
    
    @androidx.room.Insert
    public abstract long insertHabit(@org.jetbrains.annotations.NotNull
    com.example.data.database.entities.DbHabit habit);
    
    @androidx.room.Update
    public abstract void updateHabit(@org.jetbrains.annotations.NotNull
    com.example.data.database.entities.DbHabit habit);
    
    @androidx.room.Delete
    public abstract void deleteHabit(@org.jetbrains.annotations.NotNull
    com.example.data.database.entities.DbHabit habit);
    
    @androidx.room.Query(value = "DELETE FROM habits")
    public abstract void clear();
}