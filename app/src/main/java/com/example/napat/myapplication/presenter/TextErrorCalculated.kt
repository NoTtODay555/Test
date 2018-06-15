package com.example.napat.myapplication.presenter

class TextErrorCalculated {
    
    fun textError(a: Float?, b: Float?) : String {
        return if (b == 0.0F && a != 0.0F  || b == null && a != 0.0F) {
            "Indeterminable"
        }
        else if (a == 0.0F && (b == 0.0F) || a == null && (b  == null)) {
            "Error"
        }else "null"
    }
}