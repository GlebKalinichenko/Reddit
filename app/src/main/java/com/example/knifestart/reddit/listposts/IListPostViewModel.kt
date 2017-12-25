package com.example.knifestart.reddit.listposts

/**
 * Created by glebkalinichenko on 24.12.17.
 */
interface IListPostViewModel {
    fun openPostDetails()
    fun fetchPosts(offset: Int, limit: Int)
}