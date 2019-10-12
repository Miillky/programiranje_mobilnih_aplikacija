package com.example.dinerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val listaHrane = arrayListOf("Grah","Pohane šnicle","Gulaš","Špageti","Rižoto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener{
            val random = Random()
            val randomHrana = random.nextInt(listaHrane.count())
            addFoodTxt.setText(listaHrane[randomHrana])
        }
        addFoodBtn.setOnClickListener{
            val novaHrana = addFoodTxt.text.toString()
            listaHrane.add(novaHrana)
            addFoodTxt.text.clear()
        }
    }
}
