package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Dynamic_Fragment_Data_Example_Two : Fragment() {
    lateinit var txtData: TextView
    var msg: String =""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_dynamic___data__example__two, container, false)
        txtData = v.findViewById(R.id.txtView2)
        txtData.setText(msg)
        return v
    }
    fun displayReceivedData(message: String){
        msg = message
    }
}
