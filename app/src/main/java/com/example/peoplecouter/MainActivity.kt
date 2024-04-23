package com.example.peoplecouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.addButton)
        val btnClickMeS = findViewById<Button>(R.id.subtractButton)
        val btnClickMeR = findViewById<Button>(R.id.resetButton)
        val counter = findViewById<TextView>(R.id.Counter)
        var timesClicked = 0


        btnClickMe.setOnClickListener{
            timesClicked += 1

            counter.text = timesClicked.toString()
        }

        btnClickMeS.setOnClickListener{
            timesClicked -= 1

            counter.text = timesClicked.toString()
        }

        btnClickMeR.setOnClickListener{
            timesClicked = 0

            counter.text = timesClicked.toString()
        }

    }
}