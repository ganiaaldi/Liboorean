package com.aldi.liboorean.Menu

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.PromoAdapter
import com.aldi.liboorean.Interface.ChangeToolbarTitle
import com.aldi.liboorean.Model.Promo

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_first_menu.*

class FirstMenuFragment : Fragment() {

    private val promoData = arrayListOf(
        Promo("Raising Arizona", "aa", R.drawable.jungle),
        Promo("Vampire's Kiss", "bb", R.drawable.hotel_banner),
        Promo("Con Air", "cc", R.drawable.bk)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(true)
        (activity as ChangeToolbarTitle).updateTitle("Beranda")

        rvPromo.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
            adapter = PromoAdapter(promoData)
        }
    }
}