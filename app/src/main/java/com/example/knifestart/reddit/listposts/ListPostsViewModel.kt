package com.example.knifestart.reddit.listposts

import android.util.Log
import com.example.knifestart.domain.FetchPostsUseCase
import com.example.knifestart.reddit.FragmentViewModel
import com.example.knifestart.reddit.fragment.PostDetailsFragment
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 24.12.17.
 */
class ListPostsViewModel @Inject constructor(var fetchPostsUseCase: FetchPostsUseCase, var router: Router) : FragmentViewModel(), IListPostViewModel {
    override fun onCreateView() {

    }

    override fun onStart() {
        fetchPosts(0, 10)
    }

    override fun openPostDetails() {
        router.navigateTo(PostDetailsFragment.javaClass.canonicalName, 2)
    }

    override fun fetchPosts(offset: Int, limit: Int) {
        addDisposable(fetchPostsUseCase.run(FetchPostsUseCase.FetchPostsParam(offset, limit))
                .doOnError { Log.d(LOG_TAG,  "Error") }
                .subscribe {
                    response -> Log.d(LOG_TAG, response.size.toString())
                })
    }

    override fun onDestroyView() {
        dispose()
    }
}