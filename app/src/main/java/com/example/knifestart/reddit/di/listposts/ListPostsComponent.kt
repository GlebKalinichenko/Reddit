package com.example.knifestart.reddit.di.listposts

import com.example.knifestart.reddit.di.scope.PostScope
import dagger.Subcomponent

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@PostScope @Subcomponent(modules = arrayOf(ListPostsModule::class))
interface ListPostsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun listPostsModule(listPostsModule: ListPostsModule) : Builder
        fun build(): ListPostsComponent
    }
}