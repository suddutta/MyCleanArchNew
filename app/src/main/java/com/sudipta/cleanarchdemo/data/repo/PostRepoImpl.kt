package com.sudipta.cleanarchdemo.data.repo

import com.sudipta.cleanarchdemo.data.datasource.PostNetworkDataSource
import com.sudipta.cleanarchdemo.data.datasource.PostPersistenceDataSource
import com.sudipta.cleanarchdemo.data.persistence.PostDB
import com.sudipta.cleanarchdemo.data.repo.PostRepo
import io.reactivex.Single

class PostRepoImpl(
    private val networkDataSource: PostNetworkDataSource,
    private val postPersistenceDataSource: PostPersistenceDataSource
) : PostRepo {
    override fun getPostList(): Single<List<PostDB>> {
        //TODO do the magic here

        return getPostList()
    }
}