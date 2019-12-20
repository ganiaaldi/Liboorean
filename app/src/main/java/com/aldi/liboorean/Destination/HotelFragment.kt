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
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.HotelAdapter
import com.aldi.liboorean.Menu.SecondMenuFragment
import com.aldi.liboorean.Model.Hotel

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_hotel.*
import kotlinx.android.synthetic.main.fragment_hotel.view.*
import kotlinx.android.synthetic.main.fragment_second_menu.*


class HotelFragment : Fragment() {
    private val hotelData = arrayListOf(
        Hotel("Ayani Hotel","Aceh","Aceh", "Jl. Jend. Ahmad Yani No.20, Peunayong, Kuta Alam, Kota Banda Aceh, Aceh 23122",
            "Hotel kami terletak tepat di jantung kota Banda Aceh, lokasi kami pada akhirnya nyaman, relatif beberapa menit dari pusat kota, kantor-kantor pemerintah dan Masjid Baiturrahman yang terkenal dengan mobil dan berjalan kaki ke berbagai jalan makanan. Pilihan utama untuk semua jenis wisatawan. Masjid Baiturrahman yang ikonik, Kantor Pemerintah dan pusat bisnis di Banda Aceh berlokasi nyaman dalam radius kurang dari 5 kilometer. dibutuhkan sekitar 20 menit perjalanan dengan mobil ke Bandara Internasional Sultan Iskandar Muda\n" +
                    "Ayani Hotel Banda Aceh bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Kuta Alam. Fasilitas yang tersedia di Ayani Hotel Banda Aceh akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Ayani Hotel Banda Aceh ketika Anda melakukan kunjungan kerja atau berwisata ke Kuta Alam dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",
            R.drawable.acehayanihotel),
        Hotel("Grand Arabia","Aceh","Aceh", "JL. Prof. A. Majid Ibrahim II No. 3, Kp. Baru, Baiturrahman, Kota Banda Aceh, Aceh 23246, Indonesia",
            "Terletak di seberang jalan dari taman dan 9 menit berjalan kaki dari Masjid Agung Baiturrahman, hotel yang dipoles ini berjarak 2 km dari Museum Negeri Aceh dan 17 km dari Bandara Internasional Sultan Iskandar Muda.\n" +
                    "Kamar-kamar yang hangat memiliki TV layar datar dan Wi-Fi gratis, serta minifridge, teh dan pembuat kopi, dan brankas. Beberapa menawarkan area tempat duduk. Suites menambahkan ruang tamu dan ruang makan terpisah, ditambah kamar mandi tamu. Layanan kamar tersedia 24/7.\n" +
                    "Sarapan gratis. Fasilitasnya meliputi ruang makan kasual, fasilitas pertemuan, dan sauna, plus layanan pijat. Parkir dan transfer bandara juga ditawarkan.\n",
            R.drawable.acehgrandarabia),
        Hotel("Hermes Palace Banda Aceh","Aceh","Aceh", "Jl. T. Panglima Nyak Makam, Aceh 23117",
            "Berjarak 2 km dari Taman Queen Safiatuddin, hotel santai ini berjarak 5 km dari Museum Aceh dan dari Masjid Agung Baiturrahman.\n" +
                    "Kamar-kamar yang terang-terangan menawarkan Wi-Fi gratis, TV, dan minifridge, plus fasilitas teh dan pembuat kopi. Suites menambahkan ruang tamu atau ruang tamu yang terpisah. Layanan kamar tersedia 24/7.\n" +
                    "Ada restoran dan lounge lobi. Fasilitas lainnya mencakup kolam renang outdoor, pusat kebugaran, dan spa, plus area bermain anak-anak dan ruang acara. Sarapan prasmanan tersedia.\n",
            R.drawable.acehhermeshotel)
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hotelRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
                adapter = HotelAdapter(hotelData)
            (adapter as HotelAdapter).setOnItemClickCallback(object : HotelAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Hotel) {
                    showSelectedHotel(data)
                }
            })
        }
    }

    private fun showSelectedHotel(vacation: Hotel) {
        Toast.makeText(context, "Kamu memilih " + vacation.nameHotel, Toast.LENGTH_SHORT).show()
    }
}