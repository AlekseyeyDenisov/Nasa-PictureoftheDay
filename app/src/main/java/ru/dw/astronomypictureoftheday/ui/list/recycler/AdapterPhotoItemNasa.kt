package ru.dw.astronomypictureoftheday.ui.list.recycler


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.dw.astronomypictureoftheday.databinding.ItemPhotoDayBinding
import ru.dw.astronomypictureoftheday.model.DayPhotoResponse

class AdapterPhotoItemNasa: ListAdapter<DayPhotoResponse, HolderAdapterPhotoItem>(PhotoItemDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderAdapterPhotoItem {
       val binding = ItemPhotoDayBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HolderAdapterPhotoItem(binding.root)
    }

    override fun onBindViewHolder(holder: HolderAdapterPhotoItem, position: Int) {
        holder.bind(getItem(position))
    }

}