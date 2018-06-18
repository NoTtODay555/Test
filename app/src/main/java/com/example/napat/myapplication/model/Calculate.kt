package com.example.napat.myapplication.model

import android.util.Log
import com.example.napat.myapplication.presenter.Contractor
import com.example.napat.myapplication.presenter.TextErrorCalculated
import com.example.napat.myapplication.view.ViewContract

class Calculate(val view : ViewContract.View ) {

     fun minus(a: Float?, b: Float?) {
        view.showResult(b?.let { a?.minus(it) } ?: 0.0F)
    }

    fun multiply(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.times(it) } ?: 0.0F))
    }

    fun divider(a: Float?, b: Float?) {
        if (a != 0.0F && b != 0.0F || a == 0.0F && b != 0.0F){
            view.showResult((b?.let { a?.div(it) }?: 0.0F))
        }else{
            view.showError(TextErrorCalculated(view).textError(a,b))
        }
    }
    fun plus(a: Float?, b: Float?) {
        Log.e("Plus",a.toString()+"  "+b.toString())
        view.showResult((b?.let { a?.plus(it) })?: 0.0F)
    }
}