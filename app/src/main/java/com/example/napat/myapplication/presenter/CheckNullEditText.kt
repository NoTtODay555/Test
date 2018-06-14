package com.example.napat.myapplication.presenter

import android.widget.EditText

class CheckNullEditText{
    fun checkNullForLeach(input_num1: EditText): Boolean {
        val length = input_num1.length()
        return length <= 0
    }
    fun challenge(input_num1: EditText, n : Int):Boolean{
        val length = input_num1.length()
        return length >= n
    }
}