package com.example.presentation.fragments.habitEditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\fH\u0003J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000201H\u0002J\u0010\u00108\u001a\u0002012\u0006\u00109\u001a\u00020\u0012H\u0002J\u0012\u0010:\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J&\u0010=\u001a\u0004\u0018\u0001032\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010B\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0016\u0010C\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010D\u001a\u000201R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorCallback;", "getCallback", "()Lcom/example/presentation/fragments/habitEditor/HabitsEditorCallback;", "setCallback", "(Lcom/example/presentation/fragments/habitEditor/HabitsEditorCallback;)V", "editViewModel", "Lcom/example/presentation/viewModels/HabitEditorViewModel;", "habit", "Lcom/example/domain/models/Habit;", "getHabit", "()Lcom/example/domain/models/Habit;", "setHabit", "(Lcom/example/domain/models/Habit;)V", "habitColor", "", "habitColorPickerRGBView", "Landroid/widget/TextView;", "habitColorPickerView", "Landroid/widget/ImageView;", "habitCounterEditTextView", "habitDescriptionEditTextView", "habitNameEditTextView", "habitPeriodEditTextView", "habitPrioritySeekBar", "Landroid/widget/SeekBar;", "habitTypeRadioGroup", "Landroid/widget/RadioGroup;", "operaionFactory", "Lcom/example/domain/operations/OperationFactory;", "getOperaionFactory", "()Lcom/example/domain/operations/OperationFactory;", "setOperaionFactory", "(Lcom/example/domain/operations/OperationFactory;)V", "position", "getPosition", "()I", "setPosition", "(I)V", "res", "Landroid/content/res/Resources;", "colorToInt", "color", "", "createHabitFromViews", "initColorPicker", "", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "onButtonClick", "onClickColorPicker", "intColor", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "setUpWithHabit", "setUpWithoutHabit", "Companion", "presentation_debug"})
public final class HabitsEditorFragment extends androidx.fragment.app.Fragment {
    private com.example.presentation.viewModels.HabitEditorViewModel editViewModel;
    public com.example.domain.operations.OperationFactory operaionFactory;
    @org.jetbrains.annotations.Nullable
    private com.example.presentation.fragments.habitEditor.HabitsEditorCallback callback;
    @org.jetbrains.annotations.Nullable
    private com.example.domain.models.Habit habit;
    private int position = 0;
    private android.content.res.Resources res;
    private android.widget.TextView habitNameEditTextView;
    private android.widget.TextView habitDescriptionEditTextView;
    private android.widget.SeekBar habitPrioritySeekBar;
    private android.widget.RadioGroup habitTypeRadioGroup;
    private android.widget.TextView habitPeriodEditTextView;
    private android.widget.TextView habitCounterEditTextView;
    private android.widget.ImageView habitColorPickerView;
    private android.widget.TextView habitColorPickerRGBView;
    private int habitColor = -16711681;
    @org.jetbrains.annotations.NotNull
    public static final com.example.presentation.fragments.habitEditor.HabitsEditorFragment.Companion Companion = null;
    
    public HabitsEditorFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.operations.OperationFactory getOperaionFactory() {
        return null;
    }
    
    public final void setOperaionFactory(@org.jetbrains.annotations.NotNull
    com.example.domain.operations.OperationFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.presentation.fragments.habitEditor.HabitsEditorCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable
    com.example.presentation.fragments.habitEditor.HabitsEditorCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.domain.models.Habit getHabit() {
        return null;
    }
    
    public final void setHabit(@org.jetbrains.annotations.Nullable
    com.example.domain.models.Habit p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setUpWithHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int position) {
    }
    
    public final void setUpWithoutHabit() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final com.example.domain.models.Habit createHabitFromViews() {
        return null;
    }
    
    private final void onButtonClick() {
    }
    
    private final void initColorPicker(android.view.View view) {
    }
    
    private final void onClickColorPicker(int intColor) {
    }
    
    private final int colorToInt(float color) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment$Companion;", "", "()V", "newInstance", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment;", "operationFactory", "Lcom/example/domain/operations/OperationFactory;", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.presentation.fragments.habitEditor.HabitsEditorFragment newInstance(@org.jetbrains.annotations.NotNull
        com.example.domain.operations.OperationFactory operationFactory) {
            return null;
        }
    }
}