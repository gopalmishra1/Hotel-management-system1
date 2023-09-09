package com.example.digitalbhim


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import kotlin.math.log
import kotlin.math.roundToInt
private lateinit var advancepayment: EditText

class roominformation : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roominformation)
         advancepayment = findViewById<EditText>(R.id.advancepayment)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radiogroupAc = findViewById<RadioGroup>(R.id.radiogroupAc)
        val radiogroupLocker = findViewById<RadioGroup>(R.id.radiogroupLocker)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            val k =advancepayment.text.toString().toDoubleOrNull() ?: 0.0
            if (selectedRadioButton != null) {
                val selectedOption = selectedRadioButton.text.toString()
                // Perform actions based on the selected radio button
            }

            val paybutton = findViewById<Button>(R.id.paybutton)

            val roomtype = radioGroup.checkedRadioButtonId
            val acornonac = radiogroupAc.checkedRadioButtonId
            val locker = radiogroupLocker.checkedRadioButtonId
            var a = 0;
            var b = 0;
            var c = 0;
            var d = 0;
            var e = 0;
            var f = 0
            when (roomtype) {
                R.id.radioButtonOption1 -> {

                    a = 2500

                }

                R.id.radioButtonOption2 -> {

                    b = 4000
                }
            }
            when (acornonac) {
                R.id.radioButtonAc -> {

                    c = 1000

                }

                R.id.radioButtonNonAc -> {

                    d = 0
                }
            }
            when (locker) {
                R.id.radioButtonLocker -> {

                    e = 300

                }

                R.id.radioButtonNoLocker -> {

                    f = 0
                }
            }


            var totalAmount = a + b + c + d + e + f
            val person = intent.getStringExtra("person")
            var p= person?.toInt()
            if (p != null) {
                if(p>2)
                {
                     totalAmount= ((p-2)*totalAmount).toInt()
                }
            }
            val day = intent.getStringExtra("day")
            var x=day?.toInt()
         //   var x= day!!.toInt()
            if ( x != null) {
                totalAmount= (x * totalAmount).toInt()
            }
            //val sendvalue=totalAmount.toString()
            totalAmount = (totalAmount-k).toInt()
            paybutton.setOnClickListener{
                val intent = Intent(this, bill::class.java)
                val sendvalue=totalAmount.toString()
                intent.putExtra("sendvalue",sendvalue)


                startActivity(intent)

            }

        }

    }}












