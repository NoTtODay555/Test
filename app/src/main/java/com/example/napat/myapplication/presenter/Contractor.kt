package com.example.napat.myapplication.presenter

import android.widget.EditText

interface Contractor {
    fun plus(a :Float?, b:Float?)
    fun minus(a :Float?,b:Float?)
    fun multiply(a :Float?,b:Float?)
    fun divider(a :Float?,b:Float?)
    interface CheckNull{
        fun checkNullForLeach(input_num1: EditText): Float
        fun challenge(input_num1: EditText, n : Int)
    }

}