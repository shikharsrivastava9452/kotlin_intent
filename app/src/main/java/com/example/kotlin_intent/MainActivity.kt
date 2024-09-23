package com.example.kotlin_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button= findViewById<Button>(R.id.button)
        Button.setOnClickListener(){
            intent= Intent(this, MainActivity2 ::class.java )
            startActivity(intent)
        }

    }
}