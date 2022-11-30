package com.example.a357project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WrongAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)
        val tryAgainButton = findViewById<Button>(R.id.tryAgainButton)
        val stopButton = findViewById<Button>(R.id.wHome)
        val currentStreak = findViewById<TextView>(R.id.wcurrentStreak)
        val longestStreak = findViewById<TextView>(R.id.wLongestStreak)

        tryAgainButton.setOnClickListener {
            //This is where we need to go back to the question screen
            //val i = Intent(this, QuestionActivity::class.java)
            //startActivity(i)
            //Also add code to reset streak
        }
        stopButton.setOnClickListener {
            //Add code to reset streak
            //this is where we need to go back to the main screen
            // val i = Intent(this, MainActivity::class.java )
            // startActivity(i)

        }
    }
}