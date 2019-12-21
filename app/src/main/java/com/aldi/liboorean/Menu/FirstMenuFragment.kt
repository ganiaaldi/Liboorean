package com.aldi.liboorean.Menu

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.PromoAdapter
import com.aldi.liboorean.Adapter.RekomendasiAdapter
import com.aldi.liboorean.Interface.ChangeToolbarTitle
import com.aldi.liboorean.Model.Promo
import com.aldi.liboorean.Model.Rekomendasi

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_first_menu.*

class FirstMenuFragment : Fragment() {

    private val promoData = arrayListOf(
        Promo("Raising Arizona", "aa", R.drawable.jungle,R.drawable.the_jungle),
        Promo("Con Air", "cc", R.drawable.bk,R.drawable.burgerking),
        Promo("Vampire's Kiss", "bb", R.drawable.hotel_banner,R.drawable.burgerking)
    )

    private val rekomendasiData = arrayListOf(
        Rekomendasi("Tebing keraton","Jawa Barat","Bandung","Tebing Keraton Bandung yang terletak di daerah Dago Bandung merupakan tempat wisata lokal yang booming dengan bantuan sosial media. Jika anda pengguna sosial media seperti instagram, path, facebook,dll maka kemungkinan akan menemukan info atau foto tempat ini. Tebing keraton atau bukit keraton merupakan satu bukit dengan tebing terjal yang menghadap langsung ke area Taman Hutan Raya Juanda Bandung. Ditambah dengan background gunung tangkuban perahu, menambah keindahan area ini.\n" +
                "Tempat wisata di Bandung ini mulai dikenal di sosial media kurang lebih bulan Juli 2014, tapi karena keindahannya dengan cepat dikenal dan dikunjungi. Tidak jarang pula orang menyebut area tebing keraton sebagai bukit instagram, karena banyaknya pengguna sosmed yang posting foto tebing keraton di instagram.\n",
            R.drawable.tebingkeraton),
        Rekomendasi("Curug lawe","Jawa Tengah","Semarang","Curug Lawe adalah air terjun yang berada di Kawasan Gunung Ungaran di Semarang. Di Curug Lawe airnya benar-benar bersih dan tentu kondisi alam di sekitarnya sangat indah. Curug Lawe dan Benowo berada disebelah utara anak-anak Gunung Ungaran dan menjadi hulu Kali Banjir Kanal Barat atau Kali Garang di kota Semarang\n" +
                "Disebut Curug Lawe karena air yang jatuh dari tebing curam itu terlihat bagai benang-benang putih, yang dalam bahasa jawa disebut lawe. Versi lain menjelaskan dinamakan Curug Lawe karena konon jumlah air terjun yang ada, baik dari yang besar hingga yang terkecil berjumlah 25 buah yang dalam bahasa jawa Selawe.\n" +
                "Dalam satu kawasan terdapat dua air terjun yaitu curug lawe di sisi barat dan curug benowo di sisi timur yang berjarak sekitar 500m antar kedua air terjun.\n" +
                "Curug Lawe Benowo Kalisidi atau disingkat CLBK dikelola oleh Pemerintah Desa Kalisidi dan LMDH Bela Pesona sebagai mitra dari Perum Perhutani KPH Kedu Utara. Tiket masuk pengunjung Rp. 4.000,- sudah termasuk asuransi jasa raharja putera\n",
            R.drawable.curuglawe),
        Rekomendasi("Pantai Pulau Merah Banyuwangi","Jawa Timur","Banyuwangi","Pantai pulau Merah merupakan salah satu tempat wisata yang menjadi primadona Banyuwangi. Pantai ini terletak di Desa Sumberagung, Kecamatan Pesanggaran. Pantai pulau merah menjadi berbeda karena adanya sebuah pulau yang terletak di bibir pantai.\n" +
                "Keberadaan pulau ini membuat pantai ini semakin eksotis dan menjadi asal mula nama Pulau Merah. Selain pemandangannya yang bagus, gulungan ombaknya yang lumayan besar juga menjadi daya tarik lainnya. Banyak surfer pemula atau menengah berselancar di pantai pulau Merah tersebut.\n" +
                "Karena itulah, pantai ini dijadikan tempat untuk menyelenggarakan event tahunan Internasional Surfing competition yang diikuti oleh 20 surfer dari berbagai Negara. Satu lagi yang tidak kalah mencuri perhatian mata yang sayang sekali untuk dilewatkan, yaitu pemandangan saat matahari terbenam atau sunset.\n" +
                "Warna orange dengan kebiruan yang sangat cantik terbenam diantara perbukitan. Panorama ini akan memanjakan mata Anda yang akan selalu teringat akan keindahan wisata di Banyuwangi tersebut.\n",
            R.drawable.banyuwangiwisata),
        Rekomendasi("Malioboro","Daerah Istimewa Yogyakarta","Daerah Istimewa Yogyakarta","Jalan Malioboro (bahasa Jawa: Hanacaraka,ꦢꦭꦤ꧀ꦩꦭꦶꦪꦧꦫ, Dalan Maliabara) adalah nama salah satu kawasan jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari Jalan Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta.\n" +
                "Pada tanggal 20 Desember 2013, pukul 10.30 oleh Sri Sultan Hamengkubuwono X nama dua ruas jalan Malioboro dikembalikan ke nama aslinya, Jalan Pangeran Mangkubumi menjadi jalan Margo Utomo, dan Jalan Jenderal Achmad Yani menjadi jalan Margo Mulyo.[1]\n" +
                "Terdapat beberapa objek bersejarah di kawasan tiga jalan ini antara lain Tugu Yogyakarta, Stasiun Tugu, Gedung Agung, Pasar Beringharjo, Benteng Vredeburg, dan Monumen Serangan Oemoem 1 Maret.\n" +
                "Jalan Malioboro sangat terkenal dengan para pedagang kaki lima yang menjajakan kerajinan khas Jogja dan warung-warung lesehan di malam hari yang menjual makanan gudeg Jogja serta terkenal sebagai tempat berkumpulnya para seniman yang sering mengekpresikan kemampuan mereka seperti bermain musik, melukis, hapening art, pantomim, dan lain-lain di sepanjang jalan ini.\n" +
                "Saat ini, Jalan Malioboro tampak lebih lebar karena tempat parkir yang ada di pinggir jalan sudah dipindahkan ke kawasan parkir Abu Bakar Ali. Karena Kedepanya Malioboro Akan Menjadi Semi Pedestrian\n",
            R.drawable.jogjamalioboro),
        Rekomendasi("Garuda Wisnu Kencana (GWK)","Bali","Bali","Garuda wisnu kencana atau GWK merupakan salah satu taman wisata budaya yang berada di Bali Selatan. Wisata ini memang cukup populer, terlebih saat ini pembangunan patung raksasai Garuda Wisnu Kencana sudah berhasil diselesaikan.\n" +
                "Anda bisa menikmati kemegahan patung karya I Nyoman Nuarta yang juga ditemani dengan keindahan bukit-bukit kapur di sekitarnya. Dan tak hanya itu saja, di GWK terdapat teater seni yang dimana anda bisa melihat berbagai jenis kesenian dan tarian bali setiap harinya.\n",
            R.drawable.baliwisata)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ChangeToolbarTitle).showToolbar(true)
        (activity as ChangeToolbarTitle).updateTitle("Beranda")
        goToWishlistButton()
        rvPromo.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
            adapter = PromoAdapter(promoData)
            (adapter as PromoAdapter).setOnItemClickCallback(object : PromoAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Promo) {
                    showSelectedPromo(data)
                }
            })

        }

        rvRekomendasi.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
            adapter = RekomendasiAdapter(rekomendasiData)

            (adapter as RekomendasiAdapter).setOnItemClickCallback(object : RekomendasiAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Rekomendasi) {
                    showSelectedRekomendasi(data)
                }
            })
        }
    }

    private fun showSelectedPromo(vacation: Promo) {
        val args =FirstMenuFragmentDirections.actionFirstMenuFragmentToPromoDetailFragment(vacation.detailPhoto)
        findNavController().navigate(args)
    }

    private fun showSelectedRekomendasi(vacation: Rekomendasi) {
        val args =FirstMenuFragmentDirections.actionFirstMenuFragmentToDetailFragment(vacation.nameRekomendasi,vacation.provinsiRekomendasi,vacation.kotaRekomendasi,vacation.kotaRekomendasi,
            vacation.detailRekomendasi,vacation.photoRekomendasi)
        findNavController().navigate(args)
    }

    private fun goToWishlistButton() {
        btnGoToWishlist.setOnClickListener {
            findNavController().navigate(R.id.thirdMenuFragment)
        }
    }
}