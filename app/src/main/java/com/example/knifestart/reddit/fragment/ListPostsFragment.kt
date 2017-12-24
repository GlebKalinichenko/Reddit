package com.example.knifestart.reddit.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.knifestart.reddit.R
import com.example.knifestart.reddit.application.MainApplication
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 23.12.17.
 */
class ListPostsFragment : Fragment() {

    @Inject
    lateinit var router: Router

    companion object {
        fun newInstance() : ListPostsFragment {
            var args = Bundle()
            var fragment = ListPostsFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_list_posts, container, false)
        (activity.application as MainApplication).listPostsComponent.inject(this)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view!!.findViewById<TextView>(R.id.text_click).setOnClickListener {
            router.navigateTo(PostDetailsFragment.javaClass.canonicalName, 2)
        }
    }
}