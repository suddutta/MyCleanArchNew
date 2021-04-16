package com.sudipta.cleanarchdemo.data.datasource

import com.sudipta.cleanarchdemo.data.persistence.PostDB


interface PostPersistenceDataSource {
    suspend fun getPostsFromPersistence(): List<PostDB>
    suspend fun savePostsToPersistence(listOfPosts: ArrayList<PostDB>)
}