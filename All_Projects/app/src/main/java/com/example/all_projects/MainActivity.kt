package com.example.all_projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
Activity is  a separate class in kotlin file which is a page or template displayed to user.
onCreate function is used to create a Activity.

1.) Activity Stack concept is used in implementation of activity.

| Last Activity   |
-----------------
|  .....          |
-----------------
| Third Activity  |
-----------------
| Second Activity |
-----------------
| First Activity  |
-----------------

2.) Activity Started -->
        i) onCreate() -->
        ii) onStart() -->
        iii) onResume() --> Activity Running -->
        iv) onPause()
        (when clicked moves back to on onResume()) -->
        v) onStop()
        (when current activity is destroyed or new activity is started) -->
                              1.) onRestart() called to start again.
                              2.) (app process killed) moves back to onCreate() again
        vi) onDestroy() (when back button pressed or crashed)
*/

    override fun onPause() {
        super.onPause()
        print("Pause")
    }

    override fun onRestart() {
        super.onRestart()
        print("Restart")
    }
}
