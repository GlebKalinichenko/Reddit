package com.example.knifestart.reddit

import android.databinding.BaseObservable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by glebkalinichenko on 24.12.17.
 */
open class FragmentViewModel constructor(var disposables: CompositeDisposable = CompositeDisposable()) : BaseObservable(), IFragmentBaseViewModel {
    override fun onCreateView() {}

    override fun onStart() {}

    override fun onDestroyView() {}

    override fun dispose() {
        if (!disposables.isDisposed) disposables.dispose()
    }

    fun addDisposable(disposable: Disposable) = disposables.add(disposable)
}