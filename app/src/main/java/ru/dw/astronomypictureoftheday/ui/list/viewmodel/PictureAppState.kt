package ru.dw.astronomypictureoftheday.ui.list.viewmodel


sealed class PictureAppState{
    object Success: PictureAppState()
    data class Error(val error: String) : PictureAppState()
    object Loading : PictureAppState()
}