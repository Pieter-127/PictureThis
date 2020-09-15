package com.pieterventer.picturethis.di

import com.pieterventer.picturethis.data.repository.ImageRepository
import com.pieterventer.picturethis.data.repository.ImageRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<ImageRepository> { ImageRepositoryImpl(get()) }
}