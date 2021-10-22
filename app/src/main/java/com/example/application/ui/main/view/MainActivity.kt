package com.example.application.ui.main.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.application.R
import com.example.application_library.TrackingActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTrack = findViewById<Button>(R.id.btnTracking)

        btnTrack.setOnClickListener{
            startActivity(Intent(this, TrackingActivity::class.java))
        }
    }
}