package com.pieterventer.picturethis.data.repository

import com.pieterventer.picturethis.data.model.GalleryPicture
import com.pieterventer.picturethis.data.repository.resource.Resource
import com.pieterventer.picturethis.data.repository.resource.safeApiCall
import com.pieterventer.picturethis.data.retrofit.ImageApi
import retrofit2.Response
import timber.log.Timber

class ImageRepositoryImpl(private val imageApi: ImageApi) : ImageRepository {

    override suspend fun retrieveImageList(): Resource<ArrayList<GalleryPicture>> {
        return safeApiCall {
            imageApi.getPictures()
        }
    }
}