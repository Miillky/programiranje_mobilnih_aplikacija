package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener {
            println("Klik na 0")
        }

        button1.setOnClickListener {
            println("Klik na 1")
        }

        button2.setOnClickListener {
            println("Klik na 2")
        }

        button3.setOnClickListener {
            println("Klik na 3")
        }

        button4.setOnClickListener {
            println("Klik na 4")
        }

        button5.setOnClickListener {
            println("Klik na 5")
        }

        button6.setOnClickListener {
            println("Klik na 6")
        }

        button7.setOnClickListener {
            println("Klik na 7")
        }

        button8.setOnClickListener {
            println("Klik na 8")
        }

        button9.setOnClickListener {
            println("Klik na 9")
        }

        buttonDivide.setOnClickListener {
            println("Klik na divide")
        }

        buttonMultiply.setOnClickListener {
            println("Klik na multply")
        }

        buttonMinus.setOnClickListener {
            println("Klik na minus")
        }

        buttonPlus.setOnClickListener {
            println("Klik na plus")
        }

        buttonDot.setOnClickListener {
            println("Klik na dot")
        }

        buttonEquals.setOnClickListener {
            println("Klik na equals")
        }
    }
}
