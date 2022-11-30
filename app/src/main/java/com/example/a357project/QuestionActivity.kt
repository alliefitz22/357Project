package com.example.a357project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

import kotlin.random.Random.Default.nextInt

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var questionLabel = findViewById<TextView>(R.id.question)
        var answerAButton = findViewById<Button>(R.id.answerA)
        var answerBButton = findViewById<Button>(R.id.answerB)
        var answerCButton = findViewById<Button>(R.id.answerC)
        var answerDButton = findViewById<Button>(R.id.answerD)
        var currentQuestion = Random().nextInt(1998) + 10000
        var currentQuestionString = "Question_" + currentQuestion
        //We cant access by hard coding @String/currentQuestionString
        //Or by doing R.string.currentQuestionString
        questionLabel.text = getString(R.string.Question_10111)
        answerAButton.text = getString(R.string.A_10111)
        answerBButton.text = getString(R.string.B_10111)
        answerCButton.text = getString(R.string.C_10111)
        answerDButton.text = getString(R.string.D_10111)

        answerAButton.setOnClickListener{
            val i = Intent(this, QuestionActivity::class.java)
            //Logic to see if this button has correct value and go to either screen
            startActivity(i)

        }

        answerBButton.setOnClickListener{
            val i = Intent(this, QuestionActivity::class.java)
            //Logic to see if this button has correct value and go to either screen
            startActivity(i)

        }

        answerCButton.setOnClickListener{
            val i = Intent(this, QuestionActivity::class.java)
            //Logic to see if this button has correct value and go to either screen
            startActivity(i)

        }

        answerDButton.setOnClickListener{
            val i = Intent(this, QuestionActivity::class.java)
            //Logic to see if this button has correct value and go to either screen
            startActivity(i)

        }

    }
}