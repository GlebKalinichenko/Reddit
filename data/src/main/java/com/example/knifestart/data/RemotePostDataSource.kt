package com.example.knifestart.data

import com.example.knifestart.domain.Post
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 19.12.17.
 */
class RemotePostDataSource @Inject constructor (var api: IRemoteApi) : PostDataSource {

    override fun fetchPost(): Observable<List<Post>> = api.fetchPosts()
}