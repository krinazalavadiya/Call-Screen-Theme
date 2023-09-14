package com.kinnu.country

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object {

        lateinit var retrofit: Retrofit
        var Base_Url = "https://restcountries.com/"

        fun getApiclient(): Retrofit {
            retrofit = Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }

        fun getApiClient(): Any {
            TODO("Not yet implemented")
        }

    }
}