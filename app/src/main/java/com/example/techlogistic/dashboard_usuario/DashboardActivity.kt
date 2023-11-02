package com.example.techlogistic.dashboard_usuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.techlogistic.InicioActivity
import com.example.techlogistic.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnVolver = findViewById<Button>(R.id.btnVolverInicio3)
        btnVolver.setOnClickListener { volverInicio() }
    }

    private fun volverInicio() {
        val intentVolver = Intent(this, InicioActivity::class.java)
        startActivity(intentVolver)
    }
}