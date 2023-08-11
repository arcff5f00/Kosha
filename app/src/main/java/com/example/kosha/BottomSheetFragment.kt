package com.example.kosha;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

class CustomBottomSheetDialog(context: Context) :
    BottomSheetDialog(context, R.style.TransparentBottomSheetDialog) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        val view = layoutInflater.inflate(R.layout.fragment_bottomsheet_menu, null);
        setContentView(view);
        val parent = view.parent as View;
        val behavior = BottomSheetBehavior.from(parent);
        val layoutParams = parent.layoutParams as CoordinatorLayout.LayoutParams;
        layoutParams.setMargins(50, 10, 50, 30);
        parent.layoutParams = layoutParams;
        behavior.state = BottomSheetBehavior.STATE_EXPANDED;

        val closeButton = findViewById<ImageButton>(R.id.close)
        closeButton?.setOnClickListener {
            dismiss()
        }

    }
}
