package com.example.napat.myapplication.presenter

import android.widget.EditText

class CheckNullEditText: Contractor.CheckNull{

    override fun checkNullForLeach(input_num1: EditText): Float {
        val length = input_num1.length()
        return if (length <= 0){
            0.0F
        }else input_num1.text.toString().toFloat()
    }
}