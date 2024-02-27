package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class buttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        val buttonApply = findViewById<Button>(R.id.buttonApply)
        val FirstName = findViewById<TextView>(R.id.FirstName)
        val LastName = findViewById<TextView>(R.id.LastName)
        val DateofBirth = findViewById<TextView>(R.id.BirthDate)
        val Country = findViewById<TextView>(R.id.Country)

        buttonApply.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
            val firstname = FirstName.text.toString()
            val lastname = LastName.text.toString()
            val dateofbirth = DateofBirth.text.toString()
            val country = Country.text.toString()
            Log.d("Main Activity", "$firstname $LastName born on $dateofbirth at place $country")
//          to view this line go to logcat and type Main Activity to see this value
        }
    }
}
