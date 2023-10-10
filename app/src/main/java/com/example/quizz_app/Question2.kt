package com.example.quizz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)

        val extras = intent.extras
        if (extras != null) {
            val number = extras.getInt("number_key", 0)
            textViewTitle.text = "You earned: $ $number"
        }
    }
}