package com.example.techlogistic.acercade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class AcercaDeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        val btnVolver = findViewById<Button>(R.id.btnVolverOfAcerca)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }
}