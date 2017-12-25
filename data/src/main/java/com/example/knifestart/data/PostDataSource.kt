package com.example.knifestart.data

import com.example.knifestart.domain.entities.Post
import io.reactivex.Observable

/**
 * Created by glebkalinichenko on 19.12.17.
 */
interface PostDataSource {
    fun fetchPost(limit: Int) : Observable<List<Post>>
}