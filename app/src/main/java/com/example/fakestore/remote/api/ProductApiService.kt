package com.example.fakestore.remote.api

import com.example.fakestore.remote.model.ProductRemote
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ProductApiService {
    @GET("products")
    fun getProducts(): Single<List<ProductRemote>>
}