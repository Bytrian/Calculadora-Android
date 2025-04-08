package com.example.miprimeraapp

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numero1 = findViewById<EditText>(R.id.num1);
        val numero2 = findViewById<EditText>(R.id.num2);
        val botonSumar = findViewById<AppCompatButton>(R.id.btnsumar);

        botonSumar.setOnClickListener{
            val num1 = numero1.text.toString().toInt();
            val num2 = numero2.text.toString().toInt();
            val suma = num1 + num2

            Toast.makeText(this, "El resultado de la suma es: ${suma}", Toast.LENGTH_SHORT).show()
        }

    }
}