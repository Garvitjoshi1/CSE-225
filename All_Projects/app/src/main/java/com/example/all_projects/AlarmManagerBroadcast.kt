package com.example.all_projects

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class AlarmManagerBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val mp = MediaPlayer.create(context, R.raw.ringtone)
        Log.d("Hello", "repeating alarm")
        mp.start()
        Toast.makeText(context, "Alarm Ringing", Toast.LENGTH_LONG).show()
    }
}
