package com.example.projectlayoutnpm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    private lateinit var textLogin: TextView
    private lateinit var buttonRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        textLogin = findViewById(R.id.textLogin)
        buttonRegister = findViewById(R.id.buttonRegister)

        textLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        buttonRegister.setOnClickListener {
            val intent = Intent(this, ContentPage::class.java)
            startActivity(intent)
        }
    }
}