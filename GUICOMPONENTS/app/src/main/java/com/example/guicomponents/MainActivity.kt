package com.example.guicomponents



import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextField = findViewById<TextView>(R.id.textView)

        val myButton1 = findViewById<Button>(R.id.button1)

        val myButton2= findViewById<Button>(R.id.button2)

        val  mybutton3= findViewById<Button>(R.id.button3)

        var fontsize=6f

        var fontcolor=0

        myButton1.setOnClickListener {
            // Your code here
            myTextField.textSize=fontsize
            fontsize=(fontsize+5)%30
        }

        myButton2.setOnClickListener{
            when(fontcolor%5){
                0->myTextField.setTextColor(Color.RED)
                1->myTextField.setTextColor(Color.GREEN)
                2->myTextField.setTextColor(Color.BLUE)
            }
            fontcolor++
        }

        mybutton3.setOnClickListener{

            val text = myTextField.text.toString()

            if (text.isNotEmpty()) {
                Toast.makeText(this, "Text entered: $text", Toast.LENGTH_SHORT).show()
            }
        }


    }
}