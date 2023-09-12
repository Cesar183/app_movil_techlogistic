package com.example.techlogistic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.techlogistic.acercade.AcercaDeActivity
import com.example.techlogistic.contacto.ContactoActivity
import com.example.techlogistic.iniciarsesion.IniciarSesionActivity
import com.example.techlogistic.registrarse.RegistroActivity
import com.example.techlogistic.servicios.ServiciosActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val btnSolicitaDemo = findViewById<Button>(R.id.btnSolicitaDemo)
        btnSolicitaDemo.setOnClickListener {
            Toast.makeText(this, "Demo por el momento se encuentra desabilitado", Toast.LENGTH_SHORT).show()
        }
        val btnRegistro2 = findViewById<Button>(R.id.btnRegistro2)
        btnRegistro2.setOnClickListener {
            registarse()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.btnRegistro -> registarse()
            R.id.btnIniciarSesion -> iniciarSesion()
            R.id.btnContacto -> contacto()
            R.id.btnServicios -> servicios()
            R.id.btnAcercaDe -> acercaDe()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun acercaDe() {
        val intentAcercaDe = Intent(this, AcercaDeActivity::class.java)
        startActivity(intentAcercaDe)
    }

    private fun servicios() {
        val intentServicios = Intent(this, ServiciosActivity::class.java)
        startActivity(intentServicios)
    }

    private fun contacto() {
        val intentContacto = Intent(this, ContactoActivity::class.java)
        startActivity(intentContacto)
    }

    private fun iniciarSesion() {
        val intentIniciarSesion = Intent(this, IniciarSesionActivity::class.java)
        startActivity(intentIniciarSesion)
    }

    private fun registarse() {
        val intentRegistarse = Intent(this, RegistroActivity::class.java)
        startActivity(intentRegistarse)
    }
}