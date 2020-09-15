package com.pieterventer.picturethis.di

import com.pieterventer.picturethis.ui.gallery.GalleryViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val viewModelModule = module {

    viewModel { GalleryViewModel(get()) }

}