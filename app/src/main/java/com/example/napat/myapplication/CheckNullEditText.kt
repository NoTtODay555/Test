package com.example.napat.myapplication

import android.widget.EditText

class CheckNullEditText{
    fun checknullforlengh(input_num1: EditText): Boolean {
        val lengh = input_num1.length()
        return lengh <= 0
    }
    fun checklengh(input_num1: EditText,n : Int):Boolean{
        val lengh = input_num1.length()
        return lengh >= n
    }
}