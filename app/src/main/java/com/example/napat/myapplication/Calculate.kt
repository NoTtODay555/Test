package com.example.napat.myapplication

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Calculate() : Activity() {

    fun Plus(a :Float, b:Float) : String{
        return (a.plus(b)).toString()
    }
    fun Minus(a :Float,b:Float) : String{
        return (a.minus(b)).toString()
    }
    fun Multiply(a :Float,b:Float) : String{
        return (a.times(b)).toString()
    }
    fun Divider(a :Float,b:Float) : String {
        if (b.toInt() == 0 && a.toInt() != 0) {
            return "Indeterminable"
        }
        if (a.toInt() == 0 &&  (b.toInt() == 0)) {
            return "Error"
        } else return (a.div(b)).toString()

    }
}