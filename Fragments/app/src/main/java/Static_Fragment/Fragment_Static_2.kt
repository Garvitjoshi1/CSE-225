package Static_Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragments.R

class Fragment_Static_2 : Fragment() {
    lateinit var textView: TextView
    lateinit var v1: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v1 = inflater.inflate(R.layout.fragment__static_2, container, false)
        return v1
    }

    fun onFragmentInteraction(uri: String){
        Log.d("hi", uri)
        textView = v1.findViewById(R.id.tv1)
        textView.setText(uri)
    }
}
