package com.example.napat.myapplication

import android.os.Parcel
import android.os.Parcelable

class Calculate() {

    fun Plus(a :Float, b:Float) : String{
        return (a + b).toString()
    }
    fun Minus(a :Float,b:Float) : String{
        return (a - b).toString()
    }
    fun Multiply(a :Float,b:Float) : String{
        return (a * b).toString()
    }
    fun Divider(a :Float,b:Float) : String{
        if(a.equals(0)){
            return "Indeterminable"
        }else if(a.equals(0) and (b.equals(0))){
            return  "Error"
        }else  return (a / b).toString()
    }

}