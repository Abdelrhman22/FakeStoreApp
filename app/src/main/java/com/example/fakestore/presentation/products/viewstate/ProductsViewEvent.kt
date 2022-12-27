package com.example.fakestore.presentation.products.viewstate

import com.example.fakestore.presentation.productsdetils.model.ProductDetailsUiModel

sealed class ProductsViewEvent {
    data class ClickOnProduct(val productDetailsUiModel: ProductDetailsUiModel) :
        ProductsViewEvent()

    object NoInternet : ProductsViewEvent()
}