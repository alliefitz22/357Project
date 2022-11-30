package com.example.a357project

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.BufferedReader

class QuestionActivity : AppCompatActivity() {

    lateinit var used: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val files: Array<String> = applicationContext.fileList()
        if (!files.contains("used")) {
            applicationContext.openFileOutput("used", Context.MODE_PRIVATE).use {
                it.write("".toByteArray())
            }
        } else {
            val reader: BufferedReader = applicationContext.openFileInput("used").bufferedReader()
            used = reader.readLines().toTypedArray()
        }
    }
}