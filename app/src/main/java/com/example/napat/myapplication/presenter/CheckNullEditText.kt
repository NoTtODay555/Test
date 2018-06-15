package com.example.napat.myapplication.presenter

import android.widget.EditText

class CheckNullEditText: Contractor.CheckNull{
    override fun checkNullForLeach(input_num1: EditText): Float {
        val length = input_num1.length()
        if (length <= 0){
                return 0.0F
        }else return input_num1.text.toString().toFloat()
    }
    override fun challenge(input_num1: EditText, n : Int){
        val length = input_num1.length()
        length >= n
    }
}