package com.aldi.liboorean.Detail

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.aldi.liboorean.Interface.ChangeToolbarTitle

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_promo_detail.*


class PromoDetailFragment : Fragment() {
    var photoDetail: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_promo_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(false)
        setupBackButton()
        photoDetail = PromoDetailFragmentArgs.fromBundle(arguments!!).photoPromo!!

        detail_promoo.setImageResource(photoDetail)
    }

    private fun setupBackButton() {
        buttoonBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
