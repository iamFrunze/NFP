package com.byfrunze.nfp.di.components

import android.app.Application
import com.byfrunze.nfp.NfpApp
import com.byfrunze.nfp.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBindingModule::class,
        ViewModelModule::class,
        ScreenBindingModule::class,
        NfpModule::class,
        VtModule::class
    ]
)
@AppScope
interface AppComponent : AndroidInjector<Application> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

    fun inject(app: NfpApp)
}