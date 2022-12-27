package com.example.fakestore.presentation.productsdetils.mapper

import com.example.fakestore.domain.model.Product
import com.example.fakestore.presentation.productsdetils.model.ProductDetailsUiModel
import javax.inject.Inject

class ProductDetailsUiMapper @Inject constructor() {

    fun map(product: Product): ProductDetailsUiModel {

        return ProductDetailsUiModel(
            image = product.image,
            title = product.title,
            price = product.price,
            rate = product.rating.rate,
            description = product.description
        )
    }
}