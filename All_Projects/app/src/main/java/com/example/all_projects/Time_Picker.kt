package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast

class Time_Picker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        val time_pick = findViewById<TimePicker>(R.id.timepicker)
        time_pick.setOnTimeChangedListener{_, hour, minute ->
            var hour = hour
            var am_pm = ""
            when{
                hour == 0 -> {
                    hour += 12
                    am_pm = "AM"
                }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            val hour1 = if (hour < 10) "0" + hour else hour
            val min = if (minute < 10) "0" + minute else minute

            val msg = "Time is: $hour1 : $min $am_pm"
            Toast.makeText(this@Time_Picker, msg, Toast.LENGTH_SHORT).show()
        }
    }
}
