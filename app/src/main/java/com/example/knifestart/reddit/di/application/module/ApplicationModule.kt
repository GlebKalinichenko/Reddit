package com.example.knifestart.reddit.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 19.12.17.
 */
@Module @Singleton
class ApplicationModule (var context: Application) {

    @Singleton @Provides
    fun provideApplication() = context
}