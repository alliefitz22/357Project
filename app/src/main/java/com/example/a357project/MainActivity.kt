package com.example.a357project

import android.Manifest
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

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
        val h2pButton = findViewById<Button>(R.id.howToPlay)

        h2pButton.setOnClickListener{
            val i = Intent(this, HowToPlayActivity::class.java)
            startActivity(i)
        }


        playButton.setOnClickListener {
            finish()
            val i = Intent(this, QuestionActivity::class.java)
            startActivity(i)
        }

        statsButton.setOnClickListener {
            val i = Intent(this, StatsActivity::class.java)
            startActivity(i)
        }

        /* Storage write permissions required to save results on older API levels.
           This requests said permissions only if on older API levels. Could probably
           be done elsewhere but I saw something suggesting it should be done here? */
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            val check = ContextCompat.checkSelfPermission(this, Manifest.permission.
                WRITE_EXTERNAL_STORAGE)
            if (check != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                    0)
            }
        }
    }
}