package com.example.knifestart.reddit.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knifestart.reddit.BR
import com.example.knifestart.reddit.R
import com.example.knifestart.reddit.application.MainApplication
import com.example.knifestart.reddit.di.listposts.ListPostsComponent
import com.example.knifestart.reddit.listposts.ListPostsViewModel
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 23.12.17.
 */
class ListPostsFragment : FragmentView<ListPostsComponent>() {

    @Inject
    lateinit var viewModel: ListPostsViewModel

    companion object {
        fun newInstance() : ListPostsFragment {
            var args = Bundle()
            var fragment = ListPostsFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_posts, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun injectDependencies(component: ListPostsComponent) {
       component.inject(this)
    }

    override fun createComponent(): ListPostsComponent {
        return (activity.application as MainApplication).listPostsComponent
    }

    override fun setState() {
        binding.setVariable(BR.model, viewModel)
        binding.executePendingBindings()
    }
}