package com.example.napat.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import com.example.napat.myapplication.R.id.Num1
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private var calculate = Calculate()
    private var getnumber = Getnumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result.text = "Calculate"
        var sum = "0"
        bt_plus.setOnClickListener({
            result.text = (("" + getnumber.getNumView(Num1) + " + " + getnumber.getNumView(Num2)))
            sum = calculate.Plus(getnumber.getnumcal(Num1), getnumber.getnumcal(Num2))
        })
        bt_minus.setOnClickListener({
            result.text = (("" + getnumber.getNumView(Num1) + " - " + getnumber.getNumView(Num2)))
            sum = calculate.Minus(getnumber.getnumcal(Num1), getnumber.getnumcal(Num2))
        })
        bt_multiply.setOnClickListener({
            result.text = (("" + getnumber.getNumView(Num1)  + " * " + getnumber.getNumView(Num2)))
            sum =   calculate.Multiply(getnumber.getnumcal(Num1), getnumber.getnumcal(Num1))
        })
        bt_divide.setOnClickListener({
            result.text = (("" + getnumber.getNumView(Num1)  + " / " + getnumber.getNumView(Num2)))
            sum = calculate.Divider(getnumber.getnumcal(Num1), getnumber.getnumcal(Num2))
        })
        bt_sum.setOnClickListener({
            result.text = sum
        })
    }
}
