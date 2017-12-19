package com.example.knifestart.data

import com.example.knifestart.domain.IPostRepository
import com.example.knifestart.domain.Post
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class PostRepository @Inject constructor(var remotePostDataSource: RemotePostDataSource) : IPostRepository {

    override fun fetchPosts(): Observable<List<Post>> = remotePostDataSource.fetchPost()
}