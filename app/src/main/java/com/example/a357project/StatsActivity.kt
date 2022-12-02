package com.example.a357project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StatsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        val statHomeButton = findViewById<Button>(R.id.stats2home)
        statHomeButton.setOnClickListener{
            finish()
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }


}