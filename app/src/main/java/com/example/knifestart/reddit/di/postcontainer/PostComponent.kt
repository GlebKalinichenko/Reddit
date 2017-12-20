package com.example.knifestart.reddit.di.postcontainer

import com.example.knifestart.reddit.MainActivity
import com.example.knifestart.reddit.PostActivityScope
import com.example.knifestart.reddit.di.listposts.ListPostsComponent
import dagger.Subcomponent

/**
 * Created by glebkalinichenko on 20.12.17.
 */
@PostActivityScope
@Subcomponent(modules = arrayOf(PostModule::class))
interface PostComponent {

    @Subcomponent.Builder
    interface Builder {
        fun loginModule(postModule: PostModule): Builder
        fun build(): PostComponent
    }

    fun listPostsComponentModule(): ListPostsComponent.Builder
    fun inject(activity: MainActivity)
}