package com.example.ca2

import android.app.Activity
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class Date_Time_Picker : AppCompatActivity() {
    private lateinit var datePicker: DatePicker
    private lateinit var timePicker: TimePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time_picker)

        datePicker = findViewById<DatePicker>(R.id.datePicker)
        timePicker = findViewById<TimePicker>(R.id.timePicker)
        val buttonDone = findViewById<Button>(R.id.buttonDone)

        buttonDone.setOnClickListener {
            val calendar = Calendar.getInstance()
            calendar.set(datePicker.year, datePicker.month, datePicker.dayOfMonth,
                timePicker.hour, timePicker.minute)

            val resultIntent = Intent()
            resultIntent.putExtra("alarm_time", calendar.timeInMillis)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }

    private fun setAlarm(timeInMillis: Long) {
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, timeInMillis, pendingIntent)
    }

    private fun canScheduleExactAlarms(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            return getSystemService(AlarmManager::class.java).canScheduleExactAlarms()
        }
        return true
    }
}
