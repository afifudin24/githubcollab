package com.example.wo_macro

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class Login : AppCompatActivity() {
    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var history : TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if (result.resultCode == Activity.RESULT_OK){
            val data: Intent? = result.data
            val returnString:String? = data?.getStringExtra("history")
            history.text =returnString

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.et_username)
        password = findViewById(R.id.Password)

        val bundle :Bundle? = intent.extras
        if (bundle != null){
            username.setText(bundle.getString("username"))
            password.setText(bundle.getString("password"))
        }

        val buttonlogin = findViewById<Button>(R.id.button1)
        buttonlogin.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@Login, HomeActivity :: class.java)
            intent.putExtra("user", user(username.text.toString(),password.text.toString()))
            resultLauncher.launch(intent)

        })
    }
}