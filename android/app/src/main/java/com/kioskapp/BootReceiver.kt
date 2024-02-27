package com.kioskapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.kioskapp.MainActivity // Make sure to import your KioskActivity
import androidx.appcompat.app.AppCompatActivity
class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            val intentToStartKiosk = Intent(context, MainActivity::class.java)
            intentToStartKiosk.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intentToStartKiosk)
        }
    }
}
