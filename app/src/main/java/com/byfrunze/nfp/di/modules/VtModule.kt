package com.byfrunze.nfp.di.modules

import androidx.lifecycle.ViewModel
import com.byfrunze.nfp.presentation.ui.vt.VtViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class VtModule {

    @Binds
    @IntoMap
    @ViewModelKey(VtViewModel::class)
    internal abstract fun vtViewModel(viewModel: VtViewModel): ViewModel
}