package com.example.datingapppauwer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.buttonLoginMasuk)
        loginButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.buttonLoginMasuk -> {
                    val signUpIntent = Intent(this, ExploreActivity::class.java)
                    startActivity(signUpIntent)
                }
            }
        }
    }
}