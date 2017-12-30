package com.example.knifestart.reddit.listposts

import com.example.knifestart.domain.entities.Post

/**
 * Created by glebkalinichenko on 24.12.17.
 */
interface IListPostViewModel {
    fun openPostDetails()
    fun fetchPosts(offset: Int, limit: Int)
}