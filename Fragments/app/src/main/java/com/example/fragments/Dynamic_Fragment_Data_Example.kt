package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Dynamic_Fragment_Data_Example : AppCompatActivity(), OnDataListener {
    var sendData = ""
    var sendData2 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment_data_example)

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()

        if (savedInstanceState != null){
            sendData2 = savedInstanceState.getString("K1")!!
        }
        val displaymode = resources.configuration.orientation
        if(displaymode == 1){
            val f1 = Dynamic_Fragment_Data_Example_One()
            fragmentTransaction.replace(android.R.id.content, f1)
        }
        else{
            val f2 = Dynamic_Fragment_Data_Example_Two()
            fragmentTransaction.replace(android.R.id.content, f2)
            f2.displayReceivedData(sendData2)
        }
        fragmentTransaction.commit()
    }

    override fun communicate(msg: String) {
        sendData = msg
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("K1", sendData2)
    }
}
