package com.sudipta.cleanarchdemo.data.datasourceimpl


import com.sudipta.cleanarchdemo.data.datasource.PostNetworkDataSource
import com.sudipta.cleanarchdemo.data.network.PostApi
import com.sudipta.cleanarchdemo.data.network.PostNetworkResponse
import io.reactivex.Single

class PostRetrofitDataSource(private val api: PostApi) : PostNetworkDataSource {
    override fun getVehiclesFromNetwork(): Single<List<PostNetworkResponse>> {
        return api.getPosts()
    }
}