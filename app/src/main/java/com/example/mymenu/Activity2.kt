package com.example.mymenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // або import android.app.Activity
import com.example.mymenu.R
import android.content.Intent
import android.widget.Button
import com.example.mymenu.MainActivity

class Activity2 : AppCompatActivity() { // або class Activity2 : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val buttonToMain = findViewById<Button>(R.id.button_to_main)
        buttonToMain.setOnClickListener {
            finish()
        }
    }
}