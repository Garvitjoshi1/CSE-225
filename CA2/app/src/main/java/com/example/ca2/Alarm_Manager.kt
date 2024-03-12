package com.example.ca2

import android.Manifest
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Alarm_Manager : AppCompatActivity() {
    private lateinit var alarmManager: AlarmManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_manager)

        val inflater = LayoutInflater.from(this)
        val date_time_picker_layout = inflater.inflate(R.layout.activity_date_time_picker, null)
        val buttonDone = date_time_picker_layout.findViewById<Button>(R.id.buttonDone)

        buttonDone.setOnClickListener {
            val intent = Intent(this, Date_Time_Picker::class.java)
            startForResult.launch(intent)
        }

        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
    }

    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val data: Intent? = result.data
            val alarmTime = data?.getLongExtra("alarm_time", 0)
            alarmTime?.let { setAlarm(it) }
        }
    }

    private fun setAlarm(timeInMillis: Long) {
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
            ContextCompat.checkSelfPermission(this, Manifest.permission.SCHEDULE_EXACT_ALARM) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SCHEDULE_EXACT_ALARM), PERMISSION_REQUEST_CODE)
        } else {
            if (canScheduleExactAlarms()) {
                alarmManager.setExact(AlarmManager.RTC_WAKEUP, timeInMillis, pendingIntent)
                val dateFormat = android.text.format.DateFormat.getDateFormat(applicationContext)
                val timeFormat = android.text.format.DateFormat.getTimeFormat(applicationContext)
                val dateTimeString = "${dateFormat.format(timeInMillis)} ${timeFormat.format(timeInMillis)}"
                Toast.makeText(this, "Alarm set for: $dateTimeString", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cannot schedule exact alarms", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun canScheduleExactAlarms(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            return getSystemService(AlarmManager::class.java).canScheduleExactAlarms()
        }
        return true
    }

    companion object {
        private const val PERMISSION_REQUEST_CODE = 1001
    }
}
