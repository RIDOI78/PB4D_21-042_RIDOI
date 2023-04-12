package com.example.project3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firshop = findViewById<Button>(R.id.firshop)
        firshop.setOnClickListener {
            Intent(this, DetailFirshop::class.java).also {
                startActivity(it)
            }
        }

        val twitter = findViewById<Button>(R.id.twitter)
        twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://twitter.com/Firshop_purple?t=TAvyCNQvRLZGXOALKHX7hQ&s=08")
            startActivity(intent)
        }
    }
}