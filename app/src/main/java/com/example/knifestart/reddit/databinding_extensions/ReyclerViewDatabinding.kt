package com.example.knifestart.reddit.databinding_extensions

import android.databinding.BindingAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.knifestart.reddit.listposts.ListPostsViewModel
import com.example.knifestart.reddit.utils.SpaceItemDecoration

/**
 * Created by glebkalinichenko on 30.12.17.
 */

@BindingAdapter("setHasFixedSize")
fun setHasFixedSize(view: RecyclerView, isHasFixedSize: Boolean) {
    view.setHasFixedSize(isHasFixedSize)
}

@BindingAdapter("space")
fun space(view: RecyclerView, space: Int) {
    view.addItemDecoration(SpaceItemDecoration(space))
}

@BindingAdapter("postBindAdapter")
fun bindAdapter(view: RecyclerView, viewModel: ListPostsViewModel) {
    view.layoutManager = LinearLayoutManager(view.context)
    view.adapter = viewModel.adapter
}