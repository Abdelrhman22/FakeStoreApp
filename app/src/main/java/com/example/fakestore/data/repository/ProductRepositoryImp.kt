package com.example.fakestore.data.repository

import com.example.fakestore.data.mapper.ProductMapper
import com.example.fakestore.domain.model.Product
import com.example.fakestore.domain.repository.ProductRepository
import com.example.fakestore.remote.api.ProductApiService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val productApiService: ProductApiService,
    private val productMapper: ProductMapper
) : ProductRepository {

    override fun getProducts(): Single<List<Product>> {
        return productApiService.getProducts().map { productMapper.mapList(it) }
    }

}