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


        findViewById<Button>(R.id.btnTracking).setOnClickListener{
            startActivity(Intent(this, TrackingActivity::class.java))
            val bundle = Bundle().apply {
                putString(FirebaseAnalytics.Param.ITEM_ID, "123")
                putString(FirebaseAnalytics.Param.ITEM_NAME, "Test Item")
                putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Image")
            }
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,bundle)
        }
    }
}