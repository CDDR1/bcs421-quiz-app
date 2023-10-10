package com.example.quizz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Question6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question6)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)

        val extras = intent.extras
        var points = 0

        if (extras != null) {
            points = extras?.getInt("points", 0)!!
            textViewTitle.text = "You earned: $ $points"
        }

        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)
        val radioButtonOption4 = findViewById<RadioButton>(R.id.radioButtonOption4)

        buttonConfirm.setOnClickListener {
            if (radioButtonOption4.isChecked) {
                points += 100
            }

            val intent = Intent(this, Question7::class.java)
            intent.putExtra("points", points)
            startActivity(intent)
        }
    }
}