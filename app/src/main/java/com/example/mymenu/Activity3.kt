package com.example.mymenu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val buttonToMain = findViewById<Button>(R.id.button_to_main)
        buttonToMain.setOnClickListener {
            finish()
        }
    }
}