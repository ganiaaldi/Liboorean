package com.aldi.liboorean.Destination

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.RestaurantAdapter
import com.aldi.liboorean.Model.Restaurant

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_restaurant.*


class RestaurantFragment : Fragment() {
    private val restaurantData = arrayListOf(
        Restaurant("Bukit Keraton","Jawa Barat","Bandung", "aa", R.drawable.tebingkeraton),
        Restaurant("Danau Bacan","Jawa Barat","Sukabumi", "bb", R.drawable.danaubacan),
        Restaurant("Curug Lawe","Jawa Tengah","Semarang", "cc", R.drawable.curuglawe)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        restaurantRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
            adapter = RestaurantAdapter(restaurantData)
        }
    }
}
