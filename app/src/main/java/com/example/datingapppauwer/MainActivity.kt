package com.example.datingapppauwer

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import com.example.datingapppauwer.sign_up


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signUpButton: Button = findViewById(R.id.SignUpButton)
        val loginButton: Button =
            findViewById(R.id.loginButton)

        signUpButton.setOnClickListener(this)
        loginButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.SignUpButton -> {
                    val signUpIntent = Intent(this, sign_up::class.java)
                    startActivity(signUpIntent)
                }

                R.id.loginButton -> {
                    val loginIntent = Intent(this, Login::class.java)
                    startActivity(loginIntent)
                }

                else -> {

                }
            }
        }
    }
}