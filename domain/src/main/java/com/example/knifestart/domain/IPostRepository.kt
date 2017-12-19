package com.example.knifestart.domain

import io.reactivex.Observable

/**
 * Created by glebkalinichenko on 19.12.17.
 */
interface IPostRepository {
    fun fetchPosts() : Observable<List<Post>>
}