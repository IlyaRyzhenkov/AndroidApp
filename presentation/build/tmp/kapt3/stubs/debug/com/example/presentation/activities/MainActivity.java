package com.example.presentation.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J \u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020(H\u0016J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u0018H\u0002J\b\u00102\u001a\u00020\u0018H\u0002J\u001e\u00103\u001a\u00020\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010\'\u001a\u00020(H\u0002J\b\u00104\u001a\u00020\u0018H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/example/presentation/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorCallback;", "Lcom/example/presentation/fragments/habitList/HabitListCallback;", "()V", "appInfoFragment", "Lcom/example/presentation/fragments/AppInfoFragment;", "dataComponent", "Lcom/example/data/DataComponent;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerToggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "editorFragment", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment;", "operationFactory", "Lcom/example/domain/operations/OperationFactory;", "operationsComponent", "Lcom/example/domain/OperationsComponent;", "presentationComponent", "Lcom/example/presentation/PresentationComponent;", "tabFragment", "Lcom/example/presentation/fragments/tab/TabFragment;", "hideBottomSheet", "", "loadUserAvatar", "avatarView", "Landroid/widget/ImageView;", "menuAppInfoClicked", "menuClearLocalHabitsClicked", "menuClearRemoteHabitsClicked", "menuHabitsClicked", "menuSyncHabitsClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHabitCreated", "habit", "Lcom/example/domain/models/Habit;", "position", "", "onHabitEdited", "oldHabit", "newHabit", "oldPosition", "onItemClicked", "onNameFilterSet", "nameFilter", "", "onNewHabitButtonClicked", "showBottomSheet", "startEditorFragment", "startHabitsLists", "presentation_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.presentation.fragments.habitEditor.HabitsEditorCallback, com.example.presentation.fragments.habitList.HabitListCallback {
    private com.example.data.DataComponent dataComponent;
    private com.example.domain.OperationsComponent operationsComponent;
    private com.example.presentation.PresentationComponent presentationComponent;
    private com.example.domain.operations.OperationFactory operationFactory;
    private com.example.presentation.fragments.tab.TabFragment tabFragment;
    private com.example.presentation.fragments.habitEditor.HabitsEditorFragment editorFragment;
    private com.example.presentation.fragments.AppInfoFragment appInfoFragment;
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private androidx.appcompat.app.ActionBarDrawerToggle drawerToggle;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onHabitCreated(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int position) {
    }
    
    @java.lang.Override
    public void onHabitEdited(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit oldHabit, @org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, int oldPosition) {
    }
    
    @java.lang.Override
    public void onItemClicked(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int position) {
    }
    
    private final void onNewHabitButtonClicked() {
    }
    
    private final void startEditorFragment(com.example.domain.models.Habit habit, int position) {
    }
    
    private final void startHabitsLists() {
    }
    
    private final void menuHabitsClicked() {
    }
    
    private final void menuAppInfoClicked() {
    }
    
    private final void hideBottomSheet() {
    }
    
    private final void showBottomSheet() {
    }
    
    private final void onNameFilterSet(java.lang.String nameFilter) {
    }
    
    private final void menuClearLocalHabitsClicked() {
    }
    
    private final void menuClearRemoteHabitsClicked() {
    }
    
    private final void menuSyncHabitsClicked() {
    }
    
    private final void loadUserAvatar(android.widget.ImageView avatarView) {
    }
}