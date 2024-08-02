package com.devrodrigomoreira.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var login = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    fun login(): LiveData<Boolean> {
        return login
    }

    fun doLogin(email: String, password: String) {
        login.value = personRepository.login(email, password)
    }

}