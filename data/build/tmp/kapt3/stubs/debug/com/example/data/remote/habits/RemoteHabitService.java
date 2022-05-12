package com.example.data.remote.habits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0003H\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\fH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/data/remote/habits/RemoteHabitService;", "", "completeHabit", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "habitDone", "Lcom/example/data/remote/habits/models/HabitDone;", "deleteHabit", "habitUid", "Lcom/example/data/remote/habits/models/HabitUid;", "getHabits", "", "Lcom/example/domain/models/Habit;", "postHabit", "habit", "Companion", "data_debug"})
public abstract interface RemoteHabitService {
    @org.jetbrains.annotations.NotNull
    public static final com.example.data.remote.habits.RemoteHabitService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.Headers(value = {"accept: application/json", "Authorization: ebf519d1-85e0-4509-9c10-b135bae8b147"})
    @retrofit2.http.GET(value = "habit")
    public abstract retrofit2.Call<java.util.List<com.example.domain.models.Habit>> getHabits();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.Headers(value = {"Authorization: ebf519d1-85e0-4509-9c10-b135bae8b147"})
    @retrofit2.http.PUT(value = "habit")
    public abstract retrofit2.Call<com.example.data.remote.habits.models.HabitUid> postHabit(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.domain.models.Habit habit);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.Headers(value = {"Authorization: ebf519d1-85e0-4509-9c10-b135bae8b147"})
    @retrofit2.http.HTTP(method = "DELETE", path = "habit", hasBody = true)
    public abstract retrofit2.Call<okhttp3.ResponseBody> deleteHabit(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.data.remote.habits.models.HabitUid habitUid);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.Headers(value = {"Authorization: ebf519d1-85e0-4509-9c10-b135bae8b147"})
    @retrofit2.http.POST(value = "habit_done")
    public abstract retrofit2.Call<okhttp3.ResponseBody> completeHabit(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.data.remote.habits.models.HabitDone habitDone);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/data/remote/habits/RemoteHabitService$Companion;", "", "()V", "SERVER_TOKEN", "", "data_debug"})
    public static final class Companion {
        private static final java.lang.String SERVER_TOKEN = "ebf519d1-85e0-4509-9c10-b135bae8b147";
        
        private Companion() {
            super();
        }
    }
}