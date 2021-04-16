package com.sudipta.cleanarchdemo.domain

import com.sudipta.cleanarchdemo.model.PostsRepository
import io.reactivex.Single

class PostInteractor(private val postsRepository: PostsRepository) : PostUseCase {
    override fun getPosts(): Single<List<Post>> {
       return postsRepository.getPosts()
    }
}