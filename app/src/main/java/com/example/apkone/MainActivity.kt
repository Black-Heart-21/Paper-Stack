package com.example.apkone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.ActionBar

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val delayTime: Long = 2000

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(resources.getDrawable(R.color.page_background))

        Handler().postDelayed({
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }, delayTime)
    }
}