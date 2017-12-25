package com.example.knifestart.domain

import com.example.knifestart.domain.entities.Post
import com.example.knifestart.domain.responses.PostResponse
import io.reactivex.Observable
import io.reactivex.Scheduler
import javax.inject.Inject


/**
 * Created by glebkalinichenko on 19.12.17.
 */
class FetchPostsUseCase @Inject constructor(workScheduler: Scheduler,
                                                   observeScheduler: Scheduler,
                                                   private val postRepository: IPostRepository) : QueryUseCase<List<Post>, FetchPostsUseCase.FetchPostsParam>(workScheduler, observeScheduler) {

    override fun buildUseCaseObservable(params: FetchPostsParam): Observable<List<Post>> {
        return postRepository.fetchPosts(params.limit)
    }

    class FetchPostsParam(offset: Int, limit: Int) {
        internal var offset: Int
        internal var limit: Int

        init {
            this.offset = offset
            this.limit = limit
        }
    }
}