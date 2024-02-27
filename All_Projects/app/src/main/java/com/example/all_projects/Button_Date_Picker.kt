package com.example.all_projects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Button_Date_Picker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_date_picker)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Date_Pick_Activity()
        }
    }
    private fun Date_Pick_Activity() {
        val intent = Intent(this, Date_Picker::class.java)
        startActivity(intent)
    }
}
