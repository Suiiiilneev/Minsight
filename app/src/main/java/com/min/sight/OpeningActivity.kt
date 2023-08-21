package com.min.sight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OpeningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening)
        val btn = findViewById<ImageView>(R.id.btn)
        val policy_text = findViewById<ImageView>(R.id.text_policy)
        btn.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
        policy_text.setOnClickListener {
            startActivity(Intent(this, PolicyActivity::class.java))
        }
    }
}