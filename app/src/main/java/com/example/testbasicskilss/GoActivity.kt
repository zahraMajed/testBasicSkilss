package com.example.testbasicskilss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class GoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go)
        val extra=intent.getStringExtra(EXTRA_MESSAGE)
        val info=findViewById<TextView>(R.id.tvInfo).apply {
            text=extra
        }

    }
}