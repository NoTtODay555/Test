package com.example.napat.myapplication

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Calculate() : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.text = "55555"

    }


    fun Plus(a :Float, b:Float) : String{
        return (a + b).toString()
    }
    fun Minus(a :Float,b:Float) : String{
        return (a - b).toString()
    }
    fun Multiply(a :Float,b:Float) : String{
        return (a * b).toString()
    }
    fun Divider(a :Float,b:Float) : String {
        if (b.toInt() == 0) {
            return "Indeterminable"
        } else if (a.toInt() == 0 || (b.toInt() == 0)) {
            return "Error"
        } else return (a / b).toString()

    }
}