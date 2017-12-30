package com.example.knifestart.reddit.utils

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by glebkalinichenko on 30.12.17.
 */

class SpaceItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                                state: RecyclerView.State?) {
        outRect.left = space
        outRect.bottom = space
        outRect.right = space
    }
}