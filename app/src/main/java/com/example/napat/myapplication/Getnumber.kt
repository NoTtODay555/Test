package com.example.napat.myapplication

import android.widget.EditText

class Getnumber {
    var checknull = CheckNull()

    fun getnumcal(input_num1: EditText): Float {
        if(checknull.checknullforlengh(input_num1)) return 0F
        else  return ((input_num1.text).toString()).toFloat()
    }
    fun getNumView(input_num1: EditText):String{
        if(checknull.checknullforlengh(input_num1)) return "0"
        if (checknull.checklengh(input_num1,6)) {
            return (input_num1.text).toString().substring(0, 5) + "E" + (input_num1.text).toString().substring(5).length
        }else
            return (input_num1.text).toString()

    }
}