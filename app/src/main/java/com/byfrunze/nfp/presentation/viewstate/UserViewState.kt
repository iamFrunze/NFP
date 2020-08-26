package com.byfrunze.nfp.presentation.viewstate

data class UserViewState(
    val authStatus: AuthStatus,
)

sealed class AuthStatus {
    object Loading: AuthStatus()
    object Success : AuthStatus()
    data class ShowError(val message: String) : AuthStatus()
}