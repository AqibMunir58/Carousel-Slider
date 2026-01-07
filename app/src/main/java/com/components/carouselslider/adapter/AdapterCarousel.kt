package  com.components.carouselslider.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import  com.components.carouselslider.databinding.ItemCarouselBinding

/**
 * @Author: AQIB MUNIR
 * @Date: 20,Dec,2024 
 * @Accounts
 *      -> https://github.com/AqibMunir58
 */

class AdapterCarousel : ListAdapter<String, AdapterCarousel.CustomViewHolder>(customDiffUtils) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCarouselBinding.inflate(layoutInflater, parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.mtvTitle.text = getItem(position)
    }

    inner class CustomViewHolder(val binding: ItemCarouselBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val customDiffUtils = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }
}