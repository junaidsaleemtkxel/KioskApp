package com.kioskapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KioskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view if you have a specific layout for this activity
        // setContentView(R.layout.activity_kiosk)

        // Your code to lock the app in kiosk mode
        startLockTask()
    }
}