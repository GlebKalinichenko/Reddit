package com.example.knifestart.reddit.di.listposts

import com.example.knifestart.reddit.di.scope.PostScope
import dagger.Module
import dagger.Provides

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@Module
class ListPostsModule {
    @Provides @PostScope
    fun provideTest() = 1.0
}