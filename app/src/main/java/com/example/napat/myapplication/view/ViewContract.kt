package com.example.napat.myapplication.view

interface ViewContract{
        interface View{
            fun showResult(number : Float)
            fun showError(string : String)
        }
}