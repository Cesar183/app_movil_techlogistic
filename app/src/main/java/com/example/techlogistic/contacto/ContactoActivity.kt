package com.example.techlogistic.contacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class ContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val btnContactar = findViewById<Button>(R.id.btnContactar)
        btnContactar.setOnClickListener {
            Toast.makeText(this, "Pronto un asesor se pondrá en contacto", Toast.LENGTH_SHORT).show()
        }
        val btnVolver = findViewById<Button>(R.id.btnVolverInicio2)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }
    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }
}