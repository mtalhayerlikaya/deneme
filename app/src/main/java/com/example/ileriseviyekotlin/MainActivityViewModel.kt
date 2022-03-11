package com.example.ileriseviyekotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.Flow

class MainActivityViewModel : ViewModel() {

    init {
        viewModelScope.launch {
            changeStateFlow()
        }

    }


    private val _stateFlow = MutableStateFlow<String>("")
    val stateFlow: StateFlow<String>
        get() = _stateFlow



    fun changeStateFlow(){
        _stateFlow.value ="State has changed"
    }



}