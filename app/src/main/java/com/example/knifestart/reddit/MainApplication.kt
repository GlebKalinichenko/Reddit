package com.example.knifestart.reddit

import android.app.Application
import com.example.knifestart.reddit.di.application.component.ApplicationComponent
import com.example.knifestart.reddit.di.ApplicationModule
import com.example.knifestart.reddit.di.application.component.DaggerApplicationComponent

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class MainApplication : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}