package com.sudipta.cleanarchdemo.di


import com.sudipta.cleanarchdemo.data.persistence.AppDataBase
import org.koin.dsl.module

val persistenceModule = module {
    single { AppDataBase.getInstance(get()) }
    single { get<AppDataBase>().getPostDao() }
}