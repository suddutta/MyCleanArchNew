package com.sudipta.cleanarchdemo.data.datasourceimpl

import com.sudipta.cleanarchdemo.data.datasource.PostPersistenceDataSource
import com.sudipta.cleanarchdemo.data.persistence.PostDB
import com.sudipta.cleanarchdemo.data.persistence.PostDao


class PostRoomDataSource(private val dao: PostDao) : PostPersistenceDataSource {
    override suspend fun getPostsFromPersistence(): List<PostDB> {
        return dao.findAllPosts()
    }

    override suspend fun savePostsToPersistence(listOfPosts: ArrayList<PostDB>) {
        dao.insertList(listOfPosts)
    }
}