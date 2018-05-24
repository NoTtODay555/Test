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

        var sum = 0F
        test.text = getnum(Num1).toString()
        bt_plus.setOnClickListener({

            result.text = (("" + getnum(Num1) + " + " + getnum(Num2)))

            sum = getnum(Num1) + getnum(Num2)

        })
        bt_minus.setOnClickListener({
            result.text = (("" + getnum(Num1) + " - " + getnum(Num2)))
            sum = getnum(Num1).minus(getnum(Num2))

        })
        bt_multiply.setOnClickListener({
            result.text = (("" + getnum(Num1) + " * " + getnum(Num2)))
            sum = getnum(Num1).times(getnum(Num2))

        })
        bt_divide.setOnClickListener({
            result.text = (("" + getnum(Num1) + " / " + getnum(Num2)))
            sum = getnum(Num1).div(getnum(Num2))


        })
        bt_sum.setOnClickListener({
            result.text = sum.toString()
        })
    }
    private fun getnum(input_num1: EditText) : Float {
        val lengh = input_num1.length()
            if(lengh <= 0) {
                return 0F
        }else{
            return ((input_num1.text).toString()).toFloat()
        }

    }
//    private  fun checklenght(input_num1: EditText) : Int{
//        val test = input_num1.length()
//        return  test.toString().toInt()
//    }
}





