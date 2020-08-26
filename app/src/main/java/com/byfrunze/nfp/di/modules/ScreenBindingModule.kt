package com.byfrunze.nfp.di.modules

import com.byfrunze.nfp.presentation.ui.nfp.NfpFragment
import com.byfrunze.nfp.presentation.ui.vt.VtFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ScreenBindingModule {

    @ContributesAndroidInjector
    abstract fun nfpFragment(): NfpFragment

    @ContributesAndroidInjector
    abstract fun vtFragment(): VtFragment
}