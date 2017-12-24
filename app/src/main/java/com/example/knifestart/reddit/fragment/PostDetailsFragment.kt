package com.example.knifestart.reddit.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knifestart.reddit.R
import com.example.knifestart.reddit.application.MainApplication
import com.example.knifestart.reddit.di.postdetails.PostDetailsComponent

/**
 * Created by glebkalinichenko on 24.12.17.
 */
class PostDetailsFragment : FragmentView<PostDetailsComponent>() {

    companion object {
        fun newInstance() : PostDetailsFragment {
            var args = Bundle()
            var fragment = PostDetailsFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_post_detail, container, false)
        return binding.root
    }

    override fun injectDependencies(component: PostDetailsComponent) {
        component.inject(this)
    }

    override fun createComponent(): PostDetailsComponent {
        return (activity.application as MainApplication).postDetailsComponent
    }

    override fun setState() {

    }
}