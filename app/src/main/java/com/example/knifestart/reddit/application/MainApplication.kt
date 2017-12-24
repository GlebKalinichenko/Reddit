package com.example.knifestart.reddit.application

import android.app.Application
import com.example.knifestart.reddit.di.application.component.ApplicationComponent
import com.example.knifestart.reddit.di.ApplicationModule
import com.example.knifestart.reddit.di.application.component.DaggerApplicationComponent
import com.example.knifestart.reddit.di.listposts.ListPostsComponent
import com.example.knifestart.reddit.di.listposts.ListPostsModule
import com.example.knifestart.reddit.di.postcontainer.PostContainerComponent
import com.example.knifestart.reddit.di.postcontainer.PostContainerModule
import com.example.knifestart.reddit.di.postdetails.PostDetailsComponent
import com.example.knifestart.reddit.di.postdetails.PostDetailsModule

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class MainApplication : Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }

    val postActivityContainerComponent: PostContainerComponent by lazy {
        appComponent.postComponentModule().loginModule(PostContainerModule()).build()
    }

    val listPostsComponent: ListPostsComponent by lazy {
        postActivityContainerComponent.listPostsComponentModule().listPostsModule(ListPostsModule()).build()
    }

    val postDetailsComponent: PostDetailsComponent by lazy {
        postActivityContainerComponent.postDetailsComponentModule().postDetailsModule(PostDetailsModule()).build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}