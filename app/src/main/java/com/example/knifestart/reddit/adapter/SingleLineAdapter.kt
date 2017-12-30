package com.example.knifestart.reddit.adapter

/**
 * Created by glebkalinichenko on 27.12.17.
 */
abstract class SingleLineAdapter<T> (var layoutId: Int) : BaseAdapter() {
    override fun getLayoutIdForPosition(position: Int): Int {
        return layoutId
    }

    abstract fun addDataSource(objects: MutableList<T>)
}