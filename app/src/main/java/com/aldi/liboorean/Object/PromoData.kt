package com.aldi.liboorean.Object

import com.aldi.liboorean.Model.Promo
import com.aldi.liboorean.R

object PromoData {
    private val promoNames = arrayOf("Promo Liburan The Jungle Bogor",
        "Promo Hotel",
        "Promo Burger King"
        )

    private val promoDetails = arrayOf("Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
        "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
        "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan."
        )

    private val promoImages = intArrayOf(R.drawable.jungle,
        R.drawable.hotel_banner,
        R.drawable.bk)

    val listData: ArrayList<Promo>
        get() {
            val list = arrayListOf<Promo>()
            for (position in promoNames.indices) {
                val promo = Promo()
                promo.namePromo = promoNames[position]
                promo.detailPromo = promoDetails[position]
               promo.photoPromo = promoImages[position]
                list.add(promo)
            }
            return list
        }
}