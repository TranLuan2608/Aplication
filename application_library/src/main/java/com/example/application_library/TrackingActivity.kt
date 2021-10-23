package com.example.application_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class TrackingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracking)

        val userName = findViewById<EditText>(R.id.edtUserName)
        val btnUsername = findViewById<Button>(R.id.btnAddUserName)

        btnUsername.setOnClickListener{
            val name = userName.text.toString()
            val database = Firebase.database
            val myRef = database.getReference("Name")
            myRef.setValue(name)
            Toast.makeText(this, "Add Successful", Toast.LENGTH_LONG).show()
        }

//        val analytics = FirebaseAnalytics.getInstance(this)
//        val bundle = Bundle()
//        bundle.putString("message", "View Library")
//        analytics.logEvent("TrackingViewActivity", bundle)
    }
}