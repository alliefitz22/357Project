package com.example.a357project

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SettingsActivity : AppCompatActivity() {

    private var diffSelection: String? = "Easy"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        //setSupportActionBar(findViewById(R.id.toolbar))
        title = getString(R.string.Settings)
        val sPref = applicationContext.getSharedPreferences("MyPref", 0)
        val editor: SharedPreferences.Editor = sPref.edit()

        diffSelection = sPref.getString("diffValue", "Easy")

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            editor.putString("diffValue", diffSelection)
            editor.apply()
            /*val i = Intent(this, MainActivity::class.java)
            startActivity(i)*/
            finish()
        }

        val diffSpinner = findViewById<Spinner>(R.id.diffSpinner)
        val diffAdapter = ArrayAdapter.createFromResource(
            this, R.array.difficultyArray,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
        )
        diffAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        diffSpinner.adapter = diffAdapter
        val dpos = diffAdapter.getPosition(diffSelection)
        diffSpinner.setSelection(dpos)
        diffSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, i: Int, l: Long) {
                diffSelection = adapterView?.getItemAtPosition(i) as String
            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
        }

    }

}
