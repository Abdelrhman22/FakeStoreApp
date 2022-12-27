package com.example.fakestore.presentation.products.viewstate

import com.example.fakestore.presentation.products.model.ProductsUiModel

sealed class ProductsViewState {

    object Error : ProductsViewState()

    object Loading : ProductsViewState()

    object NoInternet : ProductsViewState()

    data class Success(val product: List<ProductsUiModel>) : ProductsViewState()
}
