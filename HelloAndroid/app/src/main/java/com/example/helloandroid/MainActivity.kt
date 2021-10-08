package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText : EditText
    private lateinit var sayHelloButton : Button
    private lateinit var messageTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_editText)
        sayHelloButton = findViewById(R.id.sayHello_button)
        messageTextView = findViewById(R.id.message_textView)

        sayHelloButton.setOnClickListener {
            val greeting = nameEditText.text
            messageTextView.text = "Hello, ${greeting}!"
        }
    }

    fun clicked(view : View) {
        if(view.id == R.id.sayHello_button) {
            val greeting = nameEditText.text
            messageTextView.text = "Hello, ${greeting}!"
        }
    }
}