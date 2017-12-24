package com.example.knifestart.reddit.listposts

import com.example.knifestart.domain.FetchPostsUseCase
import com.example.knifestart.reddit.FragmentViewModel
import com.example.knifestart.reddit.fragment.PostDetailsFragment
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created by glebkalinichenko on 24.12.17.
 */
class ListPostsViewModel @Inject constructor(var fetchPostsUseCase: FetchPostsUseCase, var router: Router) : FragmentViewModel(), IListPostViewModel {

    override fun openPostDetails() {
        router.navigateTo(PostDetailsFragment.javaClass.canonicalName, 2)
    }
}