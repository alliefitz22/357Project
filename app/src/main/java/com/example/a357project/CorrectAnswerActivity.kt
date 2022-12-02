package com.example.a357project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CorrectAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_answer)
        val continueButton = findViewById<Button>(R.id.nextQ)
        val stopButton = findViewById<Button>(R.id.cHome)
        val currentStreak = findViewById<TextView>(R.id.cCurrentStreak)
        val longestStreak = findViewById<TextView>(R.id.cLongestStreak)

        continueButton.setOnClickListener {
            finish()
            val i = Intent(this, QuestionActivity::class.java )
            startActivity(i)
        }
        stopButton.setOnClickListener {
            finish()
            //this is where we need to go back to the main screen
           val i = Intent(this, MainActivity::class.java )
           startActivity(i)
        }

    }
}