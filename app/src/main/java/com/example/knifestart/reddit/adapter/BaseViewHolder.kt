package com.example.knifestart.reddit.adapter

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.example.knifestart.reddit.BR

/**
 * Created by glebkalinichenko on 27.12.17.
 */
class BaseViewHolder(var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(obj: Any) {
        binding.setVariable(BR.obj, obj)
        binding.executePendingBindings();
    }
}