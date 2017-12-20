package com.example.knifestart.domain

import com.example.knifestart.domain.Post
import io.reactivex.Observable

/**
 * Created by glebkalinichenko on 19.12.17.
 */
interface IRemoteApi {
    fun fetchPosts() : Observable<List<Post>>
}