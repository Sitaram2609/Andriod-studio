package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     val number1:EditText= findViewById(R.id.number1)
     val number2:EditText= findViewById(R.id.number2)
     val result:TextView= findViewById(R.id.result)
     val btn1:Button=  findViewById(R.id.button1)
     val btn2:Button= findViewById(R.id.button2)
     val btn3:Button=findViewById(R.id.button3)
     val btn4:Button= findViewById(R.id.button4)
     val btn5:Button= findViewById(R.id.button5)



        btn1.setOnClickListener {
            val a=number1.text.toString().toInt()
            val b=number2.text.toString().toInt()
            val res= a+b
            result.text = res.toString()
        }

        btn2.setOnClickListener {
            val a=number1.text.toString().toInt()
            val b=number2.text.toString().toInt()
            val res= a-b
            result.text = res.toString()
        }

        btn3.setOnClickListener {
            val a=number1.text.toString().toInt()
            val b=number2.text.toString().toInt()
            val res= a*b
            result.text=res.toString()
        }

        btn4.setOnClickListener {
            val a=number1.text.toString().toInt()
            val b=number2.text.toString().toInt()
            if(b==0){
                Toast.makeText(this, "Invalid Inputs", Toast.LENGTH_SHORT).show()
            }
            else{
                 val res= a/b
                result.text=res.toString()
            }
        }
        btn5.setOnClickListener {
         number1.text=null
         number2.text=null
         result.text=""
        }
    }
}