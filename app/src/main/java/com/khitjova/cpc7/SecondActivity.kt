package com.khitjova.cpc7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.security.Key

private const val KEY = "HELLO_KEY"
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}