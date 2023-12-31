package com.example.quizz_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)
        val radioButtonOption3 = findViewById<RadioButton>(R.id.radioButtonOption3)
        var points = 0
        var toastMessage = "Incorrect Answer"

        buttonConfirm.setOnClickListener {
            if (radioButtonOption3.isChecked) {
                points += 100
                toastMessage = "That's correct! You earned $100 \uD83E\uDD11"
            }

            val intent = Intent(this, Question2::class.java)
            intent.putExtra("points", points)
            startActivity(intent)

            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}