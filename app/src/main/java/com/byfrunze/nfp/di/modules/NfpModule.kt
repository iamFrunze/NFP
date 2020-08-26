package com.byfrunze.nfp.di.modules

import androidx.lifecycle.ViewModel
import com.byfrunze.nfp.presentation.ui.nfp.NfpViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class NfpModule {

    @Binds
    @IntoMap
    @ViewModelKey(NfpViewModel::class)
    internal abstract fun nfpViewModel(viewModel: NfpViewModel): ViewModel
}