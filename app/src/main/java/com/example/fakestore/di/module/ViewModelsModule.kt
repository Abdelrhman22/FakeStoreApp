package com.example.fakestore.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fakestore.di.ViewModelKey
import com.example.fakestore.di.ViewModelProviderFactory
import com.example.fakestore.presentation.products.viewmodel.ProductsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {
    @Module
    abstract class ViewModelsModule {

        @Binds
        abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory?): ViewModelProvider.Factory?
    }

    @Binds
    @IntoMap
    @ViewModelKey(ProductsViewModel::class)
    abstract fun bindProductsViewModel(viewModel: ProductsViewModel): ViewModel?
}