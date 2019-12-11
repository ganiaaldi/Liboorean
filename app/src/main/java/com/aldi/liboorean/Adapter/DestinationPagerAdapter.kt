package com.aldi.liboorean.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.aldi.liboorean.Destination.HotelFragment
import com.aldi.liboorean.Destination.RestaurantFragment
import com.aldi.liboorean.Destination.VacationFragment

class DestinationPagerAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> VacationFragment()
            1 -> HotelFragment()
            else -> RestaurantFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Vacation"
            1 -> "Hotel"
            else -> "Restaurant"
        }
    }
}