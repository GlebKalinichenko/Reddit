package com.example.knifestart.reddit.databinding_extensions

import android.databinding.BindingAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.knifestart.reddit.listposts.ListPostsViewModel
import com.example.knifestart.reddit.utils.SpaceItemDecoration

/**
 * Created by glebkalinichenko on 30.12.17.
 */

@BindingAdapter("bindUrl")
fun bindUrl(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}