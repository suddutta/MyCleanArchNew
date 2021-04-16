package com.sudipta.cleanarchdemo.data.datasource


import com.sudipta.cleanarchdemo.data.network.PostNetworkResponse
import io.reactivex.Single

interface PostNetworkDataSource {
    fun getVehiclesFromNetwork(): Single<List<PostNetworkResponse>>
}