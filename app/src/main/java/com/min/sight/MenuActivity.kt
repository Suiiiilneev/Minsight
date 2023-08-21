package com.min.sight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btn = findViewById<ImageView>(R.id.btnquest)
        val btn2 = findViewById<ImageView>(R.id.btnpolicy)

        btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, PolicyActivity::class.java))
        }
    }
}