package com.example.a357project

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.BufferedReader
import android.widget.Button
import android.widget.TextView
import java.util.*

import kotlin.random.Random.Default.nextInt

class QuestionActivity : AppCompatActivity() {

    lateinit var used: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        /* Initializes used questions list if uncreated,
           if created loads it into array. */
        val files: Array<String> = applicationContext.fileList()
        if (!files.contains("used")) {
            applicationContext.openFileOutput("used", Context.MODE_PRIVATE).use {
                it.write("".toByteArray())
            }
        } else {
            val reader: BufferedReader = applicationContext.openFileInput("used").bufferedReader()
            used = reader.readLines().toTypedArray()
        }

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

        questionLabel.text = currQ
        answerAButton.text = currA
        answerBButton.text = currB
        answerCButton.text = currC
        answerDButton.text = currD

        var correctAnswerString: String = "Answer_$currentQuestion"
        var correctAnswer: String = getString(applicationContext.resources.getIdentifier(
            correctAnswerString, "string", packageName))

        answerAButton.setOnClickListener{
            finish()
            if(correctAnswer == "A" ){
                val i = Intent(this, CorrectAnswerActivity::class.java)
                startActivity(i)
            }
            else {
                val i = Intent(this, WrongAnswerActivity::class.java)
                startActivity(i)
            }
        }

        answerBButton.setOnClickListener{
            finish()
            if(correctAnswer == "B" ){
                val i = Intent(this, CorrectAnswerActivity::class.java)
                startActivity(i)
            }
            else {
                val i = Intent(this, WrongAnswerActivity::class.java)
                startActivity(i)
            }

        }

        answerCButton.setOnClickListener{
            finish()
            if(correctAnswer == "C" ){
                val i = Intent(this, CorrectAnswerActivity::class.java)
                startActivity(i)
            }
            else {
                val i = Intent(this, WrongAnswerActivity::class.java)
                startActivity(i)
            }
        }

        answerDButton.setOnClickListener{
            finish()
            if(correctAnswer == "D" ){
                val i = Intent(this, CorrectAnswerActivity::class.java)
                startActivity(i)
            }
            else {
                val i = Intent(this, WrongAnswerActivity::class.java)
                startActivity(i)
            }

        }

    }
}