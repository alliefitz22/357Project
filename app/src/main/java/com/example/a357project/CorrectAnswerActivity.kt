package com.example.a357project

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CorrectAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_answer)
        val sPref = applicationContext.getSharedPreferences("MyPref", 0)
        val editor: SharedPreferences.Editor = sPref.edit()
        val continueButton = findViewById<Button>(R.id.nextQ)
        val stopButton = findViewById<Button>(R.id.cHome)
        val currentStreak = findViewById<TextView>(R.id.cCurrentStreak)
        val longestStreak = findViewById<TextView>(R.id.cLongestStreak)

        val currentStreakSaved = sPref.getInt("currentStreak", 0)
        currentStreak.text = "Current Streak: $currentStreakSaved questions"
        var longestStreakSaved = sPref.getInt("maxStreak", 0)
        if (currentStreakSaved > longestStreakSaved) {
            longestStreakSaved = currentStreakSaved
            editor.putInt("maxStreak", longestStreakSaved)
            editor.apply()
        }
        longestStreak.text = "Longest Streak: $longestStreakSaved questions"

        continueButton.setOnClickListener {
            val i = Intent(this, QuestionActivity::class.java )
            startActivity(i)
            finish()
        }
        stopButton.setOnClickListener {
            //this is where we need to go back to the main screen
           /*val i = Intent(this, MainActivity::class.java )
           startActivity(i)*/
            finish()
        }

    }
}