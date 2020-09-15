package com.pieterventer.picturethis.di

import com.pieterventer.picturethis.data.retrofit.RestClient
import org.koin.dsl.module

val apiModule = module {

    single { RestClient.IMAGE_API }
}