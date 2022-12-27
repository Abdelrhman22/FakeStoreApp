package com.example.fakestore.presentation.products.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.fakestore.presentation.products.model.ProductsUiModel

object ProductsDiffUtil : DiffUtil.ItemCallback<ProductsUiModel>() {

    override fun areItemsTheSame(oldItem: ProductsUiModel, newItem: ProductsUiModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ProductsUiModel, newItem: ProductsUiModel): Boolean {
        return oldItem == newItem
    }

}

