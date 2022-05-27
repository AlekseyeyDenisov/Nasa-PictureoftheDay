package ru.dw.astronomypictureoftheday.ui.list.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import ru.dw.astronomypictureoftheday.databinding.ItemPhotoDayBinding
import ru.dw.astronomypictureoftheday.model.DayPhotoResponse

class HolderAdapterPhotoItem(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(dayPhoto: DayPhotoResponse) {
        ItemPhotoDayBinding.bind(itemView).apply {
            titleItem.text = dayPhoto.title
            photoItem.load(dayPhoto.url)
        }

    }

}