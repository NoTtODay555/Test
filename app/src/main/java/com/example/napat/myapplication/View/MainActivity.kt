package com.example.napat.myapplication.View

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.napat.myapplication.R
import com.example.napat.myapplication.VIewContract
import com.example.napat.myapplication.presenter.Calculate
import com.example.napat.myapplication.presenter.CheckNullEditText
import com.example.napat.myapplication.presenter.Contractor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),VIewContract.View {
    var calculate : Contractor  = Calculate(this)
    var chacknull = CheckNullEditText()
    override fun showResult(number: String) {
        Log.e("test", number)
        result?.text = number
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_plus.setOnClickListener({
            calculate.plus(chacknull.checkNullForLeach(Num1), chacknull.checkNullForLeach(Num2))
        })
        bt_minus.setOnClickListener({
            calculate.minus(chacknull.checkNullForLeach(Num1), chacknull.checkNullForLeach(Num2))
        })
        bt_multiply.setOnClickListener({
            calculate.multiply(chacknull.checkNullForLeach(Num1), chacknull.checkNullForLeach(Num2))
        })
        bt_divide.setOnClickListener({
            calculate.divider(chacknull.checkNullForLeach(Num1), chacknull.checkNullForLeach(Num2))
        })
    }
}
