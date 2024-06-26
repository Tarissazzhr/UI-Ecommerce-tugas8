package com.example.projekf

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OfferFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OfferFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_offer, container, false)

        // Find the ImageButton by its ID
        val imageButton2 = view.findViewById<ImageButton>(R.id.imageButton2)
        val imageView4 = view.findViewById<ImageView>(R.id.imageView4)
        val imageView6 = view.findViewById<ImageView>(R.id.imageView6)
        val imageView8 = view.findViewById<ImageView>(R.id.imageView8)
        val imageView10 = view.findViewById<ImageView>(R.id.imageView10)

        // Set an OnClickListener to navigate back to the previous screen
        imageButton2.setOnClickListener {
            // Pop the current fragment off the back stack
            requireActivity().supportFragmentManager.popBackStack()
        }

        imageView4.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView8.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView10.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment OfferFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OfferFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}