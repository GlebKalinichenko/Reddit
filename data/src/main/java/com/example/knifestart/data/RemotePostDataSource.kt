package com.example.knifestart.data

import com.example.knifestart.data.wrapper.PostResponseWrapper
import com.example.knifestart.domain.IRemoteApi
import com.example.knifestart.domain.entities.Post
import com.example.knifestart.domain.responses.PostResponse
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class RemotePostDataSource @Inject constructor (var api: IRemoteApi, var wrapper: PostResponseWrapper) : PostDataSource {

    override fun fetchPost(limit: Int): Observable<List<Post>> {
        return api.fetchPosts(limit.toString()).flatMap { i -> Observable.fromArray(wrapper.convertPostResponse(i)) }
    }
}