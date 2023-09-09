package com.example.digitalbhim
import android.app.DatePickerDialog
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import java.util.Calendar


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val Noofday =findViewById<TextView>(R.id.Noofday)
        val psNumber =findViewById<TextView>(R.id.psNumber)
        btnRegister.setOnClickListener {
            val  day= Noofday.text.toString()
            val  person= psNumber.text.toString()
            val intent = Intent(this, roominformation::class.java)
            intent.putExtra("day",day)
            intent.putExtra("person",person)

            startActivity(intent)

        }

}}