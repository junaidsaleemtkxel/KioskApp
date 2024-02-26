package com.kioskapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kioskapp.MainActivity; // Import your main activity

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}