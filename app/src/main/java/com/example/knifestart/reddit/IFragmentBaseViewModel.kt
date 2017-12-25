package com.example.knifestart.reddit

/**
 * Created by glebkalinichenko on 24.12.17.
 */
interface IFragmentBaseViewModel : BaseViewModel {
    fun onCreateView()
    fun onStart()
    fun onDestroyView()
}