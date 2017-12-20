package com.example.knifestart.reddit

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 20.12.17.
 */
@Module
class ListPostsModule {

    @Provides
    fun provideTest() = 1

}