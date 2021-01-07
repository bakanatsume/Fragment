package com.bipash.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.bipash.fragment.adapter.ViewPagerAdapter
import com.bipash.fragment.fragment.AreaFragment
import com.bipash.fragment.fragment.SumFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {

    private lateinit var listTitle : ArrayList<String>
    private lateinit var listFragment: ArrayList<Fragment>
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        populateList()

        val adapter = ViewPagerAdapter(listFragment,supportFragmentManager,lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager){
            tab, position -> tab.text = listTitle[position]
        }.attach()
    }

    private fun populateList() {
        listTitle = ArrayList<String>()
        listTitle.add("Sum")
        listTitle.add("Area of Circle")
        listFragment = ArrayList<Fragment>()
        listFragment.add(SumFragment())
        listFragment.add(AreaFragment())

    }
}