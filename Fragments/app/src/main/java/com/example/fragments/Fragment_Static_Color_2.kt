package com.example.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class Fragment_Static_Color_2 : Fragment() {
    private lateinit var parent : LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment__static__color_2, container, false)
        parent = v.findViewById(R.id.frag2parent)
        return v
    }

    fun updateColor(c: Int){
        parent.setBackgroundColor(c)
    }
}