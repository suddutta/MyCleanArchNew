package com.sudipta.cleanarchdemo.di


import com.sudipta.cleanarchdemo.model.PostsRepository
import org.koin.dsl.module

val repoModule = module {
    single { PostsRepository(get(), get()) }
}