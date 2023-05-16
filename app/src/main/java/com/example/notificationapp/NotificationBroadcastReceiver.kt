package com.example.notificationapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        if (p1?.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            p0?.startService(Intent(p0, NotificationService::class.java))
        }
    }
}