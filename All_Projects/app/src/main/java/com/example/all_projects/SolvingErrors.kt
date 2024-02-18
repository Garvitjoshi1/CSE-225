package com.example.all_projects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        for(i in list.indices){
            for(j in list.indices){
                if(list[j] > list[j+1]){
                    Collections.swap(list, j, j+1)
                }
            }
        }
    }
}

/*
To check for error the app is crashing go to Logcat --> then search of (Caused by) --> get exact reason,
        --> find for links in blue color for file, there exact error lies.
        */
