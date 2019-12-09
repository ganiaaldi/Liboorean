package com.aldi.liboorean.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldi.liboorean.Model.Rekomendasi
import com.aldi.liboorean.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_promo.view.*

class RekomendasiAdapter(val listRekomendasi: ArrayList<Rekomendasi>) : RecyclerView.Adapter<RekomendasiAdapter.ListViewHolder> () {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgRekomendasi : ImageView = itemView.findViewById(R.id.imageViewRekomendasi)
        var namaRekomendasi : TextView =  itemView.findViewById(R.id.tvNameRekomendasi)
        var lokasiRekomendasi : TextView =  itemView.findViewById(R.id.tvLokasiRekomendasi)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_rekomendasi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rekomendasi = listRekomendasi[position]
        Glide.with(holder.itemView.context)
            .load(rekomendasi.photoRekomendasi)
            .apply(RequestOptions())
            .into(holder.imgRekomendasi)
        holder.namaRekomendasi.text = rekomendasi.nameRekomendasi
        holder.lokasiRekomendasi.text=  rekomendasi.daerahRekomendasi
    }

    override fun getItemCount(): Int {
        return listRekomendasi.size
    }


}