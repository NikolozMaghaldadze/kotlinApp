package com.example.midtermbtueasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val okayButton = findViewById<Button>(R.id.okayButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        okayButton.setOnClickListener {
            val email = emailEditText.text.toString()
            // Use Intent to pass data to SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            // Directly navigate to SecondActivity without passing email
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
