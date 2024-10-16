package com.example.farmfresh

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splash_screen : AppCompatActivity() {

    private val SPLASH_SCREEN_DELAY: Long = 6000 // Delay in milliseconds (3 seconds)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Create a Handler to delay the transition
        Handler(Looper.getMainLooper()).postDelayed({
            // Create an Intent to start the login activity
            val intent = Intent(this@Splash_screen, Login_page::class.java)
            startActivity(intent)

            finish()
        }, SPLASH_SCREEN_DELAY)
    }
}