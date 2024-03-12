package com.example.all_projects

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Passing_Data_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data2)

        val name = intent.getStringExtra("Extra_Name")
        val age = intent.getIntExtra("Extra_Age", 0)
        val country = intent.getStringExtra("Extra_Country")
        val personString = "$name is $age years old and lives in $country"

        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = personString
    }
}
