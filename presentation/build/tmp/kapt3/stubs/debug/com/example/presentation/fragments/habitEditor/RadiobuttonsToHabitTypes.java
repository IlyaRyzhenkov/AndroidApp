package com.example.presentation.fragments.habitEditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/presentation/fragments/habitEditor/RadiobuttonsToHabitTypes;", "", "id", "", "type", "Lcom/example/domain/models/HabitType;", "(Ljava/lang/String;IILcom/example/domain/models/HabitType;)V", "getId", "()I", "getType", "()Lcom/example/domain/models/HabitType;", "GOOD_BUTTON", "BAD_BUTTON", "Companion", "presentation_debug"})
public enum RadiobuttonsToHabitTypes {
    /*public static final*/ GOOD_BUTTON /* = new GOOD_BUTTON(0, null) */,
    /*public static final*/ BAD_BUTTON /* = new BAD_BUTTON(0, null) */;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.domain.models.HabitType type = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.presentation.fragments.habitEditor.RadiobuttonsToHabitTypes.Companion Companion = null;
    
    RadiobuttonsToHabitTypes(int id, com.example.domain.models.HabitType type) {
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.models.HabitType getType() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/example/presentation/fragments/habitEditor/RadiobuttonsToHabitTypes$Companion;", "", "()V", "getIdByType", "", "habitType", "Lcom/example/domain/models/HabitType;", "getTypeById", "id", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.domain.models.HabitType getTypeById(int id) {
            return null;
        }
        
        public final int getIdByType(@org.jetbrains.annotations.NotNull
        com.example.domain.models.HabitType habitType) {
            return 0;
        }
    }
}