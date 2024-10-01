package com.example.third

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    private var counter: Int = 0
    private var counter_cats: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textView: TextView  = findViewById(R.id.textView)
        val text_c: TextView  = findViewById(R.id.text_count)
        val text_cats: TextView = findViewById(R.id.text_cats)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = "Hello Kitty!"
            it.setBackgroundColor(Color.BLUE)
        }

        val button_counter: Button = findViewById(R.id.button_counter)
        button_counter.setOnClickListener{
            text_c.text = "Я насчитал ${++counter} ворон "
        }

        val button_cats: Button = findViewById(R.id.button_cat_counter)
        button_cats.setOnClickListener{
            text_cats.text = "Я насчитал ${++counter_cats} котов "
        }
    }
}