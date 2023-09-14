package com.kinnu.country

import com.kinnu.country.Model.ContryData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {

    @GET("v2/all")
    fun getposts():Call<List<ContryData>>


}