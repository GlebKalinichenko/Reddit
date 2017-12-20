package com.example.knifestart.reddit.di.application.component

import com.example.glebkalinichenko.bouncefire.di.application.GsonModule
import com.example.glebkalinichenko.bouncefire.di.application.HostModule
import com.example.glebkalinichenko.bouncefire.di.application.LoggerModule
import com.example.glebkalinichenko.bouncefire.di.application.NetworkModule
import com.example.knifestart.reddit.MainApplication
import com.example.knifestart.reddit.di.ApplicationModule
import com.example.knifestart.reddit.di.postcontainer.PostComponent
import dagger.Component
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 19.12.17.
 */
@Singleton @Component(modules = arrayOf(ApplicationModule::class, GsonModule::class, HostModule::class,
        LoggerModule::class, NetworkModule::class))
interface ApplicationComponent {
    fun postComponentModule(): PostComponent.Builder
    fun inject(app: MainApplication)
}