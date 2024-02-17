package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_projects.R
import java.util.Collections

class SolvingErrors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solving_errors)

        val list = listOf(5, 3, 6, 7, 9, 1)
        sortList(list)
        print(list)

    }


    private fun sortList(list: List<Int>){
        for(i in 0..list.size - 1){
            for(j in 0..list.size - 1){
                if(list[j] > list[j+1]){
                    Collections.swap(list, j, j+1)
                }
            }
        }
    }
}
