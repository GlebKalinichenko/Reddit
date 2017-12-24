package com.example.knifestart.reddit.di.postdetails

import com.example.knifestart.reddit.di.scope.PostScope
import dagger.Module
import dagger.Provides

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@Module
class PostDetailsModule {
    @Provides
    @PostScope
    fun provideTest() = 0L
}