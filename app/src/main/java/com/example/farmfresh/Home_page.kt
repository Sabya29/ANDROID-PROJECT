package com.example.farmfresh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Home_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Set up ViewPager2 with an adapter
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        val adapter = HomePagerAdapter(this)
        viewPager.adapter = adapter

        // Set up TabLayout and link it with ViewPager2
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Fruits"
                1 -> "Vegetables"
                else -> "Dairy"
            }
        }.attach()
    }
}