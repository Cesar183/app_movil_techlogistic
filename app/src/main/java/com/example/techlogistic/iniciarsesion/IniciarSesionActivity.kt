package com.example.techlogistic.iniciarsesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R
import com.example.techlogistic.dashboard_usuario.DashboardActivity

class IniciarSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        btnIniciarSesion.setOnClickListener {

            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (isValidCredentials(email, password)) {
                Toast.makeText(this, "Iniciando Sesion...", Toast.LENGTH_SHORT).show()
                dashBoardUsuario()
            } else {
                Toast.makeText(this, "Inicio de sesión fallido!", Toast.LENGTH_SHORT).show()
            }

        }
        val btnVolver = findViewById<Button>(R.id.btnVolverInicio)
        btnVolver.setOnClickListener {
            volverInicio()
        }
    }

    private fun isValidCredentials(email: String, password: String): Boolean {
        return (email == "john@correo.com" || email == "doe@correo.com") && (password == "1234" || password == "1234")
    }

    private fun dashBoardUsuario() {
        val intentVolver = Intent(this, DashboardActivity::class.java)
        startActivity(intentVolver)
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }

}