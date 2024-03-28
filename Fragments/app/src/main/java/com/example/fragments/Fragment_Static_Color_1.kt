package com.example.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment_Static_Color_1 : Fragment() {
    lateinit var btnGreen: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment__static__color_1, container, false)
        btnGreen = v.findViewById(R.id.frag1BtnGreen)
        btnGreen.setOnClickListener {
            val mai = activity as Fragment_Static_Color_Main
            mai.newColor(Color.GREEN)
        }
        return v
    }
}
