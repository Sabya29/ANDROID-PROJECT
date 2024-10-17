package com.example.farmfresh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomePagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        // We have 3 fragments
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FruitsFragment()  // First tab is Fruits
            1 -> VegetablesFragment()  // Second tab is Vegetables
            else -> DairyFragment()  // Third tab is Dairy
        }
    }
}
