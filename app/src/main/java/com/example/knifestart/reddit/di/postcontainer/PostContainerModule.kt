package com.example.knifestart.reddit.di.postcontainer

import com.example.knifestart.reddit.PostActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by glebkalinichenko on 20.12.17.
 */
@Module
class PostContainerModule {
    @Provides @PostActivityScope
    fun provideTest() = ""
}