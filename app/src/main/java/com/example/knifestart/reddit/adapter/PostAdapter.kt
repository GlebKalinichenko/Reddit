package com.example.knifestart.reddit.adapter

import com.example.knifestart.domain.entities.Post

/**
 * Created by glebkalinichenko on 27.12.17.
 */
class PostAdapter(var resId: Int, var posts: MutableList<Post> = mutableListOf()) : SingleLineAdapter<Post>(resId) {

    override fun addDataSource(objects: MutableList<Post>) {
        posts.addAll(objects)
        notifyDataSetChanged()
    }

    override fun getObjForPosition(position: Int): Any {
        return posts[position]
    }

    override fun getItemCount(): Int {
        return posts.size
    }

}