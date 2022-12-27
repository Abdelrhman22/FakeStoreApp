package com.example.fakestore.di.component

import android.content.Context
import com.example.fakestore.MainActivity
import com.example.fakestore.MyApplication
import com.example.fakestore.di.module.AppModule
import com.example.fakestore.di.module.DataModule
import com.example.fakestore.di.module.RemoteModule
import com.example.fakestore.di.module.ViewModelsModule
import com.example.fakestore.presentation.products.view.ProductsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RemoteModule::class,
        DataModule::class,
        ViewModelsModule::class
    ]
)
interface AppComponent {

    fun inject(app: MyApplication)

    fun inject(activity: MainActivity)

    fun inject(fragment: ProductsFragment)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}