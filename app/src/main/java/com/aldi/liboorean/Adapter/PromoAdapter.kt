package com.aldi.liboorean.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.aldi.liboorean.Model.Promo
import com.aldi.liboorean.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_promo.view.*

class PromoAdapter(val listPromo: ArrayList<Promo>) : RecyclerView.Adapter<PromoAdapter.ListViewHolder> () {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var imgPromo : ImageView = itemView.findViewById(R.id.imageViewPromo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_promo, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val promo = listPromo[position]
        Glide.with(holder.itemView.context)
            .load(promo.photoPromo)
            .apply(RequestOptions())
            .into(holder.imgPromo)
    }

    override fun getItemCount(): Int {
        return listPromo.size
    }


}