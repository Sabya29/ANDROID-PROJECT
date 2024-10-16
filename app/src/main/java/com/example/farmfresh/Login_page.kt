package com.example.farmfresh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login_page : AppCompatActivity() {
    private var username : EditText? = null;
    private var password : EditText? = null;
    private var register_btn : Button? = null;
    private var login_btn : Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        username =findViewById<View>(R.id.username) as EditText
        password =findViewById<View>(R.id.password) as EditText
        register_btn =findViewById<View>(R.id.register_button) as Button
        login_btn =findViewById<View>(R.id.login_button) as Button


        login_btn!!.setOnClickListener(View.OnClickListener {
            val usrname = username!!.getText().toString()
            val pass = password!!.getText().toString()

            if(usrname == "admin" && pass == "admin"){
                Toast.makeText(this@Login_page, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Home_page::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this@Login_page,"Login FAILED!!", Toast.LENGTH_SHORT).show()
            }
        })

        register_btn!!.setOnClickListener {
            val intent = Intent(this, Signup_page::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}