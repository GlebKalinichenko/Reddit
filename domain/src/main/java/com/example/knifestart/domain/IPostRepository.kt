package com.example.knifestart.domain

import com.example.knifestart.domain.entities.Post
import com.example.knifestart.domain.responses.PostResponse
import io.reactivex.Observable

/**
 * Created by glebkalinichenko on 19.12.17.
 */
interface IPostRepository {
    fun fetchPosts(limit: Int) : Observable<List<Post>>
}