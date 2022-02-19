package com.cbtis.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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