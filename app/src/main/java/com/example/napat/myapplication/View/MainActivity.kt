package com.example.napat.myapplication.View

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.napat.myapplication.R
import com.example.napat.myapplication.VIewContract
import com.example.napat.myapplication.presenter.Calculate
import com.example.napat.myapplication.presenter.Contractor
import com.example.napat.myapplication.presenter.GetNumber
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity (): AppCompatActivity(),VIewContract.views {
    var calculate : Contractor  = Calculate(this)
    override fun showResult(number: String) {
        Log.e("test", number)
        result.text = number
    }


    private var getNumber : Contractor.GetNumber = GetNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_plus.setOnClickListener({
            calculate.plus(Num1.text.toString().toFloat(),Num2.text.toString().toFloat())
        })
    }
}
