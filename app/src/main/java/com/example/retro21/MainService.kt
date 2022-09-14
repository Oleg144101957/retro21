package com.example.retro21

import retrofit2.Response
import retrofit2.http.GET

interface MainService {

    @GET("/random/math")
    suspend fun getNumberDescription(): String


}