package com.example.knifestart.reddit.di.application.component

import com.example.glebkalinichenko.bouncefire.di.application.GsonModule
import com.example.glebkalinichenko.bouncefire.di.application.HostModule
import com.example.glebkalinichenko.bouncefire.di.application.LoggerModule
import com.example.glebkalinichenko.bouncefire.di.application.NetworkModule
import com.example.knifestart.reddit.application.MainApplication
import com.example.knifestart.reddit.di.ApplicationModule
import com.example.knifestart.reddit.di.application.module.NavigationModule
import com.example.knifestart.reddit.di.postcontainer.PostContainerComponent
import dagger.Component
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 19.12.17.
 */
@Singleton @Component(modules = arrayOf(ApplicationModule::class, GsonModule::class, HostModule::class,
        LoggerModule::class, NetworkModule::class, NavigationModule::class))
interface ApplicationComponent {
    fun postComponentModule(): PostContainerComponent.Builder
    fun inject(app: MainApplication)
}