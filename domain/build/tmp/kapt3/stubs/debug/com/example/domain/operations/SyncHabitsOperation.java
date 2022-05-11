package com.example.domain.operations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/domain/operations/SyncHabitsOperation;", "Lcom/example/domain/operations/BaseOperation;", "syncRemoteService", "Lcom/example/domain/repositories/ISyncHabitService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/domain/repositories/ISyncHabitService;Lkotlinx/coroutines/CoroutineScope;)V", "isAlreadyRun", "", "run", "", "runSyncOperation", "domain_debug"})
public final class SyncHabitsOperation implements com.example.domain.operations.BaseOperation {
    private final com.example.domain.repositories.ISyncHabitService syncRemoteService = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private boolean isAlreadyRun = false;
    
    public SyncHabitsOperation(@org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitService syncRemoteService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @java.lang.Override
    public void run() {
    }
    
    private final void runSyncOperation() {
    }
}