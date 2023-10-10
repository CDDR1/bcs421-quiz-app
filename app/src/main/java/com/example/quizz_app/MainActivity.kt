package com.example.quizz_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonConfirm)
        button.setOnClickListener {
            val intent = Intent(this, Question2::class.java)

            val number = 42
            intent.putExtra("number_key", number)

            startActivity(intent)
        }
    }
}