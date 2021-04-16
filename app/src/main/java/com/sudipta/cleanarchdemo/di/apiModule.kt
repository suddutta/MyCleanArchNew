package com.sudipta.cleanarchdemo.di


import com.sudipta.cleanarchdemo.data.network.PostApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(PostApi::class.java) }
}