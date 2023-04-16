package com.example.sdcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.File
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val name = findViewById<EditText>(R.id.NAME)
        val cgpa = findViewById<EditText>(R.id.CGPA)


        btn1.setOnClickListener {
            val n = name.text.toString()
            val cgp = cgpa.text.toString()

            if (cgp.toFloat() > 10.0) {
                Toast.makeText(this, "CGPA MUST BE LESS THAN 10.0", Toast.LENGTH_LONG).show()
            } else {
                val file = File(getExternalFilesDir(null), "student.txt")
                val fos = FileOutputStream(file, false)
                fos.write("$n,$cgp".toByteArray())
                fos.close()
                name.setText("")
                cgpa.setText("")
            }

            btn2.setOnClickListener {
                val file = File(getExternalFilesDir(null), "student.txt")
                if (file.length() == 0L) {
                    Toast.makeText(this, "Error: File is empty", Toast.LENGTH_SHORT).show()
                } else {
                    val fis = FileInputStream(file)
                    val isr = InputStreamReader(fis)
                    val br = BufferedReader(isr)
                    val line: String = br.readLine()
                    val part = line.split(",")
                    name.setText(part[0])
                    cgpa.setText(part[1])
                    fis.close()

                }

            }

        }

    }
}