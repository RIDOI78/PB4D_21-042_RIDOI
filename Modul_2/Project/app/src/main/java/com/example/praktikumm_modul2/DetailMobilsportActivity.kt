package com.example.praktikumm_modul2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.parcel.Parcelize

class DetailMobilsportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mobilsport)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val mobilsport = intent.getParcelableExtra<Mobilsport>(MainActivity.INTENT_PARCELABLE)

        val imgMobilsport = findViewById<ImageView>(R.id.img_item_photo)
        val nameMobilsport = findViewById<TextView>(R.id.tv_item_name)
        val descMobilsport = findViewById<TextView>(R.id.tv_item_description)

        imgMobilsport.setImageResource(mobilsport?.imgMobilsport!!)
        nameMobilsport.text = mobilsport.nameMobilsport
        descMobilsport.text = mobilsport.descMobilsport
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}