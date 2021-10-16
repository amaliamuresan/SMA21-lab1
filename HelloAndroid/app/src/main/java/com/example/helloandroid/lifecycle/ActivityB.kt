package com.example.helloandroid.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.helloandroid.R
import com.example.helloandroid.databinding.ActivityABinding
import com.example.helloandroid.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private val logTag  = "ActivityB"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityBBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_b)

        binding.click = CLick()
    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(logTag, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(logTag, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "onDestroy()")
    }
}