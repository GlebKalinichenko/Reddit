package com.example.knifestart.reddit

import dagger.Component
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 19.12.17.
 */
@Singleton @Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(app: MainApplication)
}