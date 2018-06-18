package com.example.napat.myapplication

import com.example.napat.cardview_retrofit.Model.Movie
import com.example.napat.cardview_retrofit.Model.Retrofit
import com.example.napat.myapplication.presenter.Contractor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class InterActive(val presenter : Contractor.Precenter): Controner.Mainrisiner{
        override fun getdata(number: Int){
            Retrofit().getApi()?.getMovie()?.enqueue(object : Callback<Movie> {
                override fun onFailure(call: Call<Movie>?, t: Throwable?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onResponse(call: Call<Movie>?, response: Response<Movie>?) {
                    response?.body()?.results?.get(number)?.title?.let { presenter.getTitle(it) }
                }

            })
        }
}