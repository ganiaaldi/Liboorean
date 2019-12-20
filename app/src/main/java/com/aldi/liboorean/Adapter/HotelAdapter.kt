package com.aldi.liboorean.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldi.liboorean.Model.Hotel
import com.aldi.liboorean.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HotelAdapter (val listHotel: ArrayList<Hotel>) : RecyclerView.Adapter<HotelAdapter.ListViewHolder> () {

    override fun getItemCount(): Int {
        return listHotel.size
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Hotel)
    }
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgHotel : ImageView = itemView.findViewById(R.id.imageViewHotel)
        var namaHotel : TextView =  itemView.findViewById(R.id.tvNameHotel)
        var lokasiHotel : TextView =  itemView.findViewById(R.id.tvLokasiHotel)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_hotel, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rekomendasi = listHotel[position]
        Glide.with(holder.itemView.context)
            .load(rekomendasi.photoHotel)
            .apply(RequestOptions())
            .into(holder.imgHotel)
        holder.namaHotel.text = rekomendasi.nameHotel
        holder.lokasiHotel.text=  rekomendasi.kotaHotel
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listHotel[holder.adapterPosition])
        }
    }
    
}