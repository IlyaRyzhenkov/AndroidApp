package com.example.domain.operations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/domain/operations/OperationFactory;", "", "syncRepository", "Lcom/example/domain/repositories/ISyncHabitRepository;", "syncService", "Lcom/example/domain/repositories/ISyncHabitService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/domain/repositories/ISyncHabitRepository;Lcom/example/domain/repositories/ISyncHabitService;Lkotlinx/coroutines/CoroutineScope;)V", "createAddHabitOperation", "Lcom/example/domain/operations/AddHabitOperation;", "habit", "Lcom/example/domain/models/Habit;", "createDeleteHabitOperation", "Lcom/example/domain/operations/DeleteHabitOperation;", "createSyncOperation", "Lcom/example/domain/operations/SyncHabitsOperation;", "createUpdateHabitOperation", "Lcom/example/domain/operations/UpdateHabitOperation;", "domain_debug"})
public final class OperationFactory {
    private final com.example.domain.repositories.ISyncHabitRepository syncRepository = null;
    private final com.example.domain.repositories.ISyncHabitService syncService = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public OperationFactory(@org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitRepository syncRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitService syncService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.operations.AddHabitOperation createAddHabitOperation(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.operations.UpdateHabitOperation createUpdateHabitOperation(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.operations.DeleteHabitOperation createDeleteHabitOperation(@org.jetbrains.annotations.Nullable
    com.example.domain.models.Habit habit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.operations.SyncHabitsOperation createSyncOperation() {
        return null;
    }
}