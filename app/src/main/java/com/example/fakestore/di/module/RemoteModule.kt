package com.example.fakestore.di.module

import com.example.fakestore.remote.api.ProductApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
abstract class RemoteModule {
    companion object {
        @Provides
        @Singleton
        fun provideProductApiService(retrofit: Retrofit): ProductApiService {
            return retrofit.create(ProductApiService::class.java)
        }
    }

}