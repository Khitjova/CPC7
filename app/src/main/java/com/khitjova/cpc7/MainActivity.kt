package com.khitjova.cpc7

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
private const val KEY = "HELLO_KEY"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.show_button)
        showButton.setOnClickListener {

          showSnackbar(it)
        }
        val helloButton: Button = findViewById(R.id.hello)
        helloButton.setOnClickListener {
            Toast.makeText(this, "Hello, dear!", Toast.LENGTH_LONG).show()
        }
        val byeButton: Button = findViewById(R.id.Bye)
        val link = Uri.parse("https://youtu.be/8XnpchAzuM8")
        val intent = Intent(Intent.ACTION_VIEW, link)
        byeButton.setOnClickListener {
            startActivity(intent)
        }

    }
    private fun showSnackbar(view: View){
        Snackbar.make(this,view, "You pressed button",Snackbar.LENGTH_INDEFINITE)
            .setAction("Action"){
                Toast.makeText(this, "Well done!", Toast.LENGTH_LONG).show()
            }
            .show()

    }
}