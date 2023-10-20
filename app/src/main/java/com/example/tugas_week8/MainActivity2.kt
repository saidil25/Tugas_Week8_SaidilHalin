package com.example.tugas_week8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val us = intent.getStringExtra("user")
        val usname = findViewById<TextView>(R.id.user)
        usname.text = us
    }
}