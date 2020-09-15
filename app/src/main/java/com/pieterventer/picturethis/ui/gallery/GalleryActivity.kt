package com.pieterventer.picturethis.ui.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.pieterventer.picturethis.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class GalleryActivity : AppCompatActivity() {

    private val viewModel by viewModel<GalleryViewModel>()

    lateinit var galleryAdapter: GalleryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar?.let {
            setSupportActionBar(it)
        }

        setupGalleryAdapter()

        viewModel.retrieveListOfImages()

        viewModel.imageList.observe(this, Observer {
            it?.let { galleryPictures ->
                if (::galleryAdapter.isInitialized) {
                    galleryAdapter.items = galleryPictures
                }
            }
        })
        gallery.setOnClickListener {
            viewModel.retrieveListOfImages()
        }
    }

    private fun setupGalleryAdapter() {
        galleryAdapter = GalleryAdapter()

        val manager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        manager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        gallery.apply {
            layoutManager = manager
            adapter = galleryAdapter
        }
    }
}