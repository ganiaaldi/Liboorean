package com.aldi.liboorean.Menu

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
import kotlinx.android.synthetic.main.fragment_third_menu.*

class ThirdMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(true)
        (activity as ChangeToolbarTitle).updateTitle("Wishlist")
    }

    private fun destinationButton() {
        btnAddWishlist.setOnClickListener {
            findNavController().navigate(R.id.secondMenuFragment)
        }
    }

}