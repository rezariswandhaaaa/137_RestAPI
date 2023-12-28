package com.example.activity8.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName("email")
    val alamat: String,
    @SerialName("nohp")
    val telpon: String

)
