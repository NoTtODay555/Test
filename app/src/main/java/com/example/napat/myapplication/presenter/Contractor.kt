package com.example.napat.myapplication.presenter

import android.widget.EditText
import com.example.napat.cardview_retrofit.Model.Result

interface Contractor {
    interface Precenter{
        fun textError(a: Float?, b: Float?) : String
        fun getNumView(a: EditText,b:EditText,num:Int)
        fun getApi()
        fun getTitle(t : String)
    }

}
