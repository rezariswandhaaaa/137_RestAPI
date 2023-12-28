package com.example.activity8.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activity8.KontakAplikation
import com.example.activity8.ui.home.viewmodel.HomeViewModel
import com.example.activity8.ui.home.viewmodel.InsertViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }

        initializer {
            InsertViewModel(aplikasiKontak().container.kontakRepository)
        }
    }
}



fun CreationExtras.aplikasiKontak(): KontakAplikation = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikation)