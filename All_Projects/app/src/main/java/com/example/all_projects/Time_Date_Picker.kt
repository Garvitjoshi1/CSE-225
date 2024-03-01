package com.example.all_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker

class Time_Date_Picker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_date_picker)

        val button_date = findViewById<Button>(R.id.button_date)
        val button_time = findViewById<Button>(R.id.button_time)
        button_date.setOnClickListener {
            Date_Pick_Activity()
        }
        button_time.setOnClickListener{
            TimePickerActivity()
        }
    }
    private fun Date_Pick_Activity() {
        val intent = Intent(this, Date_Picker::class.java)
        startActivity(intent)
    }
    private fun TimePickerActivity(){
        val intent = Intent(this, Time_Picker::class.java)
        startActivity(intent)
    }
}