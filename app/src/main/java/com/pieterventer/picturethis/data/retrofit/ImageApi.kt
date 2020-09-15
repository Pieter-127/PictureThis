package com.pieterventer.picturethis.data.retrofit

import com.pieterventer.picturethis.data.model.GalleryPicture
import retrofit2.http.GET

interface ImageApi {

    @GET(value = "list")
    suspend fun getPictures(): ArrayList<GalleryPicture>
}