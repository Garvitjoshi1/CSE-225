package com.example.all_projects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Intent_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_2)
        val btn2 = findViewById<Button>(R.id.buttonBack)
        btn2.setOnClickListener{
            Intent(this, Intents::class.java)
                .also {
                    startActivity(it)
                }
        }
    }
}
