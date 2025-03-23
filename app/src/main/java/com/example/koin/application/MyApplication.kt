package com.example.koin.application

// MyApplication.kt
import android.app.Application
import com.example.koin.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Khởi tạo Koin
        startKoin {
            androidContext(this@MyApplication)
            modules(appModule)
        }
    }
}