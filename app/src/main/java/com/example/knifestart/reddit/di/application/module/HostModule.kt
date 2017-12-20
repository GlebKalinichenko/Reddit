package com.example.glebkalinichenko.bouncefire.di.application

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 16.12.17.
 */
@Module
class HostModule {
    val NETWORK_TIMEOUT_SECONDS = 60L

    @Provides @Singleton
    fun provideBaseUrl() = ""

    @Provides @Singleton
    fun provideNetworkTimeout() = NETWORK_TIMEOUT_SECONDS
}