package com.example.quizz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Quetion5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quetion5)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)

        val extras = intent.extras
        var points = 0

        if (extras != null) {
            points = extras?.getInt("points", 0)!!
            textViewTitle.text = "You earned: $ $points"
        }

        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)
        val radioButtonOption2 = findViewById<RadioButton>(R.id.radioButtonOption2)

        buttonConfirm.setOnClickListener {
            if (radioButtonOption2.isChecked) {
                points += 100
            }

            val intent = Intent(this, Question6::class.java)
            intent.putExtra("points", points)
            startActivity(intent)
        }
    }
}