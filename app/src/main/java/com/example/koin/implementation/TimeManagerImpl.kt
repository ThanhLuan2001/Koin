package com.example.koin.implementation

// TimeManagerImpl.kt
import com.example.koin._interface.TimeManager
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class TimeManagerImpl : TimeManager {
    override fun getCurrentTime(): String = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
}