package com.practicum.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainSearchButton = findViewById<Button>(R.id.main_search)
        val mainMediaButton = findViewById<Button>(R.id.main_media)
        val mainSettingsButton = findViewById<Button>(R.id.main_settings)

        mainSearchButton.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }
        mainMediaButton.setOnClickListener {
            val searchIntent = Intent(this, MediaActivity::class.java)
            startActivity(searchIntent)
        }
        mainSettingsButton.setOnClickListener {
            val searchIntent = Intent(this, SettingsActivity::class.java)
            startActivity(searchIntent)
        }
    }

}