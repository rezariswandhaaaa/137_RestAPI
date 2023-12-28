package com.example.activity8.repository

import com.example.activity8.model.Kontak
import com.example.activity8.service_api.KontakService

interface KontakRepository{
    suspend fun getKontak(): List<Kontak>

    suspend fun insertKontak(kontak: Kontak)



}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()

    override suspend fun insertKontak(kontak: Kontak) {
        kontakApiService.insertKontak(kontak)
    }
}