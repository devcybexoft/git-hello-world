package com.example.githelloworld

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val incButton: Button = findViewById(R.id.myButton)


        incButton.setOnClickListener {
            Toast.makeText(this,"hello world",Toast.LENGTH_SHORT).show()
        }

    }
}