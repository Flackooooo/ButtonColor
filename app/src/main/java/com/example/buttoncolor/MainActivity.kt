package com.example.buttoncolor

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRed.setOnClickListener {
            buttonRed.setBackgroundColor(Color.RED)
            background.setBackgroundColor(Color.RED)
        }
        buttonBlue.setOnClickListener {
            background.setBackgroundColor(Color.BLUE)
        }
    }

}
