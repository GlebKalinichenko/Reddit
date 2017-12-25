package com.example.knifestart.reddit

/**
 * Created by glebkalinichenko on 25.12.17.
 */
interface BaseViewModel {
    val LOG_TAG: String
        get() = this.javaClass.canonicalName

    fun dispose()
}