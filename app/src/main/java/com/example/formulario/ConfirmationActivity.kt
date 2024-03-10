package com.example.formulario

// ConfirmationActivity.kt
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        // Recuperar datos del formulario
        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val phoneNumber = intent.getStringExtra("PHONE_NUMBER")
        val cedula = intent.getStringExtra("CEDULA")

        // Mostrar datos en la pantalla de confirmación
        val tvConfirmation = findViewById<TextView>(R.id.tvConfirmation)
        val confirmationText = "Nombre: $name\nCorreo: $email\nNúmero de teléfono: $phoneNumber\nCédula: $cedula"
        tvConfirmation.text = confirmationText

        val btnFinish = findViewById<Button>(R.id.btnFinish)
        btnFinish.setOnClickListener {
            // Volver a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}


