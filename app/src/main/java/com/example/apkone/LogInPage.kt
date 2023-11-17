@file:Suppress("DEPRECATION")

package com.example.apkone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class LogInPage : AppCompatActivity() {

    private lateinit var signup:TextView

    private fun init(){
        signup = findViewById(R.id.signup_btn)
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_log_in_page)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(resources.getDrawable(R.color.page_background))
        init()


        signup.setOnClickListener {
            val intent = Intent(this,SignUpPage::class.java)
            startActivity(intent)
        }
    }
}