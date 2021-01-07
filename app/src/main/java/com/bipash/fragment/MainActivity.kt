package com.bipash.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bipash.fragment.fragment.SumFragment

class MainActivity : AppCompatActivity() {

    private lateinit var areaFragment : Button
    private lateinit var sumFragment : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        areaFragment = findViewById(R.id.btnArea)
        sumFragment = findViewById(R.id.btnSum)

        areaFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, SumFragment())
                addToBackStack(null)
                commit()
            }
        }

        sumFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, SumFragment())
                addToBackStack(null)
                commit()
            }
        }
    }
}