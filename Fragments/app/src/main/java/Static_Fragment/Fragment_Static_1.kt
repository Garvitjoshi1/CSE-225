package Static_Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.R

class Fragment_Static_1 : Fragment() {
    lateinit var v:View

    @Override
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment__static_1, container, false)
        init(container)
        return v
    }

    private lateinit var buttonListener: OnButtonPressedListener

    override fun onAttach(context: Context){
        super.onAttach(context)
        buttonListener =
            try {
                activity as OnButtonPressedListener
            }
            catch (e: ClassCastException){
                throw ClassCastException("$context must implement onButtonPressed")
            }
    }

    private fun init(root:ViewGroup?){
        val but: Button = v.findViewById(R.id.send)
        val clear: Button = v.findViewById(R.id.send2)
        Toast.makeText(context, "init", Toast.LENGTH_LONG).show()
        but.setOnClickListener {
            buttonListener.onButtonPressedListener("Button has been clicked")
        }
        clear.setOnClickListener {
            buttonListener.onButtonPressedListener("")
        }
    }
}
