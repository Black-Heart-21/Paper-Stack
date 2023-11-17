package com.example.apkone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class SignUpPage : AppCompatActivity() {

    private lateinit var signin: TextView

    fun init(){
        signin = findViewById(R.id.signin_btn)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_sign_up_page)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(resources.getDrawable(R.color.page_background))
        init()

        signin.setOnClickListener {
            val intent = Intent(this,LogInPage::class.java)
            startActivity(intent)
        }
    }
}