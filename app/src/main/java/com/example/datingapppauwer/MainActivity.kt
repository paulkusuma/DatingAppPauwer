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


        val buttonClick: Button = findViewById(R.id.SignUpButton)
        buttonClick.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.SignUpButton -> {
                    val moveIntent = Intent(this, sign_up::class.java)
                    startActivities(arrayOf(moveIntent))

                }
            }
        }
    }
}