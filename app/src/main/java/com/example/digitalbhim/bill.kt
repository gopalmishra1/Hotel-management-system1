package com.example.digitalbhim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val sendvalue= intent.getStringExtra("sendvalue")
       // val inputNumber = intent.getStringExtra("inputNumber")
    //    val result = totalbill?.toIntOrNull() ?: 0
        // You can perform additional operations here as needed.
    //    if (totalAmount != null) {
            // Display the result in the TextView
            textViewResult.text = " ToPay $sendvalue"
      //  }
    }
}