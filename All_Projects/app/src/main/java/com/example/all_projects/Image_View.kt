package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Image_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            image.setImageResource(R.drawable.img)
        }
    }
}
