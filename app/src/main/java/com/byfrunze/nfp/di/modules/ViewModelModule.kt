package com.byfrunze.nfp.di.modules

import androidx.lifecycle.ViewModelProvider
import com.byfrunze.nfp.presentation.helpers.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory
}