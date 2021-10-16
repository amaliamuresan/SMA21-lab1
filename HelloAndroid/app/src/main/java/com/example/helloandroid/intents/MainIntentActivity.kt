package com.example.helloandroid.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.helloandroid.R

class MainIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intent)
    }

    fun clickedButton1(view : View) {
        val uri : Uri = Uri.parse("http://www.google.com")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    fun clickedButton2(view : View) {
        val uri : Uri = Uri.parse("tel:00401213456")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    fun clickedButton3(view : View) {
        Log.d("Button3", "onClick 3 pressed")
        val uri : Uri = Uri.parse("http://www.google.com")
        val intent = Intent("MSA.LAUNCH", uri)
        startActivity(intent)
    }

    fun clickedButton4(view : View) {
        val uri : Uri = Uri.parse("tel:00401213456")
        val intent = Intent("MSA.LAUNCH", uri)
        startActivity(intent)
    }


}