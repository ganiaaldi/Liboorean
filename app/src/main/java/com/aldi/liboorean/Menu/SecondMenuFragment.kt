package com.aldi.liboorean.Menu

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aldi.liboorean.Adapter.DestinationPagerAdapter
import com.aldi.liboorean.Interface.ChangeToolbarTitle

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_second_menu.*

class SecondMenuFragment : Fragment() {
    lateinit var namaPulau : String
    lateinit var namaProvinsi : String
    lateinit var namaKota: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(true)
        (activity as ChangeToolbarTitle).updateTitle("Destinasi")
        destinationButton()

      val pagerAdapter = DestinationPagerAdapter(childFragmentManager)
        destinationViewPager.adapter = pagerAdapter
        destinationTabLayout.setupWithViewPager(destinationViewPager)
//Get arguments passing from previous fragment(workspaceName, workspaceType, workspaceCategory)
        namaPulau = SecondMenuFragmentArgs.fromBundle(arguments!!).category1Args!!
        namaProvinsi = SecondMenuFragmentArgs.fromBundle(arguments!!).category2Args!!
        namaKota = SecondMenuFragmentArgs.fromBundle(arguments!!).category3Args!!
        //view textview(Workspace Name) in android
    //  cate1.text = namaPulau
    ///    cate2.text = namaProvinsi
     //   cate3.text = namaKota

        if (namaPulau == "null" && namaProvinsi == "null" && namaKota == "null"){
            layoutNullDestination.visibility=View.VISIBLE
            destinationNotNull.visibility=View.GONE
        } else
        {
            layoutNullDestination.visibility=View.GONE
            destinationNotNull.visibility=View.VISIBLE
        }
    }

    private fun destinationButton() {
        btnSecondMenu.setOnClickListener {
            findNavController().navigate(R.id.destinationFragment)
        }
    }


}