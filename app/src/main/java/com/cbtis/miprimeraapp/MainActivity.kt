package com.cbtis.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val etNombre = findViewById<EditText>(R.id.etNombre)

        bSaludar.setOnClickListener (View.OnClickListener {

            if (validaDato()){
                Toast.makeText( this,  "Bienvenido "+ etNombre.text, Toast.LENGTH_LONG).show()
            }


        })

    }
    fun validaDato(): Boolean{
            val etNombre = findViewById<EditText>(R.id.etNombre)
            val nombreUsuario = etNombre.text
            if(nombreUsuario.isNullOrEmpty()){
                return false
            }


        return true
    }
}