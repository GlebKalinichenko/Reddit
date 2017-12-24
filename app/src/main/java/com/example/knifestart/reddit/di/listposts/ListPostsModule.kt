package com.example.knifestart.reddit.di.listposts

import com.example.knifestart.data.PostRepository
import com.example.knifestart.domain.FetchPostsUseCase
import com.example.knifestart.reddit.di.scope.PostScope
import com.example.knifestart.reddit.listposts.ListPostsViewModel
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.terrakok.cicerone.Router

/**
 * Created by glebkalinichenko on 21.12.17.
 */
@Module
class ListPostsModule {
    @Provides @PostScope
    fun provideTest() = 1.0

    @Provides @PostScope
    fun provideFetchListPostsUseCase(postRepository: PostRepository) : FetchPostsUseCase =
            FetchPostsUseCase(Schedulers.io(), AndroidSchedulers.mainThread(), postRepository)

    @Provides @PostScope
    fun provideViewModel(fetchPostsUseCase: FetchPostsUseCase, router: Router) = ListPostsViewModel(fetchPostsUseCase, router)
}