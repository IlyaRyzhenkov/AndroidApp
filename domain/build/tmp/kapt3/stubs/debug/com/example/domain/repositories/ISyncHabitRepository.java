package com.example.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/domain/repositories/ISyncHabitRepository;", "", "addHabit", "", "habit", "Lcom/example/domain/models/Habit;", "(Lcom/example/domain/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabit", "updateHabit", "newHabit", "domain_debug"})
public abstract interface ISyncHabitRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}