package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBut: Button = findViewById(R.id.rollBut)

        rollBut.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val resultText = findViewById<TextView>(R.id.textView)
        val num = Random.nextInt(6) + 1
        resultText.text = num.toString()
    }
}
