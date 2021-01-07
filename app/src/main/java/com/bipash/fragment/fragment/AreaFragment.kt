package com.bipash.fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.bipash.fragment.R

class AreaFragment : Fragment() {

    private lateinit var etRadius : EditText
    private lateinit var btnArea : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_area, container, false)
        etRadius = view.findViewById(R.id.etRadius)
        btnArea = view.findViewById(R.id.btnArea)
        btnArea.setOnClickListener {
            area()
        }
        return view
    }

    private fun area(){
        val first = etRadius.text.toString().toFloat()
        val pi = 3.12

        val area = first*pi

        Toast.makeText(context, "Area of given circle radius is ${area}", Toast.LENGTH_SHORT).show()
    }
}