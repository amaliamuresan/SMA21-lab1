package com.example.helloandroid

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var messageTextView: TextView
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_editText)
        sayHelloButton = findViewById(R.id.sayHello_button)
        messageTextView = findViewById(R.id.message_textView)
        spinner = findViewById(R.id.spinner)

        val dialogBuilder = AlertDialog.Builder(this)

        val spinnerContent = resources.getStringArray(R.array.spinner_content)
        val spinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerContent)

        spinner.adapter = spinnerAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> sayHelloButton.setTextColor(Color.BLACK)
                    1 -> sayHelloButton.setTextColor(Color.BLUE)
                    2 -> sayHelloButton.setTextColor(Color.RED)
                    3 -> sayHelloButton.setTextColor(Color.GREEN)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

        }



        dialogBuilder
            .setTitle("Alert")
            .setMessage("Choose type of message to show")
            .setPositiveButton("Happy Message") { _, _ ->
                Toast.makeText(this, "Some happy message right here", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("Sad Message") { _, _ ->
                Toast.makeText(this, "Some sad message right here", Toast.LENGTH_LONG).show()
            }
        val dialog = dialogBuilder.create()

        sayHelloButton.setOnClickListener {
            dialog.show()
            val greeting = nameEditText.text
            messageTextView.text = "Hello, ${greeting}!"
        }

    }

    fun actionSend(view: View) {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra("name", messageTextView.text)
        intent.type = "text/plain"

        startActivity(intent)

    }

    fun actionShare(view: View) {
        val wordToSearch = messageTextView.text
        val uri: Uri = Uri.parse("https://www.google.com/search?q=$wordToSearch")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        if(messageTextView.length() == 0) {
            Toast.makeText(this, "Complete the field before searching", Toast.LENGTH_SHORT).show()
            return
        }
        startActivity(intent)

    }

    /*fun clicked(view : View) {
        if(view.id == R.id.sayHello_button) {
            val greeting = nameEditText.text
            messageTextView.text = "Hello, ${greeting}!"
        }
    }*/
}