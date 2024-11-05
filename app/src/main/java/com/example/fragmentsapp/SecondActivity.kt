package com.example.midtermbtueasy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsapp.R

class SecondActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val clickButton = findViewById<Button>(R.id.clickButton)

        // Get the email from the intent
        val email = intent.getStringExtra("USER_EMAIL")
        if (email != null) {
            emailTextView.text = email
        }

        // Increment the counter by 2 on button click
        clickButton.setOnClickListener {
            counter += 2
            counterTextView.text = counter.toString()
        }
    }
}
