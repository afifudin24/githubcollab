package com.example.wo_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Daftar : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var confirmpass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        username = findViewById(R.id.ed_username)
        password = findViewById(R.id.PasswordDF)
        confirmpass = findViewById(R.id.confirmPassword3)

        val buttonregister = findViewById<Button>(R.id.buttondf)
        buttonregister.setOnClickListener(View.OnClickListener {

            val bundle = Bundle()
            bundle. putString("username", username.text.toString())
            bundle. putString("password", password.text.toString())

            val intent = Intent(this@Daftar, Login :: class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

    }
}