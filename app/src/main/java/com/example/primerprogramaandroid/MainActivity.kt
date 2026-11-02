package com.example.primerprogramaandroid

import android.os.Bundle
import android.widget.Button
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz gráfica
        setContentView(R.layout.activity_main)

        // Obtener el botón de la interfaz
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        // Evento del botón
        btnSaludar.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Primer programa Android")
                .setMessage("Cesar Uriel Flores Bernal")
                .setPositiveButton("Aceptar", null)
                .show()

        }
    }
}