package com.example.knifestart.reddit.di.postcontainer

import com.example.knifestart.reddit.MainActivity
import com.example.knifestart.reddit.PostActivityScope
import com.example.knifestart.reddit.di.listposts.ListPostsComponent
import com.example.knifestart.reddit.di.postdetails.PostDetailsComponent
import dagger.Subcomponent

/**
 * Created by glebkalinichenko on 20.12.17.
 */
@PostActivityScope
@Subcomponent(modules = arrayOf(PostContainerModule::class))
interface PostContainerComponent {

    @Subcomponent.Builder
    interface Builder {
        fun loginModule(postContainerModule: PostContainerModule): Builder
        fun build(): PostContainerComponent
    }

    fun listPostsComponentModule(): ListPostsComponent.Builder
    fun postDetailsComponentModule(): PostDetailsComponent.Builder
    fun inject(activity: MainActivity)
}