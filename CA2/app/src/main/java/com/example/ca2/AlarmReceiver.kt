package com.example.ca2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
        val ringtone = RingtoneManager.getRingtone(context, notificationSound)
        ringtone.play()

        Toast.makeText(context, "Alarm! Wake up!", Toast.LENGTH_LONG).show()
    }
}
