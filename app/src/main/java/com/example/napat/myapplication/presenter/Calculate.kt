package com.example.napat.myapplication.presenter

import com.example.napat.myapplication.VIewContract

class Calculate(val view : VIewContract.View) : Contractor {
    override fun minus(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.minus(it) }?.toString())?: 0.0F.toString())
    }

    override fun multiply(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.times(it) }?.toString())?: 0.0F.toString())
    }

    override fun divider(a: Float?, b: Float?) {
        if (b?.toInt() == 0 && a?.toInt() != 0 || b?.toInt() == null && a?.toInt() != 0) {
            view.showResult("Indeterminable")
        }
        if (a?.toInt() == 0 && (b?.toInt() == 0) || a?.toInt() == null && (b?.toInt() == null)) {
            view.showResult("Error")
        } else view.showResult((b?.let { a?.div(it) }?.toString())?: 0.0F.toString())

    }
    override fun plus(a: Float?, b: Float?) {
        view.showResult((b?.let { a?.plus(it) }?.toString())?: 0.0F.toString())
    }
}