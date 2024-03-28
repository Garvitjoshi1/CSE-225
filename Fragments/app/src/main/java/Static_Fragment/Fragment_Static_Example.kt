package Static_Fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragments.R

class Fragment_Static_Example : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_static_example)

    }

    fun onButtonPressed(msg: String) {
        var obj = supportFragmentManager.findFragmentById(R.id.fragment2) as Fragment_Static_2
        obj.onFragmentInteraction(msg)
    }
}
