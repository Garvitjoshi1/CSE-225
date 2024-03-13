package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Static_Fragment_2 : Fragment() {
    lateinit var textos: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.activity_static_fragment2, container, false)
        textos = view.findViewById(R.id.txtdisplay)
        return view
    }

    fun change(txt: String){
        textos.text = txt
    }
}
