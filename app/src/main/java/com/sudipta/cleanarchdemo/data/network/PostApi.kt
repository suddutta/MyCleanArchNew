package com.sudipta.cleanarchdemo.data.network

import io.reactivex.Single
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    fun getPosts(): Single<List<PostNetworkResponse>>
}