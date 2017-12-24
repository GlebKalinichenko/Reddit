package com.example.knifestart.reddit.di.postdetails

import com.example.knifestart.reddit.di.scope.PostScope
import com.example.knifestart.reddit.fragment.PostDetailsFragment
import dagger.Subcomponent

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@PostScope
@Subcomponent(modules = arrayOf(PostDetailsModule::class))
interface PostDetailsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun postDetailsModule(postDetailsModule: PostDetailsModule) : Builder
        fun build(): PostDetailsComponent
    }

    fun inject(postDetailsFragment: PostDetailsFragment)
}