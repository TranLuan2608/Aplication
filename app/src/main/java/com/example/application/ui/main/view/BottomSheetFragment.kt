package com.example.application.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.application.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet_fragment.*

class BottomSheetFragment: BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnTest1.setOnClickListener {
            Toast.makeText(context, "Button Test 1", Toast.LENGTH_SHORT).show()
        }
        btnTest2.setOnClickListener {
            Toast.makeText(context, "Button Test 2", Toast.LENGTH_SHORT).show()
        }
    }
}