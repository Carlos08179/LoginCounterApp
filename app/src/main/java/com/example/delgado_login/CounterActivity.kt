package com.example.delgado_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CounterActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnDecrement = findViewById<Button>(R.id.btnDecrement)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Actualizar el contador en la vista
        updateCounter(tvCounter)

        btnIncrement.setOnClickListener {
            counter++
            updateCounter(tvCounter)
        }

        btnDecrement.setOnClickListener {
            if (counter > 0) {
                counter--
                updateCounter(tvCounter)
            }
        }

        btnReset.setOnClickListener {
            counter = 0
            updateCounter(tvCounter)
        }
    }

    private fun updateCounter(textView: TextView) {
        textView.text = counter.toString()
    }
}