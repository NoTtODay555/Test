package com.example.napat.myapplication.presenter

import com.example.napat.myapplication.view.ViewContract

class Calculate(val view : ViewContract.View) : Contractor.calculate {

    override fun minus(a: Float?, b: Float?) {
        view.showResult(b?.let { a?.minus(it) } ?: 0.0F)
    }

    override fun multiply(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.times(it) } ?: 0.0F))
    }

    override fun divider(a: Float?, b: Float?) {
        if (a != 0.0F && b != 0.0F || a == 0.0F && b != 0.0F){
            view.showResult((b?.let { a?.div(it) }?: 0.0F))
        }else{
            view.showError(TextErrorCalculated().textError(a,b))
        }
    }

    override fun plus(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.plus(it) })?: 0.0F)
    }
}