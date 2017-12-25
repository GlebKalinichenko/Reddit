package com.example.knifestart.domain

import com.example.knifestart.domain.responses.NewsResponse
import com.example.knifestart.domain.responses.PostResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by glebkalinichenko on 19.12.17.
 */
interface IRemoteApi {
    @GET("top.json")
    fun fetchPosts(@Query("limit") limit: String) : Observable<List<NewsResponse>>
}