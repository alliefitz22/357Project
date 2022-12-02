package com.example.a357project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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