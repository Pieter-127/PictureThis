package com.pieterventer.picturethis.data.repository

import com.pieterventer.picturethis.data.model.GalleryPicture
import com.pieterventer.picturethis.data.repository.resource.Resource

interface ImageRepository {
    suspend fun retrieveImageList(): Resource<ArrayList<GalleryPicture>>
}