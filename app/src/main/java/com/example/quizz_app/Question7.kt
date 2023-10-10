package com.example.quizz_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Question7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question7)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)

        val extras = intent.extras
        var points = 0

        if (extras != null) {
            points = extras?.getInt("points", 0)!!
            textViewTitle.text = "You earned: $ $points"
        }

        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)
        val radioButtonOption1 = findViewById<RadioButton>(R.id.radioButtonOption1)

        buttonConfirm.setOnClickListener {
            if (radioButtonOption1.isChecked) {
                points += 100
            }

            val intent = Intent(this, Stats::class.java)
            intent.putExtra("points", points)
            startActivity(intent)
        }
    }
}