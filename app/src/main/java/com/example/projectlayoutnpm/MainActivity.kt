package com.example.projectlayoutnpm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textRegister: TextView
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textRegister = findViewById(R.id.textRegister)
        buttonLogin = findViewById(R.id.buttonLogin)

        textRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        buttonLogin.setOnClickListener {
            val intent = Intent(this, ContentPage::class.java)
            startActivity(intent)
        }
    }
}