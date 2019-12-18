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
import com.aldi.liboorean.Menu.SecondMenuFragment
import com.aldi.liboorean.Menu.SecondMenuFragmentArgs
import com.aldi.liboorean.Model.Vacation

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_second_menu.*
import kotlinx.android.synthetic.main.fragment_vacation.*


class VacationFragment : Fragment() {
    private val vacationDataAceh = arrayListOf(
        Vacation("Pantai Ulee Lheue", "Aceh", "Aceh", "Berbeda dengan pantai-pantai di Aceh lain yang berbatasan langsung dengan Samudra Hindia, Pantai Ulee Lheue ini memiliki gelombang ombak yang tenang. Sangat jarang dijumpai gelombang ombak besar di pantai ini. Hal ini dikarenakan adanya semacam tanggul dari tumpukan batu yang menjadi pemecah ombak.\n" +
                "Biasanya wisatawan berkunjung ke Pantai Ulee Lheue ini pada sore hari untuk menikmati keindahan tempat wisata sembari menikmati jagung bakar. Disepanjang pantai bisa dijumpai adanya warung-warung yang menjual jagung bakar, serta disediakan kursi-kursi plastik dapat digunakan wisatawan untuk bersantai.\n",R.drawable.acehpantaiulee),
        Vacation("Pantai Lampuk", "Aceh", "Aceh","Terdapat empat jalur masuk menuju ruas Pantai Lampuk yang dinamai berurutan dari utara ke selatan dengan nama Babah Satu, Babah Dua, Babah Tiga dan Babah Empat. alur Babah Tiga merupakan jalur menuju lokasi pantai yang sering digunakan untuk kegiatan surfing, sedangkan di jalur Babah Dua terdapat wahana edukasi konservasi penyu. Di sepanjang jalur pantai, kamu bisa dengan mudah menemukan kios dan warung makanan seafood yang menggugah selera. Pantai ini pun telah dilengkapi fasilitas wisata seperti banana boat. Jika ingin menginap, kamu bisa memilih tempat dari losmen hingga cottage yang mewah. Dijamin nggak akan rugi deh berwisata ke sini!",R.drawable.acehpantailampukk),
        Vacation("Pucoek Krueng Raba, Lhoknga","Aceh","Aceh","Hutan Lhoknga yang dulunya misterius kini telah berubah menjadi destinasi wisata yang mulai populer di Desa Lhoknga. Salah satunya yang sedang banyak diperbincangkan adalah wisata Pucoek Krueng Raba. Meski lokasinya tidak jauh dari Banda Aceh, kamu tetap perlu mengajak pemandu wisata untuk bisa menuju ke sini. Sepanjang jalan menuju Poencak Krueng kita akan banyak menyaksikan pemandangan padang sawah yang meneduhkan.  Jika ada budget lebih, kamu bisa langsung menyewa boat dengan harga 50,000 IDR per orang untuk menyusuri Sungai Raba dari hilir ke hulu.",R.drawable.acehpucoekk)
    )
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
