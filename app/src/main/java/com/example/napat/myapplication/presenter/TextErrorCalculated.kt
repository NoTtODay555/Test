package com.example.napat.myapplication.presenter

import android.util.Log
import android.widget.EditText
import com.example.napat.cardview_retrofit.Model.Movie
import com.example.napat.cardview_retrofit.Model.Result
import com.example.napat.cardview_retrofit.Model.Retrofit
import com.example.napat.myapplication.Controner
import com.example.napat.myapplication.InterActive
import com.example.napat.myapplication.model.Calculate
import com.example.napat.myapplication.view.ViewContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TextErrorCalculated(val context: ViewContract.View) : Contractor.Precenter{
    override fun getTitle(t: String) {
        context.getTitle(t)
    }

    override fun getApi() {
        interactice.getdata(2)
    }

    val interactice : Controner.Mainrisiner = InterActive(this)

    override fun getNumView(a: EditText, b: EditText, num: Int) {
        Log.e("getNum",a.text.toString() + "  " + b.text.toString())
        when {
            (num == 1) -> Calculate(context).plus(a.text.toString()
                    .toFloatOrNull(), b.text.toString().toFloatOrNull())
            (num == 2) -> Calculate(context).minus(a.text.toString()
                    .toFloatOrNull(), b.text.toString().toFloatOrNull())
            (num == 3) -> Calculate(context).multiply(a.text.toString()
                    .toFloatOrNull(), b.text.toString().toFloatOrNull())
            (num == 4) -> Calculate(context).divider(a.text.toString()
                    .toFloatOrNull(), b.text.toString().toFloatOrNull())

        }
    }

    override fun textError(a: Float?, b: Float?) : String {
        return if (b == 0.0F && a != 0.0F  || b == null && a != 0.0F) {
            "Indeterminable"
        }
        else if (a == 0.0F && (b == 0.0F) || a == null && (b  == null)) {
            "Error"
        }else "null"
    }
}