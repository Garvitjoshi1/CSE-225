package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class Static_Fragment : Fragment() {
    var AndroidOs = arrayOf(
        "CupCake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "HoneyComb",
        "Ice cream Sandwich",
        "Jelly Beans"
    )
    lateinit var lv: ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.activity_static_fragment, container, false)
        lv = view.findViewById(R.id.lst)
        val arrayAdapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, AndroidOs)
        lv.adapter = arrayAdapter
        lv.setOnItemClickListener { adapterView, view, i, l ->
            val txtfrag = parentFragmentManager.findFragmentById(R.id.fragment_container) as Static_Fragment_2
            txtfrag.change("Android OS: " + AndroidOs[i])
            lv.setSelector(R.color.white)
        }
        return view
    }
}
