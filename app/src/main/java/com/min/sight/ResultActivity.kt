package com.min.sight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var correctAns: TextView
    lateinit var totalAns: TextView
    lateinit var performance: TextView
    lateinit var output: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()
        val btn_result = findViewById<ImageView>(R.id.imageView2)
        correctAns=findViewById(R.id.correctAns)
        totalAns=findViewById(R.id.totalAns)
        performance=findViewById(R.id.performance)
        output=findViewById(R.id.output)

        val intent = intent
        val correctAnsNo=intent.getStringExtra("correct")
        val totalAnsNo=intent.getStringExtra("total")
        correctAns.text=correctAnsNo
        totalAns.text=totalAnsNo

        val percentage= (correctAnsNo?.toFloat()?.div(totalAnsNo?.toFloat()!!))?.times(100)

        btn_result.setOnClickListener{
            startActivity(Intent(this, MenuActivity::class.java))
        }
        if (percentage != null) {
            when {
                50 <= percentage && percentage <= 99 -> {

                    performance.text="Неплохо"
                    output.background=resources.getDrawable(R.drawable.option_bg)


                }
                percentage>=100 -> {
                    performance.text="Отлично"
                    output.background=resources.getDrawable(R.drawable.right_bg)
                }
                percentage<50 -> {
                    performance.text="Плохо"
                    output.background=resources.getDrawable(R.drawable.wrong_bg)
                }
            }


        }
    }

    override fun onBackPressed() {
        var intent= Intent(this,OpeningActivity::class.java)
        startActivity(intent)
    }
}
