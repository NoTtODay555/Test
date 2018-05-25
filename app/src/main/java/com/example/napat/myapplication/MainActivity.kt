package com.example.napat.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        open class Calculate
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result.text = "Calculate"
        var sum = "0"
        test.text = com.example.napat.myapplication.Calculate().Plus(getnum(Num1),getnum(Num2))



        bt_plus.setOnClickListener({

            result.text = (("" + getnum(Num1) + " + " + getnum(Num2)))
            sum = com.example.napat.myapplication.Calculate().Plus(getnum(Num1),getnum(Num2))

        })
        bt_minus.setOnClickListener({
            result.text = (("" + getnum(Num1) + " - " + getnum(Num2)))
            sum = com.example.napat.myapplication.Calculate().Minus(getnum(Num1),getnum(Num2))

        })
        bt_multiply.setOnClickListener({
            result.text = (("" + getnum(Num1) + " * " + getnum(Num2)))
            sum =   com.example.napat.myapplication.Calculate().Multiply(getnum(Num1),getnum(Num2))

        })
        bt_divide.setOnClickListener({
            result.text = (("" + getnum(Num1) + " / " + getnum(Num2)))
            sum = com.example.napat.myapplication.Calculate().Divider(getnum(Num1),getnum(Num2))


        })
        bt_sum.setOnClickListener({
            result.text = sum
        })
    }

    private fun getnum(input_num1: EditText): Float {
        val lengh = input_num1.length()
        if (lengh <= 0) {
            return 0F
        } else {
            return ((input_num1.text).toString()).toFloat()
        }

    }
}



