package com.example.retro21


class Repository {

    suspend fun getNumberDescription(): String {
        return RetroInstance.api.getNumberDescription()
    }
}