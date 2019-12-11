package com.aldi.liboorean.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldi.liboorean.Model.Restaurant
import com.aldi.liboorean.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RestaurantAdapter(val listRestaurant: ArrayList<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.ListViewHolder> () {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgRestaurant : ImageView = itemView.findViewById(R.id.imageViewRestaurant)
        var namaRestaurant : TextView =  itemView.findViewById(R.id.tvNameRestaurant)
        var lokasiRestaurant : TextView =  itemView.findViewById(R.id.tvLokasiRestaurant)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_restaurant, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rekomendasi = listRestaurant[position]
        Glide.with(holder.itemView.context)
            .load(rekomendasi.photoRestaurant)
            .apply(RequestOptions())
            .into(holder.imgRestaurant)
        holder.namaRestaurant.text = rekomendasi.nameRestaurant
        holder.lokasiRestaurant.text=  rekomendasi.kotaRestaurant
    }

    override fun getItemCount(): Int {
        return listRestaurant.size
    }

}