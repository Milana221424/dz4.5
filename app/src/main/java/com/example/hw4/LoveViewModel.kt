package com.example.hw4

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw4.remote.LoveModel

class LoveViewModel : ViewModel() {
    val repository = Repository()
    fun getLiveLoveData(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getData(firstName, secondName)
    }
}