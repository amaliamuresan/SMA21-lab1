package com.example.helloandroid.lifecycle

import android.content.Intent
import android.view.View
import com.example.helloandroid.R

class CLick {

    fun clicked(view: View) {
        var intent: Intent
        val context = view.context
        if (view.id == R.id.buttonA) {
            intent = Intent(context, ActivityA::class.java)
            context.startActivity(intent)
        }

        if (view.id == R.id.buttonB) {
            intent = Intent(context, ActivityB::class.java)
            context.startActivity(intent)
        }

        if (view.id == R.id.buttonC) {
            intent = Intent(context, ActivityC::class.java)
            context.startActivity(intent)
        }
    }
}