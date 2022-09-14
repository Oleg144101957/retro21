package com.example.retro21

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {

    val liveNumberDescription: MutableLiveData<String> = MutableLiveData()
    val repo = Repository()

    fun getNumberDescription(){
        viewModelScope.launch(Dispatchers.IO) {
            liveNumberDescription.postValue(repo.getNumberDescription())
        }
    }
}