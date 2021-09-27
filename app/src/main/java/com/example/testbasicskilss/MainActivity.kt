package com.example.testbasicskilss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var nameField:EditText
    lateinit var LocationField:EditText
    lateinit var PhoneField:EditText
    lateinit var butToa:Button
    lateinit var butGo:Button
    lateinit var butTv:Button
    lateinit var infoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameField=findViewById(R.id.ed1)
        LocationField=findViewById(R.id.edLocation)
        PhoneField=findViewById(R.id.edPhone)
        infoTextView=findViewById(R.id.textView)


        val infoList= listOf<Any>(nameField.text,LocationField.text,PhoneField.text)

        butToa=findViewById(R.id.butToa)
        butGo=findViewById(R.id.butGo)
        butTv=findViewById(R.id.butTv)

        butToa.setOnClickListener(){
            Toast.makeText(getApplicationContext(), infoList.toString(),Toast.LENGTH_LONG).show()
        }

        butTv.setOnClickListener(){
            infoTextView.text=infoList.toString()
        }
        butGo.setOnClickListener(){
            val msg="your name is ${nameField.text}, your location is ${LocationField.text} and your phone is ${PhoneField.text} "
            val intent=Intent(this,GoActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE,msg)
            startActivity(intent)

            //val intent=Intent(this,PrintOut::class.java)
           // intent.putExtra(EXTRA_MESSAGE, "helo" )
           // startActivity(intent)
        }
    }
}