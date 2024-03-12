package com.example.ca2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val REQUEST_DATE_TIME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)

        button1.setOnClickListener { openDateTimePicker() }
        button2.setOnClickListener { openDateTimePicker() }
        button3.setOnClickListener { openDateTimePicker() }
        button4.setOnClickListener { openDateTimePicker() }
        button5.setOnClickListener { openDateTimePicker() }
        button6.setOnClickListener { openDateTimePicker() }
        button7.setOnClickListener { openDateTimePicker() }
        button8.setOnClickListener { openDateTimePicker() }
    }

    private fun openDateTimePicker() {
        val intent = Intent(this, Date_Time_Picker::class.java)
        startActivityForResult(intent, REQUEST_DATE_TIME)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_DATE_TIME && resultCode == Activity.RESULT_OK) {
            data?.getLongExtra("selectedDateTime", 0)

        }
    }
}
