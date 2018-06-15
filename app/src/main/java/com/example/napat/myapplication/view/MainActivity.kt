package com.example.napat.myapplication.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.napat.myapplication.R
import com.example.napat.myapplication.presenter.Calculate
import com.example.napat.myapplication.presenter.CheckNullEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewContract.View {
    private var calculate : Calculate = Calculate(this)
    private var checkNull = CheckNullEditText()

    override fun showError(string: String) {
        result?.text = string
    }

    override fun showResult(number: Float) {
        result?.text = number.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_plus.setOnClickListener({
            calculate.plus(checkNull.checkNullForLeach(Num1), checkNull.checkNullForLeach(Num2))
        })

        bt_minus.setOnClickListener({
            calculate.minus(checkNull.checkNullForLeach(Num1), checkNull.checkNullForLeach(Num2))
        })

        bt_multiply.setOnClickListener({
            calculate.multiply(checkNull.checkNullForLeach(Num1), checkNull.checkNullForLeach(Num2))
        })

        bt_divide.setOnClickListener({
            calculate.divider(checkNull.checkNullForLeach(Num1), checkNull.checkNullForLeach(Num2))
        })
    }
}
