package com.example.helloandroid.intents

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.helloandroid.R

class MainFilterActivity : AppCompatActivity() {
    lateinit var messageTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_filter)
        messageTextView = findViewById(R.id.message_textView)
        val uri : Uri? = intent.data
        messageTextView.text = uri.toString()

    }
}