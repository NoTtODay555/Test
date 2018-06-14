package com.example.napat.myapplication.presenter

import android.widget.EditText

interface Contractor {
    fun plus(a :Float, b:Float)
    interface GetNumber{
        fun getNumView(input_num1: EditText):String
        fun getNumCal(input_num1: EditText): Float
    }

}