package com.byfrunze.nfp.presentation.viewstate

sealed class UserAction {
    data class ShowToast(val message: String) : UserAction()
}