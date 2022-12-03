package com.example.a357project

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WrongAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)
        val sPref = applicationContext.getSharedPreferences("MyPref", 0)
        val editor: SharedPreferences.Editor = sPref.edit()
        val tryAgainButton = findViewById<Button>(R.id.tryAgainButton)
        val stopButton = findViewById<Button>(R.id.wHome)
        val finalStreak = findViewById<TextView>(R.id.wcurrentStreak)
        val longestStreak = findViewById<TextView>(R.id.wLongestStreak)

        var finalStreakSaved = sPref.getInt("currentStreak", 0)
        var longestStreakSaved = sPref.getInt("maxStreak", 0)
        finalStreak.text = "Final Streak: $finalStreakSaved questions"
        longestStreak.text = "Lonqest Streak: $longestStreakSaved questions"

        tryAgainButton.setOnClickListener {
            finish()
            editor.putInt("currentStreak", 0)
            editor.apply()
            val i = Intent(this, QuestionActivity::class.java)
            startActivity(i)
            //Also add code to reset streak
        }
        stopButton.setOnClickListener {
            finish()
            editor.putInt("currentStreak", 0)
            editor.apply()
            //Add code to reset streak
            val i = Intent(this, MainActivity::class.java )
            startActivity(i)

        }
    }
}