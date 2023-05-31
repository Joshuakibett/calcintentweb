package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Txtanswer: TextView
    lateinit var edtfnum: EditText
    lateinit var edtsnum: EditText
    lateinit var Buttonadd: Button
    lateinit var Buttonsub: Button
    lateinit var Buttonmult: Button
    lateinit var Buttondiv: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Txtanswer = findViewById(R.id.Edt_answer)
        edtfnum = findViewById(R.id.Edt_fnum)
        edtsnum = findViewById(R.id.Edt_snum)
        Buttonadd = findViewById(R.id.Btn_add)
        Buttonsub = findViewById(R.id.Btn_sub)
        Buttonmult = findViewById(R.id.Btn_mult)
        Buttondiv = findViewById(R.id.Btn_div)

        Buttonadd.setOnClickListener {
            val firstnum = edtfnum.text.toString()
            val secondnum = edtsnum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                Txtanswer.text = "Please fill in all details"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                Txtanswer.text = answer.toString()
            }
        }
    }
}

