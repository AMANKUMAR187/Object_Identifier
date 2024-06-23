package com.example.american_sign04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class second_interface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_interface)
        supportActionBar?.hide()

        var button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }
}