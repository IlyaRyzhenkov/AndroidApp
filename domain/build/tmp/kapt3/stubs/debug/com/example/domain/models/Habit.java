package com.example.domain.models;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002GHBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\bH\u00c6\u0003J\t\u00109\u001a\u00020\u000fH\u00c6\u0003Jo\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010;\u001a\u00020\bH\u00d6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\bH\u00d6\u0001J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f\u00a8\u0006I"}, d2 = {"Lcom/example/domain/models/Habit;", "Landroid/os/Parcelable;", "id", "", "name", "", "description", "priority", "", "type", "Lcom/example/domain/models/HabitType;", "period", "counter", "color", "date", "Ljava/time/Instant;", "uid", "(JLjava/lang/String;Ljava/lang/String;ILcom/example/domain/models/HabitType;IIILjava/time/Instant;Ljava/lang/String;)V", "getColor", "()I", "setColor", "(I)V", "getCounter", "setCounter", "getDate", "()Ljava/time/Instant;", "setDate", "(Ljava/time/Instant;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getName", "setName", "getPeriod", "setPeriod", "getPriority", "setPriority", "getType", "()Lcom/example/domain/models/HabitType;", "setType", "(Lcom/example/domain/models/HabitType;)V", "getUid", "setUid", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HabitJsonDeserializer", "HabitJsonSerializer", "domain_debug"})
public final class Habit implements android.os.Parcelable {
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    private int priority;
    @org.jetbrains.annotations.NotNull
    private com.example.domain.models.HabitType type;
    private int period;
    private int counter;
    private int color;
    @org.jetbrains.annotations.NotNull
    private java.time.Instant date;
    @org.jetbrains.annotations.Nullable
    private java.lang.String uid;
    public static final android.os.Parcelable.Creator<com.example.domain.models.Habit> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.models.Habit copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, int priority, @org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType type, int period, int counter, int color, @org.jetbrains.annotations.NotNull
    java.time.Instant date, @org.jetbrains.annotations.Nullable
    java.lang.String uid) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Habit(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, int priority, @org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType type, int period, int counter, int color, @org.jetbrains.annotations.NotNull
    java.time.Instant date, @org.jetbrains.annotations.Nullable
    java.lang.String uid) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    public final void setPriority(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.models.HabitType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.models.HabitType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getPeriod() {
        return 0;
    }
    
    public final void setPeriod(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getCounter() {
        return 0;
    }
    
    public final void setCounter(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.Instant component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.Instant getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull
    java.time.Instant p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.domain.models.Habit> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.example.domain.models.Habit createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.example.domain.models.Habit[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/example/domain/models/Habit$HabitJsonSerializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/example/domain/models/Habit;", "()V", "serialize", "Lcom/google/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonSerializationContext;", "domain_debug"})
    public static final class HabitJsonSerializer implements com.google.gson.JsonSerializer<com.example.domain.models.Habit> {
        
        public HabitJsonSerializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.google.gson.JsonElement serialize(@org.jetbrains.annotations.NotNull
        com.example.domain.models.Habit src, @org.jetbrains.annotations.NotNull
        java.lang.reflect.Type typeOfSrc, @org.jetbrains.annotations.NotNull
        com.google.gson.JsonSerializationContext context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/example/domain/models/Habit$HabitJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/example/domain/models/Habit;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "domain_debug"})
    public static final class HabitJsonDeserializer implements com.google.gson.JsonDeserializer<com.example.domain.models.Habit> {
        
        public HabitJsonDeserializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.example.domain.models.Habit deserialize(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement json, @org.jetbrains.annotations.Nullable
        java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.Nullable
        com.google.gson.JsonDeserializationContext context) {
            return null;
        }
    }
}