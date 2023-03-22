package com.example.retrofitcertificado

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofithelper {

    val baseUrl = "https://proyectosti.muniate.gob.pe/certificados_apps/conexiones_php/"
    //val baseUrl = "https://quotable.io/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object

            .build()
    }
}