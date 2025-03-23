package com.example.koin.di

import com.example.koin._interface.TimeManager
import com.example.koin._interface.UserManager
import com.example.koin.implementation.TimeManagerImpl
import com.example.koin.implementation.UserManagerImpl
import com.example.koin.viewmodels.WelcomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // Định nghĩa UserManager là singleton
    single<UserManager> { UserManagerImpl() }

    single<TimeManager> { TimeManagerImpl() }

    // Định nghĩa ViewModel
    viewModel { WelcomeViewModel(get(),get()) }
}