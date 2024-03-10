package com.example.formulario
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText


class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            // Obtener datos del formulario
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()
            val phoneNumber = findViewById<EditText>(R.id.etPhoneNumber).text.toString()
            val cedula = findViewById<EditText>(R.id.etCedula).text.toString()

            // Enviar datos a ConfirmationActivity
            val intent = Intent(this, ConfirmationActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PHONE_NUMBER", phoneNumber)
            intent.putExtra("CEDULA", cedula)
            startActivity(intent)
        }
    }
}

