package com.example.retro21

import retrofit2.Response

class Repository {

    suspend fun getNumberDescription(): Response<Model>{
        return RetroInstance.api.getNumberDescription()
    }
}