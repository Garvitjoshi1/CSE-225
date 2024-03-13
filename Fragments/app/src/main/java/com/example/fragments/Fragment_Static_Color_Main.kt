package com.example.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Fragment_Static_Color_Main : AppCompatActivity(), Fragment_Color_Interface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_static_color_main)
    }

    fun changeColor(v: View){
        val fragment2 = supportFragmentManager
            .findFragmentByTag("frag2") as Fragment_Static_Color_2
        fragment2.updateColor(Color.RED)
    }

    override fun newColor(color:Int){
        val fragment2 = supportFragmentManager
            .findFragmentByTag("frag2") as Fragment_Static_Color_2
        fragment2.updateColor(color)
    }
}
