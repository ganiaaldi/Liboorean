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
import kotlinx.android.synthetic.main.fragment_second_menu.*


class RestaurantFragment : Fragment() {
    private val restaurantDataAceh = arrayListOf(
        Restaurant("Eungkot Keumamah","Aceh","Aceh", "Wilayah Aceh yang dikelilingi perairan membuat masyarakat Aceh dekat dengan hasil laut. Yang paling mahsyur sejak dahulu adalah ikan tongkol atau ‘Engkot Suree’. Proses memasak ‘Eungkot Keumamah’ yang melibatkan perebusan, pengasapan, dan penjemuran di terik matahari menjadikan ikan tongkol bertekstur keras seperti kayu. Namun begitu, hal ini menjadikan masakan tersebut awet, tahan lama, dan tidak mudah basi.\n" +
                "Eungkot Keumamah dapat diolah lagi menjadi berbagai masakan. Karena harganya terjangkau, masyarakat Aceh gemar mengonsumsi dan menyimpan bahan makanan ini untuk dimasak sewaktu-waktu. Beberapa produsen juga sudah mulai menyediakan produk Eungkot Keumamah dalam kemasan per 100 gram atau per kilogram. Cocok untuk oleh-oleh, nih.\n" +
                "Lokasi: Tersedia hampir di seluruh rumah makan di Banda Aceh (dengan ragam olahannya)\n" +
                "Harga: Mulai dari 10,000 IDR per porsi atau mulai dari 45,000 IDR per 100 gram (kemasan oleh-oleh)\n", R.drawable.aceheungkotkeumamah),
        Restaurant("Ayam Tangkap","Aceh","Aceh", "Kuliner Banda Aceh dan sekitarnya yang satu ini, juga cukup terkenal. Pertama, ayam digoreng dengan bumbu-bumbu sebagaimana ayam goreng pada umumnya. Saat ayam setengah matang, lalu dimasak dengan daun-daun seperti daun kari, potongan daun pandan, dan salam koja. Tidak hanya menjadi pemanis sajian, masyarakat Aceh biasa memakan dedaunan tersebut, lho. Ayam tangkap disajikan dengan nasi gurih, atau yang kita ketahui sebagai nasi uduk. Rasa pedas ayam goreng yang menggelitik, berpadu dengan wangi dedaunan, plus lezatnya nasi pulen, yakin cukup sepiring?\n" +
                "Lokasi: Warung Nasi Kambing Lem Bakrie, Jl. Prof. Ali Hasyimi, Lamteh, Kec. Ulee Kareng, Kota Banda Aceh\n" +
                "Jam Buka: Setiap hari, 11.00 hingga 15.00\n" +
                "Harga: Mulai dari 30,000 IDR per porsi\n", R.drawable.acehayamtangka),
        Restaurant("Rujak Aceh","Aceh","Aceh", "Kuliner Banda Aceh dan sekitarnya yang populer di seantero Aceh dan Sumatera Utara ini, harus kamu coba. Rujak Aceh juga kerap disebut dengan nama rujak serut atau rujak kweni. Yang wajib ada di Rujak Aceh adalah buah bengkuang, belimbing, nanas, timun, dan mangga; sisanya terserah penjual atau tergantung pada musim.\n" +
                "Di samping disajikan dengan saus berbahan gula jawa dan asam jawa, para penjaja Rujak Aceh kerap mencampur rujak dengan manisan seperti salak atau jambu, lengkap dengan sedikit kuah. Hasilnya, Rujak Aceh bercita rasa asam, manis, dan crunchy.\n" +
                "Lokasi: Jalan Tgk. Pulo Dibaroh (di belakang Masjid Raya Baiturrahman), Banda Aceh\n" +
                "Harga: Sekitar 5,000 – 15,000 IDR per porsi\n", R.drawable.acehrujakk)
    )
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
