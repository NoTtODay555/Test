package com.example.napat.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.napat.myapplication.R.id.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.sql.Types.NULL
import kotlin.math.floor

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result.text = "Calculate"

        var sum :Float = 0F


        bt_plus.setOnClickListener(View.OnClickListener {

            result.text = (("" + getnum1(Num1).toInt() + " + " + getnum2(Num2).toInt()).toString())?.toUpperCase()

            sum =  getnum1(Num1) + getnum2(Num2)

        })
        bt_minus.setOnClickListener(View.OnClickListener {
            result.text = (("" + getnum1(Num1).toInt() + " - " + getnum2(Num2).toInt()).toString())?.toUpperCase()
            sum = getnum1(Num1).minus(getnum2(Num2))

        })
        bt_multiply.setOnClickListener(View.OnClickListener {
            result.text = (("" + getnum1(Num1).toInt() + " * " + getnum2(Num2).toInt()).toString())?.toUpperCase()
            sum = getnum1(Num1).times(getnum2(Num2))

        })
        bt_divide.setOnClickListener(View.OnClickListener {
            result.text = (("" + getnum1(Num1).toInt() + " / " + getnum2(Num2).toInt()).toString())?.toUpperCase()
            sum = getnum1(Num1).div(getnum2(Num2))


        })
        bt_sum.setOnClickListener(View.OnClickListener(function = {
            result.text = sum.toString()
        }))
    }
    private fun getnum1(input_num1: EditText?) : Float {
            return ((input_num1?.text).toString()).toFloat()
        }
    private fun getnum2(input_num2: EditText?) : Float {
        return ((input_num2?.text?:0).toString()).toFloat()
    }
}






