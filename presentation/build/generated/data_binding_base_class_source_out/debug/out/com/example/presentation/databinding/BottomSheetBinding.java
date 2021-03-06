// Generated by view binder compiler. Do not edit!
package com.example.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.presentation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout bottomSheet;

  @NonNull
  public final EditText bottomSheetFilterNameEditor;

  @NonNull
  public final TextView bottomSheetHeaderText;

  @NonNull
  public final TextView bottomSheetNameFilter;

  private BottomSheetBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout bottomSheet, @NonNull EditText bottomSheetFilterNameEditor,
      @NonNull TextView bottomSheetHeaderText, @NonNull TextView bottomSheetNameFilter) {
    this.rootView = rootView;
    this.bottomSheet = bottomSheet;
    this.bottomSheetFilterNameEditor = bottomSheetFilterNameEditor;
    this.bottomSheetHeaderText = bottomSheetHeaderText;
    this.bottomSheetNameFilter = bottomSheetNameFilter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout bottomSheet = (ConstraintLayout) rootView;

      id = R.id.bottom_sheet_filter_name_editor;
      EditText bottomSheetFilterNameEditor = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetFilterNameEditor == null) {
        break missingId;
      }

      id = R.id.bottom_sheet_header_text;
      TextView bottomSheetHeaderText = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetHeaderText == null) {
        break missingId;
      }

      id = R.id.bottom_sheet_name_filter;
      TextView bottomSheetNameFilter = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetNameFilter == null) {
        break missingId;
      }

      return new BottomSheetBinding((ConstraintLayout) rootView, bottomSheet,
          bottomSheetFilterNameEditor, bottomSheetHeaderText, bottomSheetNameFilter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
