package com.pieterventer.picturethis.ui.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pieterventer.picturethis.data.model.GalleryPicture
import com.pieterventer.picturethis.data.repository.ImageRepository
import com.pieterventer.picturethis.data.repository.resource.Resource
import kotlinx.coroutines.launch

class GalleryViewModel(private val imageRepository: ImageRepository) : ViewModel() {

    val imageList = MutableLiveData<ArrayList<GalleryPicture>>()

    fun retrieveListOfImages() {

        viewModelScope.launch {

            val result = imageRepository.retrieveImageList()

            if (result is Resource.Success) {
                imageList.value = result.value
            }
        }
    }
}