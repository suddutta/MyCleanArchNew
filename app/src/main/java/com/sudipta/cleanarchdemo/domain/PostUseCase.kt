package com.sudipta.cleanarchdemo.domain

import com.sudipta.cleanarchdemo.data.persistence.PostDB
import io.reactivex.Single

interface PostUseCase {
    fun getPosts(): Single<List<PostDB>>
}