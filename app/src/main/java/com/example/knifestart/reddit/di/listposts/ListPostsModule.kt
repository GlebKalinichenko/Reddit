package com.example.knifestart.reddit.di.listposts

import com.example.knifestart.domain.FetchPostsUseCase
import com.example.knifestart.domain.IPostRepository
import com.example.knifestart.reddit.di.scope.PostScope
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@Module
class ListPostsModule {
    @Provides @PostScope
    fun provideTest() = 1.0

    @Provides @PostScope
    fun provideFetchListPostsUseCase(postRepository: IPostRepository) : FetchPostsUseCase =
            FetchPostsUseCase(Schedulers.io(), AndroidSchedulers.mainThread(), postRepository)
}