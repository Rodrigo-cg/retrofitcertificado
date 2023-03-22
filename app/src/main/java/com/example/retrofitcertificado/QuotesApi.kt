package com.example.retrofitcertificado

import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
   // @GET("/quotes?page=103")
    @GET("consultar.php?LIC=0309")
    suspend fun getQuotes() : Response<QuoteList>
}