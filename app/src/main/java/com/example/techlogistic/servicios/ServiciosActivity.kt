package com.example.techlogistic.servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class ServiciosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)

        val btnVolver = findViewById<Button>(R.id.btnBackOfServ)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }
}