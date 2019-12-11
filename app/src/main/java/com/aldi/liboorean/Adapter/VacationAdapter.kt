package com.aldi.liboorean.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldi.liboorean.Model.Vacation
import com.aldi.liboorean.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class VacationAdapter(val listVacation: ArrayList<Vacation>) : RecyclerView.Adapter<VacationAdapter.ListViewHolder> () {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgVacation : ImageView = itemView.findViewById(R.id.imageViewVacation)
        var namaVacation : TextView =  itemView.findViewById(R.id.tvNameVacation)
        var lokasiVacation : TextView =  itemView.findViewById(R.id.tvLokasiVacation)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_rekomendasi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rekomendasi = listVacation[position]
        Glide.with(holder.itemView.context)
            .load(rekomendasi.photoVacation)
            .apply(RequestOptions())
            .into(holder.imgVacation)
        holder.namaVacation.text = rekomendasi.nameVacation
        holder.lokasiVacation.text=  rekomendasi.kotaVacation
    }

    override fun getItemCount(): Int {
        return listVacation.size
    }

}