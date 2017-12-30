package com.example.knifestart.data

import com.example.knifestart.domain.IPostRepository
import com.example.knifestart.domain.entities.Post
import com.example.knifestart.domain.responses.PostResponse
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class PostRepository @Inject constructor(var remotePostDataSource: RemotePostDataSource) : IPostRepository {

    override fun fetchPosts(limit: Int): Observable<MutableList<Post>> = remotePostDataSource.fetchPost(limit)
}