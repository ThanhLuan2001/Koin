package com.example.koin.viewmodels

// WelcomeViewModel.kt
import androidx.lifecycle.ViewModel
import com.example.koin._interface.TimeManager
import com.example.koin._interface.UserManager

class WelcomeViewModel(
    private val userManager: UserManager,
    private val timeManager: TimeManager
) : ViewModel() {

    fun getWelcomeMessage(): String {
        val userName = userManager.getUserName()
        val currentTime = timeManager.getCurrentTime()
        return "Chào mừng : $userName - Bây giờ là : $currentTime"
    }
}