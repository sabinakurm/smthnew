package com.example.smth

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonSecond = findViewById<Button>(R.id.buttonSecond)
        buttonSecond.setOnClickListener{
            finish()
        }
    }
}