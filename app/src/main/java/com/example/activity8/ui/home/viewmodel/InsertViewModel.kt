package com.example.activity8.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.activity8.model.Kontak
import com.example.activity8.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository): ViewModel(){

}

data class InsertUiState(
    val insertUiState: InsertUiState = InsertUiState(),
)

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = "",
)