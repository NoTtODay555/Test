package com.example.napat.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class CheckNull : Activity() {
    fun checknullforlengh(input_num1: EditText): Boolean {
        val lengh = input_num1.length()
        return lengh <= 0
    }
    fun checklengh(input_num1: EditText,n : Int):Boolean{
        val lengh = input_num1.length()
        return lengh >= n
    }
}