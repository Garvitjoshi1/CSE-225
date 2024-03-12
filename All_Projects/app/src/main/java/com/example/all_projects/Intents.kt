package com.example.all_projects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)
        val btn = findViewById<Button>(R.id.btnOpenActivity)
        btn.setOnClickListener{
            Intent(this, Intent_2::class.java)
                .also {
                finish()
            }
        }
    }
}
