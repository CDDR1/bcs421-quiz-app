package com.example.quizz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Stats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)

        val extras = intent.extras

        if (extras != null) {
            val points = extras?.getInt("points", 0)!!
            textViewTitle.text = "Total earned: $ $points"
        }
    }
}