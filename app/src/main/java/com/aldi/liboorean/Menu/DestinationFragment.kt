package com.aldi.liboorean.Menu


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.aldi.liboorean.Interface.ChangeToolbarTitle

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_destination.*

class DestinationFragment : Fragment() {
    var category1: String? = null
    var category2: String? = null
    var category3: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for getActivity() fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (activity as ChangeToolbarTitle).showToolbar(false)
        chooseCategorySpinner1()
        setupNextButton()
        setupBackButton()
    }

    private fun chooseCategorySpinner1() {
        layoutNamaPulau.setOnClickListener {
            if (layoutNamaPulau.isVisible) {
                layoutNamaPulau.visibility = View.INVISIBLE
                val categoryArray =
                    getActivity()?.let { it1 -> ArrayAdapter(it1, R.layout.spinner_item, resources.getStringArray(R.array.category_pulau)) }
                spinner1.adapter = categoryArray as SpinnerAdapter?
                spinner1.performClick()
                chooseCategorySpinner2()
                spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(p0: AdapterView<*>?) {

                    }

                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        category1 = categoryArray?.getItem(p2).toString()

                        when (p2) {
                            0 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_sumatra)
                                    )
                                }
                                spinner2.adapter = category2Array

                            }
                            1 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_jawa)
                                    )
                                }
                                spinner2.adapter = category2Array
                            }
                            2 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_kalimantan)
                                    )
                                }
                                spinner2.adapter = category2Array
                            }
                            3 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_sulawesi)
                                    )
                                }
                                spinner2.adapter = category2Array
                            }
                            4 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_papua)
                                    )
                                }
                                spinner2.adapter = category2Array
                            }
                            5 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_bali)
                                    )
                                }
                                spinner2.adapter = category2Array
                                spinner3.adapter = category2Array
                            }
                            6 -> {
                                val category2Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.pulau_nusaTenggara)
                                    )
                                }
                                spinner2.adapter = category2Array
                            }
                        }
                        spinner1.visibility= View.VISIBLE
                    }
                }
                spinner1.visibility=View.VISIBLE
            }else{
                layoutNamaPulau.visibility=View.VISIBLE
            }
        }
    }

    private fun chooseCategorySpinner2() {
        layoutNamaProvinsi.visibility=View.VISIBLE
        layoutNamaProvinsi.setOnClickListener {
            if (layoutNamaProvinsi.isVisible) {
                layoutNamaProvinsi.visibility=View.INVISIBLE
                spinner2.performClick()
                chooseCategorySpinner3()
                spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(p0: AdapterView<*>?) {
                    }

                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        category2 = spinner2.getItemAtPosition(p2).toString()

                        when (category2) {
                            "Aceh" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sumatra_aceh)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sumatra Utara" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sumatra_utara)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sumatra Barat" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sumatra_barat)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sumatra Selatan" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sumatra_selatan)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Riau" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sumatra_riau)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Jawa Barat" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.jawa_barat)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Jawa Tengah" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.jawa_tengah)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Jawa Timur" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.jawa_timur)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Daerah Istimewa Yogyakarta" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.jawa_jogja)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Banten" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.jawa_banten)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Kalimantan Barat" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.kalimantan_barat)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Kalimantan Tengah" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.kalimantan_tengah)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Kalimantan Timur" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.kalimantan_timur)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Kalimantan Selatan" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.kalimantan_selatan)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Kalimantan Utara" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.kalimantan_utara)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sulawesi Barat" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sulawesi_barat)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sulawesi Tengah" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sulawesi_tengah)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sulawesi Tenggara" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sulawesi_tenggara)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sulawesi Selatan" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sulawesi_selatan)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Sulawesi Utara" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.sulawesi_utara)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Papua" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1,
                                        R.layout.spinner_item,
                                        resources.getStringArray(R.array.papua_papua)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Nusa Tenggara Barat" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1, R.layout.spinner_item, resources.getStringArray(R.array.ntb)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                            "Nusa Tenggara Timur" -> {
                                val category3Array = getActivity()?.let { it1 ->
                                    ArrayAdapter(
                                        it1, R.layout.spinner_item, resources.getStringArray(R.array.ntt)
                                    )
                                }
                                spinner3.adapter = category3Array
                            }
                        }
                    }
                }
                spinner2.visibility=View.VISIBLE
            } else{
                layoutNamaProvinsi.visibility=View.VISIBLE
            }
        }
    }

    private fun chooseCategorySpinner3() {
        layoutNamaKota.visibility=View.VISIBLE
        layoutNamaKota.setOnClickListener {
            if (layoutNamaKota.isVisible) {
                layoutNamaKota.visibility=View.INVISIBLE
                spinner3.performClick()
                spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(p0: AdapterView<*>?) {
                    }

                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        category3 = spinner3.getItemAtPosition(p2).toString()
                    }
                }
                spinner3.visibility=View.VISIBLE } else{
                layoutNamaKota.visibility=View.VISIBLE
            }
        }
    }
    private fun setupBackButton(){
        buttonBack.setOnClickListener{
            findNavController().navigateUp()
        }
    }
    @SuppressLint("ShowToast")
    private fun setupNextButton() {
        btnDestination.setOnClickListener {
            if (category1 != null && category2 != null && category3 != null) {
            val args = DestinationFragmentDirections.actionDestinationFragmentToSecondMenuFragment(category1!!,
                category2!!, category3!!
            )
                findNavController().navigate(args)
            } else {
                Toast.makeText(getActivity(),"Mohon Pilih Destinasi Terlebih Dahulu!", Toast.LENGTH_LONG).show()
            }
        }
    }
    private operator fun String.invoke(function: () -> Unit): () -> Unit {
        return function
    }
}
