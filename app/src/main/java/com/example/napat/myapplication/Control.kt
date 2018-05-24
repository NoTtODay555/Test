package com.example.napat.myapplication

import android.widget.EditText

class Control {
    private fun getnum(input_num1: EditText): Float {
        val lengh = input_num1.length()
        if (lengh <= 0) {
            return 0F
        } else {
            return ((input_num1.text).toString()).toFloat()
        }
    }
}
