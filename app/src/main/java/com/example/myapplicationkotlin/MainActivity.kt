package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: MaterialTextView = findViewById(R.id.text)

        val button: MaterialButton = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = "Hello World!"


        }
    }
}

