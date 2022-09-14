package com.example.retro21

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {

    val api = Retrofit.Builder()
        .baseUrl(MainService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MainService::class.java)

}