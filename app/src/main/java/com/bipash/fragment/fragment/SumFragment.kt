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


class SumFragment : Fragment() {
    private lateinit var etFirst : EditText
    private lateinit var etSecond : EditText
    private lateinit var btnAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sum, container, false)

        etFirst = view.findViewById(R.id.etfirst)
        etSecond = view.findViewById(R.id.etSecond)
        btnAdd = view.findViewById(R.id.btnSum)

        btnAdd.setOnClickListener {
            add()
        }
        return view
    }

    private fun add(){
        val first = etFirst.text.toString().toFloat()
        val second = etSecond.text.toString().toFloat()

        val sum =first+second

        Toast.makeText(context, "Sum of two number is ${sum}", Toast.LENGTH_SHORT).show()
    }
}