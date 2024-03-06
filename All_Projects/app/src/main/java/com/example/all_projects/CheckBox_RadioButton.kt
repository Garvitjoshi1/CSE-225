package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class CheckBox_RadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_button)

        val btn = findViewById<Button>(R.id.order)
        val check_onion = findViewById<CheckBox>(R.id.onion)
        val check_tomato = findViewById<CheckBox>(R.id.tomato)
        val check_nothing = findViewById<CheckBox>(R.id.nothing)
        val radio = findViewById<RadioGroup>(R.id.radio)

        btn.setOnClickListener{

            val onion_check = check_onion.isChecked
            val tomato_check = check_tomato.isChecked
            val check_nothing = check_nothing.isChecked
            val radio_msg = findViewById<RadioButton>(radio.checkedRadioButtonId)

            val order_detail = StringBuilder()
            order_detail.append("The order details are ${radio_msg.text} with ")

            if (onion_check){
                order_detail.append("Onion, ")
            }
            if (tomato_check){
                order_detail.append("Tomato, ")
            }
            if (check_nothing){
                order_detail.append("Nothing, ")
            }

            // Remove trailing commas at end
            if (order_detail.isNotEmpty()){
                order_detail.delete(order_detail.length - 2, order_detail.length)
            }

            Toast.makeText(this@CheckBox_RadioButton, order_detail.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
