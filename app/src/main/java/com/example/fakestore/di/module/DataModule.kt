package com.example.fakestore.di.module

import com.example.fakestore.data.repository.ProductRepositoryImp
import com.example.fakestore.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {
    @Binds
    abstract fun bindProductRepository(repositoryImp: ProductRepositoryImp): ProductRepository
}