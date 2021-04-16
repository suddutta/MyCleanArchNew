package com.sudipta.cleanarchdemo.data.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sudipta.cleanarchdemo.data.network.PostNetworkResponse
import com.sudipta.cleanarchdemo.utils.TABLE_POSTS


@Entity(tableName = TABLE_POSTS)
data class PostDB(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "userId") val userId: Long = 0,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "body") val body: String?
) {
    companion object {
        fun map(post: PostNetworkResponse): PostDB {
            return PostDB(
                id = post.id,
                userId = post.userId,
                title = post.title,
                body = post.body
            )
        }

        fun mapList(postList: List<PostNetworkResponse>): List<PostDB> {
            val listPostDB = mutableListOf<PostDB>()
            for (post in postList) {
                listPostDB.add(map(post))
            }
            return listPostDB
        }
    }
}