package com.example.napat.myapplication.presenter

import android.widget.EditText

class GetNumber  : Contractor.GetNumber{

    var checknull = CheckNullEditText()
    override fun getNumCal(input_num1: EditText): Float {
        return if(checknull.checkNullForLeach(input_num1)) 0F
        else ((input_num1.text).toString()).toFloat()
    }
    override fun getNumView(input_num1: EditText):String{
        if(checknull.checkNullForLeach(input_num1)) return "0"
        return if (checknull.challenge(input_num1,6)) {
            (input_num1.text).toString().substring(0, 5) + "E" + (input_num1.text).toString().substring(5).length
        }else
            (input_num1.text).toString()
    }
}