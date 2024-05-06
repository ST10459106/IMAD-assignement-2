package com.example.imad_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Find views
        val petImageView: ImageView = findViewById(R.id.petImageView)
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        val startButton: Button = findViewById(R.id.startButton)

        // Set click listener for the button
        startButton.setOnClickListener {
            // Start the second activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
