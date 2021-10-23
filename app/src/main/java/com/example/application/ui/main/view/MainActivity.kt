package com.example.application.ui.main.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.application.R
import com.example.application_library.TrackingActivity
import com.google.firebase.analytics.FirebaseAnalytics


class MainActivity : AppCompatActivity() {
    private val firebaseAnalytics = FirebaseAnalytics.getInstance(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val track = findViewById<Button>(R.id.btnTracking)
        track.setOnClickListener{
            startActivity(Intent(this, TrackingActivity::class.java))
            val bundle = Bundle().apply {
                putString(FirebaseAnalytics.Param.ITEM_ID, "123")
                putString(FirebaseAnalytics.Param.ITEM_NAME, "Test View")
                putString(FirebaseAnalytics.Param.CONTENT_TYPE, "View")
            }
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,bundle)
        }
    }
}