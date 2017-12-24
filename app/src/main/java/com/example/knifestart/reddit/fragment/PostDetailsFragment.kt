package com.example.knifestart.reddit.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knifestart.reddit.R

/**
 * Created by glebkalinichenko on 24.12.17.
 */
class PostDetailsFragment : Fragment() {

    companion object {
        fun newInstance() : PostDetailsFragment {
            var args = Bundle()
            var fragment = PostDetailsFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_post_detail, container, false)
    }
}