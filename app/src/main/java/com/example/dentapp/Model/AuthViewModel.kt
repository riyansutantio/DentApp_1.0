package com.example.dentapp.Model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AuthViewModel : ViewModel(){
    private val _user: MutableStateFlow<UserModel?> = MutableStateFlow(null)
    val user: StateFlow<UserModel?> = _user

    suspend fun signIn(email: String, displayName: String){
        delay(2000)//simulating network call
        _user.value = UserModel(email, displayName)
    }
}