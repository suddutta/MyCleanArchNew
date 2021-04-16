package com.sudipta.cleanarchdemo.model

import com.sudipta.cleanarchdemo.extensions.ioThread
import com.sudipta.cleanarchdemo.extensions.with
import com.sudipta.cleanarchdemo.data.network.PostApi
import com.sudipta.cleanarchdemo.data.network.PostNetworkResponse
import com.sudipta.cleanarchdemo.data.persistence.PostDB
import com.sudipta.cleanarchdemo.data.persistence.PostDao
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

class PostsRepository(private val api: PostApi, private val dao: PostDao)  {

//    override fun getPosts(): Single<List<PostDB>> {
//
//        return Observable.create { emitter ->
//            ioThread {
//                if (dao.findAllPosts().isNullOrEmpty()) {
//                    api.getPosts().with()
//                        .subscribe({
//                            saveAllPosts(it).with()
//                                .doOnComplete {
//                                    emitter.onNext(PostDB.mapList(it))
//                                    emitter.onComplete()
//                                }.subscribe()
//                        }, {
//                            emitter.onError(it)
//                        })
//
//                } else {
//                    emitter.onNext(dao.findAllPosts())
//                    emitter.onComplete()
//                }
//            }
//
//        }
//    }
//
//    private fun saveAllPosts(postList: List<PostNetworkResponse>): Completable = Completable.fromCallable {
//        dao.insertList(PostDB.mapList(postList) as ArrayList<PostDB>)
//    } //TODO delete when the new repo logic is implemented

}