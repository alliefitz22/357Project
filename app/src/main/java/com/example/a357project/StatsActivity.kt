package com.example.a357project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StatsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        val sPref = applicationContext.getSharedPreferences("MyPref", 0)
        val statHomeButton = findViewById<Button>(R.id.stats2home)
        val streakValue = findViewById<TextView>(R.id.streakValue)
        val longestStreak = findViewById<TextView>(R.id.highestValue)
        val myStreak = sPref.getInt("currentStreak", 0)
        val bestStreak = sPref.getInt("maxStreak", 0)
        streakValue.text = "$myStreak"
        longestStreak.text = "$bestStreak"

        statHomeButton.setOnClickListener {
            finish()
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }


}