package com.example.glebkalinichenko.bouncefire.di.application

import dagger.Module
import dagger.Provides
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 16.12.17.
 */
@Module
class LoggerModule {

    @Provides @Singleton
    fun provideLogger() : HttpLoggingInterceptor = HttpLoggingInterceptor()
}