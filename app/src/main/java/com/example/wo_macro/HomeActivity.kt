package com.example.wo_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)

            tv = findViewById(R.id.textViewhm)

            val username :String? = intent.getParcelableExtra<user>("user")?.username
            val password :String? = intent.getParcelableExtra<user>("user")?.password

            tv.text = "username: $username password: $password"
        val tombol = findViewById<Button>(R.id.tombol)
        tombol.setOnClickListener {
            val intentB = Intent(this, BerandActivity::class.java)
            startActivity(intentB)
        }
    }
}
