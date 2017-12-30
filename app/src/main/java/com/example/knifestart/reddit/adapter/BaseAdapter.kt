package com.example.knifestart.reddit.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater



/**
 * Created by glebkalinichenko on 27.12.17.
 */
abstract class BaseAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        var layoutInflater = LayoutInflater.from(parent!!.getContext())
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, viewType, parent, false)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder?, position: Int) {
        var obj = getObjForPosition(position)
        holder!!.bind(obj)

        holder.binding.root.setOnClickListener {
            onSelected(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getLayoutIdForPosition(position)
    }

    internal abstract fun getObjForPosition(position: Int): Any

    internal abstract fun getLayoutIdForPosition(position: Int): Int

    internal abstract fun onSelected(position: Int)
}