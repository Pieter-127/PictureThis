package com.pieterventer.picturethis.ui.gallery

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.pieterventer.picturethis.R
import com.pieterventer.picturethis.data.model.GalleryPicture
import com.pieterventer.picturethis.util.inflateView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.gallery_item.view.*

class GalleryAdapter : RecyclerView.Adapter<GalleryAdapter.ReminderHolder>() {

    var items = arrayListOf<GalleryPicture>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: ReminderHolder, position: Int) {
        val item = items[position]

        holder.containerView.photo.load(item.url)
        holder.containerView.photographer.text = item.author
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReminderHolder =
        ReminderHolder.inflate(parent)

    override fun getItemCount(): Int = items.size

    class ReminderHolder constructor(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

        companion object {
            fun inflate(parent: ViewGroup):
                    ReminderHolder =
                ReminderHolder(inflateView(R.layout.gallery_item, parent, false))
        }
    }
}