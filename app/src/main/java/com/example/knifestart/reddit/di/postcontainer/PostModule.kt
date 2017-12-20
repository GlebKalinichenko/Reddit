package com.example.knifestart.reddit.di.postcontainer

import com.example.knifestart.reddit.PostScope
import dagger.Module
import dagger.Provides

/**
 * Created by glebkalinichenko on 20.12.17.
 */
@Module
class PostModule {
    @Provides @PostScope
    fun provideTest() = ""
}