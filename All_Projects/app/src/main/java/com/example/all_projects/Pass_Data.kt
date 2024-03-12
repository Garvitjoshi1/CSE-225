package com.example.all_projects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Pass_Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_data)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            val etName = findViewById<EditText>(R.id.etName).text.toString()
            val etAge = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val etCountry = findViewById<EditText>(R.id.etCountry).text.toString()

            Intent(this, Passing_Data_2::class.java).apply {
                putExtra("Extra_Name", etName)
                putExtra("Extra_Age", etAge)
                putExtra("Extra_Country", etCountry)
                startActivity(this)
            }
        }
    }
}
