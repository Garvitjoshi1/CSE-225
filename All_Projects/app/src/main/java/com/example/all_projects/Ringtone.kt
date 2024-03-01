package com.example.all_projects

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ringtone : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ringtone)
    }

    fun playRingtone() {
        mediaPlayer = MediaPlayer.create(this, R.raw.ringtone)
        mediaPlayer!!.isLooping = true
        mediaPlayer!!.start()
        Toast.makeText(this@Ringtone, "Playing Ringtone", Toast.LENGTH_SHORT).show()
    }

    fun stopRingtone() {
        if (mediaPlayer != null) {
            mediaPlayer!!.stop()
            mediaPlayer!!.release()
            mediaPlayer = null
            Toast.makeText(this@Ringtone, "Ringtone Stopped", Toast.LENGTH_SHORT).show()
        }
    }
}
