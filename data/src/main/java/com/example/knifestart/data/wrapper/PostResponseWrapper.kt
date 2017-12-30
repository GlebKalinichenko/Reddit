package com.example.knifestart.data.wrapper

import com.example.knifestart.domain.entities.Post
import com.example.knifestart.domain.responses.NewsResponse
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 25.12.17.
 */
class PostResponseWrapper @Inject constructor() {

    fun convertPostResponse(responses: NewsResponse): MutableList<Post> {
        var convertedPosts = mutableListOf<Post>()

        var childrens = responses.data.children
        for (children in childrens) {
            var post = Post(children.data.title, children.data.author, children.data.numComments,
                    children.data.created, children.data.thumbnail, children.data.url)
            convertedPosts.add(post)
        }

        return convertedPosts
    }
}