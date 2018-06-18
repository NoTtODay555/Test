package com.example.napat.myapplication.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.napat.myapplication.R
import com.example.napat.myapplication.model.Calculate
import com.example.napat.myapplication.presenter.Contractor
import com.example.napat.myapplication.presenter.TextErrorCalculated
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewContract.View{
    override fun getTitle(text: String) {
        result.text = text
    }

    val precenter : Contractor.Precenter = TextErrorCalculated(this)
    override fun showError(string: String) {
        result?.text = string
    }

    override fun showResult(number: Float) {
        Log.e("ShowResult",number.toString())
        result?.text = number.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        precenter.getApi()

        bt_plus.setOnClickListener({
            Log.e("Botton","OK")
            precenter.getNumView(Num1,Num2,1)
        })

        bt_minus.setOnClickListener({
             precenter.getNumView(Num1,Num2,2)
        })

        bt_multiply.setOnClickListener({
            precenter.getNumView(Num1,Num2,3)
        })

        bt_divide.setOnClickListener({
            precenter.getNumView(Num1,Num2,4)
        })
    }
}
