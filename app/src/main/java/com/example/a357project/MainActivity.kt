package com.example.a357project

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sPref = applicationContext.getSharedPreferences("MyPref", 0)
        if (!(sPref.contains("currentStreak"))){
            val editor: SharedPreferences.Editor = sPref.edit()
            editor.putInt("currentStreak", 0)
            editor.putInt("maxStreak", 0)
            editor.apply()
        }




        val playButton = findViewById<Button>(R.id.playButton)
        val statsButton = findViewById<Button>(R.id.statsButton)


        playButton.setOnClickListener {
            finish()
            val i = Intent(this, QuestionActivity::class.java)
            startActivity(i)
        }

        statsButton.setOnClickListener {
            finish()
            val i = Intent(this, StatsActivity::class.java)
            startActivity(i)
        }
    }
}