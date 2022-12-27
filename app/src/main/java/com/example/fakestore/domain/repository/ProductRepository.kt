package com.example.fakestore.domain.repository

import com.example.fakestore.domain.model.Product
import io.reactivex.rxjava3.core.Single

interface ProductRepository {

    fun getProducts(): Single<List<Product>>

}