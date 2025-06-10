package com.example.mymenu

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            showPopupMenu(it)
        }
    }

    private fun showPopupMenu(view: android.view.View) {
        val popup = androidx.appcompat.widget.PopupMenu(this, view)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.my_menu, popup.menu)
        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_item_1 -> {
                    startActivity(Intent(this, Activity2::class.java))
                    true
                }
                R.id.menu_item_2 -> {
                    startActivity(Intent(this, Activity3::class.java))
                    true
                }
                else -> false
            }
        }
        popup.show()
    }
}