package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.all_projects.R.*

class Text_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_text_view)
        var count = 0
        val button_count = findViewById<Button>(id.button_click)
        val textView = findViewById<TextView>(id.textView)
        button_count.setOnClickListener{
            count += 1
            textView.text = "Let's count together: $count"
            val msg = "Total count value is: $count"
            Toast.makeText(this@Text_View, msg, Toast.LENGTH_SHORT).show()
        }
    }
}
