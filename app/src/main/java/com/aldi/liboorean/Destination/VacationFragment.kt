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
import com.aldi.liboorean.Adapter.VacationAdapter
import com.aldi.liboorean.Model.Vacation

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_vacation.*


class VacationFragment : Fragment() {
    private val vacationData = arrayListOf(
        Vacation("Bukit Keraton","Jawa Barat","Bandung", "aa", R.drawable.tebingkeraton),
        Vacation("Danau Bacan","Jawa Barat","Sukabumi", "bb", R.drawable.danaubacan),
        Vacation("Curug Lawe","Jawa Tengah","Semarang", "cc", R.drawable.curuglawe)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vacation, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vacationRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
            adapter = VacationAdapter(vacationData)
        }
    }
}
