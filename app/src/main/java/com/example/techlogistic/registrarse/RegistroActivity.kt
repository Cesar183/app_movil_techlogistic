package com.example.techlogistic.registrarse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnRegistar = findViewById<Button>(R.id.btnRegistrar)
        btnRegistar.setOnClickListener {
            Toast.makeText(this, "Registro Pendiente", Toast.LENGTH_SHORT).show()
        }
        val btnVolver = findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }

}