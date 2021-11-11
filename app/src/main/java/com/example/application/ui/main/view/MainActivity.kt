package com.example.application.ui.main.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.application.R
import com.example.application_library.TrackingActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val firebaseAnalytics = FirebaseAnalytics.getInstance(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val track = findViewById<Button>(R.id.btnTracking)
        track.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
            val bundle = Bundle().apply {
                putString(FirebaseAnalytics.Param.ITEM_ID, "123")
                putString(FirebaseAnalytics.Param.ITEM_NAME, "Test View")
                putString(FirebaseAnalytics.Param.CONTENT_TYPE, "View")
            }
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
        }

        btnBottomSheetDemo.setOnClickListener {
            startActivity(Intent(this, BottomSheetActivity::class.java))
        }
        btnBiometricDemo.setOnClickListener {
            startActivity(Intent(this, BiometricLoginActivity::class.java))
        }

    }
}