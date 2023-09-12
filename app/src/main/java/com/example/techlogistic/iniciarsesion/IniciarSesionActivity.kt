package com.example.techlogistic.iniciarsesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class IniciarSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        btnIniciarSesion.setOnClickListener {
            Toast.makeText(this, "Inicio de sesión Pendiente", Toast.LENGTH_SHORT).show()
        }
        val btnVolver = findViewById<Button>(R.id.btnVolverInicio)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }

}