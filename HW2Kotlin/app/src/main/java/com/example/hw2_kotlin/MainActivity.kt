package com.example.hw2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonShrek1:Button = findViewById(R.id.buttonS1)
        val buttonShrek2:Button = findViewById(R.id.buttonS2)
        val buttonFiona1:Button = findViewById(R.id.buttonF1)
        val buttonFiona2:Button = findViewById(R.id.buttonF2)
        val buttonFiona3:Button = findViewById(R.id.buttonF3)
        val buttonDonkey1:Button = findViewById(R.id.buttonD1)
        val buttonDonkey2:Button = findViewById(R.id.buttonD2)

        val textBox:TextView = findViewById(R.id.mYtext)

        buttonShrek1.setOnClickListener {
            val shrek = Shrek()
            textBox.text = shrek.whereIsHe()
        }

        buttonShrek2.setOnClickListener {
            val shrek = Shrek()
            textBox.text = shrek.specialPhrase()
        }

        buttonDonkey1.setOnClickListener {
            val donkey = Donkey()
            textBox.text = donkey.whereIsHe()
        }

        buttonDonkey2.setOnClickListener {
            val donkey = Donkey()
            textBox.text = donkey.specialPhrase()
        }

        buttonFiona1.setOnClickListener {
            val fiona = Fiona()
            textBox.text = fiona.whereIsHe()
        }

        buttonFiona2.setOnClickListener {
            val fiona = Fiona()
            textBox.text = fiona.specialPhrase()
        }

        buttonFiona3.setOnClickListener {
            val fiona = Fiona()
            textBox.text = fiona.whatIsSheDoing()
        }

    }
}
