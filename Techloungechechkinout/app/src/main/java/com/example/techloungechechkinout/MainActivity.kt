package com.example.techloungechechkinout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val textfield=findViewById<TextView>(R.id.textView)
        val btn1=findViewById<Button>(R.id.button1)
        val btn2=findViewById<Button>(R.id.button2)
        val btn3=findViewById<Button>(R.id.button3)

        var cnt=0

        btn1.setOnClickListener {
            cnt +=1
            textfield.text=cnt.toString()
        }

        btn2.setOnClickListener {
            cnt -=1
            textfield.text=cnt.toString()
        }

        btn3.setOnClickListener {
            cnt=0
            textfield.text=cnt.toString()

        }
    }
}