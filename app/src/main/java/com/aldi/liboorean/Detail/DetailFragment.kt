package com.aldi.liboorean.Detail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.aldi.liboorean.Interface.ChangeToolbarTitle

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {
    lateinit var namaDestinasi : String
    lateinit var provinsiDestinasi : String
    lateinit var kotaDestinasi : String
    lateinit var alamatDestinasi : String
    lateinit var detailDestinasi : String
    var photoDestinasi : Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(false)
        namaDestinasi = DetailFragmentArgs.fromBundle(arguments!!).nameDestination!!
        provinsiDestinasi = DetailFragmentArgs.fromBundle(arguments!!).provinsiDestination!!
        kotaDestinasi = DetailFragmentArgs.fromBundle(arguments!!).kotaDestination!!
        alamatDestinasi = DetailFragmentArgs.fromBundle(arguments!!).alamatDestination!!
        detailDestinasi = DetailFragmentArgs.fromBundle(arguments!!).detailDestination!!
        photoDestinasi = DetailFragmentArgs.fromBundle(arguments!!).photoDestination!!

       detail_promo.setImageResource(photoDestinasi)
        tvNamaDestinasi.text = namaDestinasi
        tvLokasi.text = kotaDestinasi
        tvLokasiDetail.text = alamatDestinasi
        tv_item_description.text = detailDestinasi
        setupBackButton()

        btnAddWishlistt.setOnClickListener {
            Toast.makeText(context,  namaDestinasi +" Telah ditambahkan ke wishlist. ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupBackButton() {
        buttonBackk.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
