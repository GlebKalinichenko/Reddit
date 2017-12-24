package com.example.knifestart.reddit.di.application.module

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 23.12.17.
 */
@Module
class NavigationModule constructor(var cicerone: Cicerone<Router> = Cicerone.create()) {
    @Provides @Singleton
    fun provideRouter(): Router = cicerone.router

    @Provides @Singleton
    fun provideNavigationHolder(): NavigatorHolder = cicerone.navigatorHolder
}