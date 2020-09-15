package com.pieterventer.picturethis.data.model

import com.google.gson.annotations.SerializedName

data class GalleryPicture(
    val author: String,
    @SerializedName("download_url")
    val url: String
)