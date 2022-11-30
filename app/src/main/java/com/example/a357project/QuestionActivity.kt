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
        var currentQuestionString: String = "Question_" + currentQuestion
        var currentA: String = "A_"+currentQuestion
        var currentB: String = "B_"+currentQuestion
        var currentC: String = "C_"+currentQuestion
        var currentD: String = "D_"+currentQuestion
        var currQ: String = getString(applicationContext.resources.getIdentifier(
            currentQuestionString, "string", packageName))
        var currA : String = getString(applicationContext.resources.getIdentifier(
            currentA, "string", packageName))
        var currB : String = getString(applicationContext.resources.getIdentifier(
            currentB, "string", packageName))
        var currC : String = getString(applicationContext.resources.getIdentifier(
            currentC, "string", packageName))
        var currD : String = getString(applicationContext.resources.getIdentifier(
            currentD, "string", packageName))
        //We cant access by hard coding @String/currentQuestionString
        //Or by doing R.string.currentQuestionString
        questionLabel.text = currQ
        answerAButton.text = currA
        answerBButton.text = currB
        answerCButton.text = currC
        answerDButton.text = currD

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