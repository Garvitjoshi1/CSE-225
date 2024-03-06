package com.example.all_projects

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Video : AppCompatActivity() {
    private var videoView: VideoView? = null
    private var playButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById(R.id.videoView)
        playButton = findViewById(R.id.playButton)

        playButton?.setOnClickListener { playVideo() }
    }

    private fun playVideo() {
        val videoPath = "android.resource://" + packageName + "/" + R.raw.sample_video
        val uri = Uri.parse(videoPath)
        videoView?.setVideoURI(uri)
        videoView?.start()
    }
}
