package com.sudipta.cleanarchdemo.data.repo

import com.sudipta.cleanarchdemo.data.persistence.PostDB
import io.reactivex.Single

interface PostRepo {
    fun getPostList() : Single<List<PostDB>>
}