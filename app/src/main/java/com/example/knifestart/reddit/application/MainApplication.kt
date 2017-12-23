package com.example.knifestart.reddit.application

import android.app.Application
import com.example.knifestart.reddit.di.application.component.ApplicationComponent
import com.example.knifestart.reddit.di.ApplicationModule
import com.example.knifestart.reddit.di.application.component.DaggerApplicationComponent
import com.example.knifestart.reddit.di.listposts.ListPostsComponent
import com.example.knifestart.reddit.di.listposts.ListPostsModule
import com.example.knifestart.reddit.di.postcontainer.PostComponent
import com.example.knifestart.reddit.di.postcontainer.PostModule

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class MainApplication : Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }

    val postActivityComponent: PostComponent by lazy {
        appComponent.postComponentModule().loginModule(PostModule()).build()
    }

    val listPostsComponent: ListPostsComponent by lazy {
        postActivityComponent.listPostsComponentModule().listPostsModule(ListPostsModule()).build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}