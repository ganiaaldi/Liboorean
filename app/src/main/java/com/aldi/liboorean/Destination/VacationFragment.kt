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
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.VacationAdapter
import com.aldi.liboorean.Menu.SecondMenuFragment
import com.aldi.liboorean.Menu.SecondMenuFragmentArgs
import com.aldi.liboorean.Menu.SecondMenuFragmentDirections
import com.aldi.liboorean.Model.Vacation

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_second_menu.*
import kotlinx.android.synthetic.main.fragment_vacation.*


class VacationFragment : Fragment() {
    private val vacationData = arrayListOf(
        Vacation("Pantai Ulee Lheue", "Aceh", "Aceh", "Berbeda dengan pantai-pantai di Aceh lain yang berbatasan langsung dengan Samudra Hindia, Pantai Ulee Lheue ini memiliki gelombang ombak yang tenang. Sangat jarang dijumpai gelombang ombak besar di pantai ini. Hal ini dikarenakan adanya semacam tanggul dari tumpukan batu yang menjadi pemecah ombak.\n" +
                "Biasanya wisatawan berkunjung ke Pantai Ulee Lheue ini pada sore hari untuk menikmati keindahan tempat wisata sembari menikmati jagung bakar. Disepanjang pantai bisa dijumpai adanya warung-warung yang menjual jagung bakar, serta disediakan kursi-kursi plastik dapat digunakan wisatawan untuk bersantai.\n",R.drawable.acehpantaiulee),
        Vacation("Pantai Lampuk", "Aceh", "Aceh","Terdapat empat jalur masuk menuju ruas Pantai Lampuk yang dinamai berurutan dari utara ke selatan dengan nama Babah Satu, Babah Dua, Babah Tiga dan Babah Empat. alur Babah Tiga merupakan jalur menuju lokasi pantai yang sering digunakan untuk kegiatan surfing, sedangkan di jalur Babah Dua terdapat wahana edukasi konservasi penyu. Di sepanjang jalur pantai, kamu bisa dengan mudah menemukan kios dan warung makanan seafood yang menggugah selera. Pantai ini pun telah dilengkapi fasilitas wisata seperti banana boat. Jika ingin menginap, kamu bisa memilih tempat dari losmen hingga cottage yang mewah. Dijamin nggak akan rugi deh berwisata ke sini!",R.drawable.acehpantailampukk),
        Vacation("Pucoek Krueng Raba, Lhoknga","Aceh","Aceh","Hutan Lhoknga yang dulunya misterius kini telah berubah menjadi destinasi wisata yang mulai populer di Desa Lhoknga. Salah satunya yang sedang banyak diperbincangkan adalah wisata Pucoek Krueng Raba. Meski lokasinya tidak jauh dari Banda Aceh, kamu tetap perlu mengajak pemandu wisata untuk bisa menuju ke sini. Sepanjang jalan menuju Poencak Krueng kita akan banyak menyaksikan pemandangan padang sawah yang meneduhkan.  Jika ada budget lebih, kamu bisa langsung menyewa boat dengan harga 50,000 IDR per orang untuk menyusuri Sungai Raba dari hilir ke hulu.",R.drawable.acehpucoekk),
        Vacation("Danau  Siombak","Sumatera Utara","Medan","Danau buatan yang memiliki luas hingga mencapai 40 hektare ini berada diantara Sungai Deli dan Sungai Terjun.\n" +
                "Kamu tidak akan menyangka jika danau Siombak ini adalah danau buatan. Pasalnya air di sanau ini sangat jernih dengan nuansa biru kehijauan.\n" +
                "Pantulan warna nan eksotis pada danau ini disebabkan oleh ganggang dan lumut yang tumbuh di dalamnya.\n" +
                "Di lokasi wisata ini kamu juga bisa melakukan aktivitas lainnya seperti memancing atau berenang.\n" +
                "Dengan harga tiket masuk yang sangat terjangkau, kamu bisa menikmati keindahan Danau Siombak sepuasnya.\n",R.drawable.medandanauu),
        Vacation("Air Terjun Dwi Warna Sibolangit","Sumatera Utara","Medan","Berada di wilayah pegunungan dengan ketinggian sekitar 1475 mdpl, air terjun ini menyajikan pemandangan alam yang akan membuat kamu merasa takjub.\n" +
                "Bukan hanya karena keindahannya saja yang begitu elok, tetapi juga karena keunikan air terjun ini.\n" +
                "Air terjun dengan ketinggian 75 meter ini memiliki dua aliran air yang berbeda.\n" +
                "Yaitu air dengan nuansa putih yang memiliki suhu hangat dan air dengan nuansa biru yang bersuhu dingin.\n" +
                "Jika ingin tinggal lebih lama kamu bisa camping di sekitar lokasi air terjun ini.\n",R.drawable.medanairterjunn),
        Vacation("Air Terjun Bah Biak","Sumatera Utara","Pematang Siantar","Air terjun ini berada di tengah-tengah Kebun Teh Sidamanik, unit Bah Butong dan dekat dengan daerah pemukiman. Tapi yang terlebih dahulu mengunjungi perkebunan teh, banyak yang gak tahu tentang keberadaan air terjun ini. Mungkin banyak yang gak mengira ada air terjun di kebun teh ini. Selain itu, belum ada rambu-rambu yang mengarahkan ke Air Terjun Bah Biak.\n" +
                "Untuk menuju air terjun ini, gak perlu waktu lama, hanya sekitar 15 menit dari jalan utama menggunakan kendaraan seperti mobil atau sepeda motor. Namun, untuk menuju spotnya tetap harus jalan kaki. Sampai terbitnya tulisan ini, akses jalan menuju air terjun belum sepenuhnya mulus jadi hati-hati ya.\n",
            R.drawable.pematangaerbah),
        Vacation("Patung Dewi Kwan Im","Sumatera Utara","Pematang Siantar","Patung ini terletak di pusat kota Pematangsiantar, tepatnya di Vihara Avalokitesvara. Meski terletak di komplek peribadatan orang Tionghoa, penganut agama lain tetap boleh dong datang ke sini untuk melihat kemegahan patungnya.\n" +
                "Patung yang memiliki ketinggian 22,8 meter dan diklaim yang tertinggi di Asia Tenggara ini terbuat dari batuan granit dan diimpor langsung dari Cina. Untuk proses kerjanya memakan waktu sekitar tiga tahun dan telah mengeluarkan uang sebesar sembilan miliar. Karena kemegahannya yang luar biasa, patung ini dianugerahi oleh Museum Rekor Indonesia\n",
            R.drawable.pematangpatungg),
        Vacation("Namu Sira Sira","Sumatera Utara","Binjai","Namu Sira-Sira merupakan sebuah tempat pemandian alam yang berada di sebuah sungai yang bermuara pada Bendungan Namu Sira-Sira. Warga di sekitar sana menyebut Namu Sira-Sira dengan nama Pantai Pangkal.\n" +
                "Penyebutan “Pantai” oleh warga sekitar dikarenakan sungai tersebut memiliki lebar yang cukup besar dan di pinggir sungai tersebut terdapat pasir sehingga menjadikannya tampak seperti pantai.\n" +
                "Lokasi lengkapnya berada di Jalan Perkebunan,Durian Lingga, Sei Binga, Kabupaten Langkat, Sumatera Utara\n",R.drawable.binjainamu),
        Vacation("Pantai Padang","Sumatera Barat","Padang","Pantai Padang juga menjadi salah satu tempat wisata yang sangat mudah dijangkau. Enggak perlu jauh-jauh kamu hanya perlu berkendara sebentar dari pusat kota Padang. Lokasinya tidak berbeda jauh dengan Pantai Ancol di Jakarta atau Parangtritis di Jogjakarta.\n" +
                "Pantai Padang sendiri disebut orang lokal dengan Taplau. Di sini kamu bisa menikmati pemandangan pantai yang indah. Wisata pantai di Padang ini juga sudah memiliki fasilitas yang cukup lengkap\n",R.drawable.padang),
        Vacation("Jembatan Siti Nurbaya","Sumatera Barat","Padang","Jembatan Siti Nurbaya bisa kamu nikmati saat sore atau malam hari. Kamu bisa melihat pemandangan kota Padang yang cantik dari Jembatan Siti Nurbaya. Selain menikmati pemandangan kota, kamu juga bisa berwisata kuliner di sini. Suasana di sini tidak jauh berbeda dengan Puncak yang penuh dengan warung yang menjajakan jagung bakar.",R.drawable.padangsiti),
        Vacation("Jembatan Ampera","Sumatera Selatan","Palembang","Mulanya, Jembatan Ampera yang memiliki panjang 1.177 meter dan lebar 22 meter ini dinamakan Jembatan Bung Karno. Pemberian nama tersebut ditujukan sebagai bentuk penghargaan kepada Soekarno yang sudah memperjuangkan keinginan warga Palembang yang menginginkan sebuah jembatan di atas Sungai Musi. Namun, Bung Karno tidak setuju dengan pemberian nama tersebut. Makan, jembatan itu dinamakan Jembatan Ampera, sesuai fungsinya yaitu sebagai Amanat penderitaan Rakyat (slogan bangsa Indonesia tahun 1960-an).",
            R.drawable.palembangjembatanampera),
        Vacation("Danau Lembah Sari","Riau","Pekanbaru","Meski merupakan salah satu kota modern di Sumatera, namun keasrian dan kealamian kotanya masih terus dijaga. Salah satunya adalah dengan adanya danau buatan di tengah kota, yaitu Danau Lembah Sari. Suasana danau yang tenang, hijau, dan luas menjadi daya tarik utama banyaknya wisatawan yang berkunjung kemari. Apalagi saat senja. Pemandangannya sangat indah. Stres, penat dan lelah dijamin akan hilang deh!",
            R.drawable.pekanbarudanau),
        Vacation("Tebing keraton","Jawa Barat","Bandung","Tebing Keraton Bandung yang terletak di daerah Dago Bandung merupakan tempat wisata lokal yang booming dengan bantuan sosial media. Jika anda pengguna sosial media seperti instagram, path, facebook,dll maka kemungkinan akan menemukan info atau foto tempat ini. Tebing keraton atau bukit keraton merupakan satu bukit dengan tebing terjal yang menghadap langsung ke area Taman Hutan Raya Juanda Bandung. Ditambah dengan background gunung tangkuban perahu, menambah keindahan area ini.\n" +
                "Tempat wisata di Bandung ini mulai dikenal di sosial media kurang lebih bulan Juli 2014, tapi karena keindahannya dengan cepat dikenal dan dikunjungi. Tidak jarang pula orang menyebut area tebing keraton sebagai bukit instagram, karena banyaknya pengguna sosmed yang posting foto tebing keraton di instagram.\n",
            R.drawable.tebingkeraton),
        Vacation("Curug lawe","Jawa Tengah","Semarang","Curug Lawe adalah air terjun yang berada di Kawasan Gunung Ungaran di Semarang. Di Curug Lawe airnya benar-benar bersih dan tentu kondisi alam di sekitarnya sangat indah. Curug Lawe dan Benowo berada disebelah utara anak-anak Gunung Ungaran dan menjadi hulu Kali Banjir Kanal Barat atau Kali Garang di kota Semarang\n" +
                "Disebut Curug Lawe karena air yang jatuh dari tebing curam itu terlihat bagai benang-benang putih, yang dalam bahasa jawa disebut lawe. Versi lain menjelaskan dinamakan Curug Lawe karena konon jumlah air terjun yang ada, baik dari yang besar hingga yang terkecil berjumlah 25 buah yang dalam bahasa jawa Selawe.\n" +
                "Dalam satu kawasan terdapat dua air terjun yaitu curug lawe di sisi barat dan curug benowo di sisi timur yang berjarak sekitar 500m antar kedua air terjun.\n" +
                "Curug Lawe Benowo Kalisidi atau disingkat CLBK dikelola oleh Pemerintah Desa Kalisidi dan LMDH Bela Pesona sebagai mitra dari Perum Perhutani KPH Kedu Utara. Tiket masuk pengunjung Rp. 4.000,- sudah termasuk asuransi jasa raharja putera\n",
            R.drawable.curuglawe),
        Vacation("Pantai Pulau Merah Banyuwangi","Jawa Timur","Banyuwangi","Pantai pulau Merah merupakan salah satu tempat wisata yang menjadi primadona Banyuwangi. Pantai ini terletak di Desa Sumberagung, Kecamatan Pesanggaran. Pantai pulau merah menjadi berbeda karena adanya sebuah pulau yang terletak di bibir pantai.\n" +
                "Keberadaan pulau ini membuat pantai ini semakin eksotis dan menjadi asal mula nama Pulau Merah. Selain pemandangannya yang bagus, gulungan ombaknya yang lumayan besar juga menjadi daya tarik lainnya. Banyak surfer pemula atau menengah berselancar di pantai pulau Merah tersebut.\n" +
                "Karena itulah, pantai ini dijadikan tempat untuk menyelenggarakan event tahunan Internasional Surfing competition yang diikuti oleh 20 surfer dari berbagai Negara. Satu lagi yang tidak kalah mencuri perhatian mata yang sayang sekali untuk dilewatkan, yaitu pemandangan saat matahari terbenam atau sunset.\n" +
                "Warna orange dengan kebiruan yang sangat cantik terbenam diantara perbukitan. Panorama ini akan memanjakan mata Anda yang akan selalu teringat akan keindahan wisata di Banyuwangi tersebut.\n",
            R.drawable.banyuwangiwisata),
        Vacation("Malioboro","Daerah Istimewa Yogyakarta","Daerah Istimewa Yogyakarta","Jalan Malioboro (bahasa Jawa: Hanacaraka,ꦢꦭꦤ꧀ꦩꦭꦶꦪꦧꦫ, Dalan Maliabara) adalah nama salah satu kawasan jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari Jalan Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta.\n" +
                "Pada tanggal 20 Desember 2013, pukul 10.30 oleh Sri Sultan Hamengkubuwono X nama dua ruas jalan Malioboro dikembalikan ke nama aslinya, Jalan Pangeran Mangkubumi menjadi jalan Margo Utomo, dan Jalan Jenderal Achmad Yani menjadi jalan Margo Mulyo.[1]\n" +
                "Terdapat beberapa objek bersejarah di kawasan tiga jalan ini antara lain Tugu Yogyakarta, Stasiun Tugu, Gedung Agung, Pasar Beringharjo, Benteng Vredeburg, dan Monumen Serangan Oemoem 1 Maret.\n" +
                "Jalan Malioboro sangat terkenal dengan para pedagang kaki lima yang menjajakan kerajinan khas Jogja dan warung-warung lesehan di malam hari yang menjual makanan gudeg Jogja serta terkenal sebagai tempat berkumpulnya para seniman yang sering mengekpresikan kemampuan mereka seperti bermain musik, melukis, hapening art, pantomim, dan lain-lain di sepanjang jalan ini.\n" +
                "Saat ini, Jalan Malioboro tampak lebih lebar karena tempat parkir yang ada di pinggir jalan sudah dipindahkan ke kawasan parkir Abu Bakar Ali. Karena Kedepanya Malioboro Akan Menjadi Semi Pedestrian\n",
            R.drawable.jogjamalioboro),
        Vacation("Garuda Wisnu Kencana (GWK)","Bali","Bali","Garuda wisnu kencana atau GWK merupakan salah satu taman wisata budaya yang berada di Bali Selatan. Wisata ini memang cukup populer, terlebih saat ini pembangunan patung raksasai Garuda Wisnu Kencana sudah berhasil diselesaikan.\n" +
                "Anda bisa menikmati kemegahan patung karya I Nyoman Nuarta yang juga ditemani dengan keindahan bukit-bukit kapur di sekitarnya. Dan tak hanya itu saja, di GWK terdapat teater seni yang dimana anda bisa melihat berbagai jenis kesenian dan tarian bali setiap harinya.\n",
            R.drawable.baliwisata),
        Vacation("Pantai Kuta","Bali","Bali","Wisata pantai ini rasanya menjadi salah satu ikon wisata Pulau Dewata. Pesona dan keeksotisan di Pantai Kuta benar-benar tak bisa diragukan lagi. Sehingga tak heran jika setiap harinya pantai Kuta dipenuhi dengan wisatawan lokal maupun asing.\n" +
                "Karena itu lah jika anda ingin mengunjungi pantai Kuta, maka anda bisa mencoba menggunakan sepeda motor atau berjalan kaki dari spot-spot tertentu karena memang kawasan ini cukup ramai. Ada banyak aktivitas menarik yang bisa anda lakukan selama berada di Pantai Kuta, mulai dari berjemur, bermain sepak bola pantai atau voli, berselancar, berjemur, dan masih banyak lainnya. pantai Kuta terbuka untuk umum dan pengunjung sama sekali tidak dikenakan tiket masuk.\n",
            R.drawable.balikuta),
        Vacation("Pantai Sanur","Bali","Bali","Pantai Sanur ini lokasinya berada di Denpasar bagian timur. Salah satu daya tarik istimewa yang ada di Pantai Sanur ini adalah momen matahari terbitnya yang mempesona. Karena pantai ini buka 24 jam, anda bisa datang kapanpun yang anda inginkan. Sekedar duduk santai sambil menikmati suasana pantai Sanur juga menjadi hal yang menyenangkan yang dapat dilakukan.\n" +
                "Untuk bisa masuk ke Pantai Sanur, pengunjung sama sekali tidak dikenakan biaya masuk. Pengunjung hanya perlu membayar biaya parkir untuk motor sebesar Rp 5.000 dan untuk mobil sebesar Rp 10.000.\n",R.drawable.balisanur),
        Vacation("Pantai Anyer","Banten","Banten","Pantai Anyer adalah salah satu tempat wisata di Banten yang paling ramai dan populer, terutama bagi penduduk Jakarta dan sekitarnya karena dekat dan terjangkau. Berlokasi di Kabupatan Serang, Banten, Pantai Anyer adalah pantai yang memiliki pasir putih yang indah dan menarik. Dinamakan Pantai Anyer karena pantai ini berada di sepanjang Kecamatan Anyer, Banten. Aktifitas yang dapat anda lakukan di Pantai Anyer adalah berenang, bermain pasir, bermain olahraga air, berselancar, menyelam, menikmati pemandangan pantai, hingga menyantap hidangan laut yang nikmat di pinggir pantai. Apabila ingin menginap, tidak perlu kuatir karena banyak sekali hotel di sekitar Pantai Anyer.",
            R.drawable.bantenwisata),
        Vacation("Museum Negeri Sejarah Budaya Khas","Kalimantan Barat","Pontianak","Dirintis sekitar tahun 1974 oleh pemerintah setempat melalui Kantor Wilayah Depdikbud Provinsi Kalimantan Barat, museum ini didirikan sebagai bagian untuk menyimpan berbagai macam benda-benda bersejarah yang ada maupun ditemukan di wilayah Kalimantan Barat.\n" +
                "Koleksinya terdiri dari benda-benda geologika berupa peta hingga bebatuan, lalu koleksi biologika, historika, numimastika hingga arkeologika yang begitu tinggi nilainya dan tersimpan dengan rapi nan cantik di tempat wisata di Pontianak yang satu ini.\n" +
                "Selain kegiatan pameran, museum juga kerap mengadakan berbagai macam kegiatan yang bisa diikuti oleh pengunjung yang datang. Mulai dari bimbingan, konservasi hingga lomba-lomba untuk menarik minat pengunjung tentang benda-benda bersejarah.\n",
            R.drawable.pontianakmuseum),
        Vacation("Air Terjun Jantur Doyan","Kalimantan Tengah","Barito","Tak jauh dari kota Muara Teweh terdapat air terjun Jantur Doyan yang merupakan tempat wisata paling sering didatangi oleh para wisatawan jika berkunjung ke Barito Utara. Kamu tidak akan bingung menemukan tempat ini, karena sebelum memasuki kawasan air terjun kamu akan menemukan gerbang masuk yang cukup besar. Jarak air terjun dengan gerbang masuk tidak terlalu jauh, hanya sekitar 500 meter. Sepanjang perjalanan menuju air terjun terdapat banyak pepohan rindang yang akan menyambutmu sehingga suasana akan terasa sejuk dan menyenangkan.",
            R.drawable.baritoair),
        Vacation("Pantai Gedambaan (Sarang Tiung)","Kalimantan Selatan","Kotabaru",
            "Pantai Gedambaan dulunya dikenal dengan nama Pantai Sarang Tiung karena terletak di Desa Sarang Tiung. Bila ingin bangun subuh demi mencari nikmatnya sensasi menyaksikan matahari terbit yang indah, Pantai Gedambaan adalah pilihan yang tepat karena letaknya yang di timur. Terlalu berlama-lama hingga gelap di pantai ini pun bukan masalah karena sudah terdapat penginapan di sekitaran pantai.",
            R.drawable.kotabaruwisata),
        Vacation("Pulau Beras Basah Samarinda","Kalimantan Timur","Samarinda","Tempat wisata rekomendasi lainnya adalah Pulau Beras Basah. Seperti Pulau Kumala, pulau ini tidak terletak tepat di Kota Samarinda namun menjanjikan keindahan alam yang luar biasa. Untuk mencapai Pulau Beras Basah, waktu yang diperlukan cukup lama yaitu selama 3 jam dengan kendaraan.\n" +
                "Pulau ini berada di Selat Makassar, Bontang, Kaltim. Keindahan pasir putih dan kejernihan air yang berkilau kebiruan akan membuat kamu lupa lelahnya perjalanan menuju ke pulau ini.\n",
            R.drawable.samarindawisata),
        Vacation("Pantai Tanjung Batu","Kalimantan Utara","Tarakan","Destinasi wisata pantai selanjutnya di Tarakan adalah Pantai Tanjung Batu. Sesuai dengan namanya, di obyek wisata Tarakan satu ini Toppers akan melihat indahnya hamparan pasir pantai yang berbingkai bebatuan karang serta sejuknya pepohonan yang ada di pingggiran pantai. Sama seperti pantai di Tarakan lainnya, Pantai Tanjung Batu juga memiliki ombak yang tenang sehingga menambah teduh suasana di tempat wisata ini.",
            R.drawable.tarakanpantai),
        Vacation("Pantai Losari","Sulawesi Selatan","Makassar","Mampir ke pantai yang berada di Jalan Penghibur ini sudah menjadi kegiatan wajib bagi setiap pengunjung yang datang ke Makassar. Tempat wisata andalan ini memiliki keunikan tersendiri. Jika biasanya pantai dikenal dengan pasirnya, Pantai Losari tidak memiliki pasir. Jika Anda datang, Anda akan menemui beton di tepiannya. Tidak ada pasir bukan berarti pantai ini tak layak dikunjungi, ada banyak hal lain yang menarik dari tempat wisata ini.\n" +
                "Di sini, Anda bisa melakukan banyak hal yang menyenangkan seperti memancing, naik sepeda air atau banana boat, berlayar dengan perahu dan masih banyak lagi. Apa hal menarik lainnya dari sebuah tempat wisata? Tentu saja kulinernya. Ada banyak sajian kuliner khas Makassar yang bisa Anda nikmati di sini, mulai dari pisang epe, coto, sop konro sampai dengan es pallu butung.\n" +
                "Tempat wisata di Makassar ini ramai dikunjungi setiap hari terutama saat akhir pekan. Pada pagi hari, banyak yang menjadikannya sebagai lintasan jogging, sedangkan pada sore hari, banyak yang menunggu momen matahari terbenam sambil berwisata kuliner di sini.\n",
            R.drawable.makasarpantai),
        Vacation("Puncak Khayangan di Tomia","Sulawesi Tenggara","Wakatobi","Obyek wisata di Wakatobi yang bisa ditemukan di Pulau Tomia lainnya adalah Puncak Kahyangan. Puncak Kahyangan ini sendiri merupakan sebuah bukit rumput yang cukup luas dimana Toppers bisa menyaksikan eksotisme panorama lansekap Pulau Tomia dari ketinggian.\n" +
                "Destinasi tempat wisata Wakatobi ini juga terkenal akan keindahan panorama matahari terbenam yang sangat cantik. Selain itu juga bisa bermalam dengan berkemah di perbukitan ini untuk bisa melihat indanya hamparan bintang di langit malam Wakatobi yang sangat cantik.\n",
            R.drawable.wakatobipuncak),
        Vacation("Makatete Hills","Sulawesi Utara","Minahasa","Sulawesi Utara punya objek wisata yang sedang hits saat ini. Makatete Hills namanya. Kawasan wisata puncak bukit yang berada di Desa Warembungan, Kecamatan Pineleng, Kabupaten Minahasa, ini punya sejarah tersendiri. Nama Makatete bisa diartikan sebagai jembatan, karena zaman dahulu kalau mau datang ke tempat tersebut harus melewati jembatan yang dibuat sendiri. Di atas puncak ini juga terdapat monumen salib besar yang kelihatan jelas dari Kota Manado.\n" +
                "\n" +
                "Panorama alam di atas puncak ini juga sangat indah. Kita bisa menyaksikan pemandangan kota Manado, hamparan lautan luas, Pulau Manado Tua, Pulau Bunaken, Pulau Siladen serta pemandangan gunung Klabat, gunung tertinggi di Sulawesi Utara.\n" +
                "\n" +
                "Selain itu terdapat wahana yang memacu adrenalin, yakni sepeda gantung, ayunan raksasa, sky tree, dan juga flying fox. Di atas puncak dengan ketinggian 200 meter dari atas permukaan laut ini juga terdapat restauran dengan menu murah meriah dan harga yang cukup terjangkau.\n",
            R.drawable.minahasawisata),
        Vacation("Desa Arborek","Papua","Raja Ampat","Jika kamu ingin bertemu dengan warga lokal, sekaligus menikmati panorama yang indah, Pulau Arborek adalah yang harus kamu kunjungi. Hampir semua warganya memiliki keramahan dan senyuman yang lebar, siap menyambut dengan tangan terbuka siapa pun yang datang ke kampung mereka.",
            R.drawable.rajaampatdesa),
        Vacation("Gili Trawangan","Nusa Tenggara Barat","Nusa Tenggara Barat","Gili Trawangan adalah nama salah satu Tempat Wisata pulau yang ada di Lombok, Nusa Tenggara Barat. Pulau ini masuk dalam salah satu pulau di Desa Gili Indah yang memiliki keindahan bawah alam laut super indah. Traveling ke Gili Trawangan, Anda tidak hanya bisa melihat keindahan terumbu karang dan ikannya yang berwarna-warni, tetapi juga fenomena alamnya. Benar, Gili Trawangan memiliki tempat untuk melihat sunset paling cantik, yaitu Pantai Barat Gili Trawangan. Pantai ini selalu ramai dikunjungi wisatawan yang ingin melihat sang surya kembali ke peraduan. Dengan berlatarkan Gunung Agung, langit yang awalnya berwarna biru bersih, perlahan berubah warna menjadi kuning kemerahan. Tidak perlu diragukan lagi, Gili Trawangan di Lombok memang memiliki alam bawah laut yang sangat indah. ",
            R.drawable.ntbwisata),
        Vacation("Pulau Komodo","Nusa Tenggara Timur","Nusa Tenggara Timur","Pulau Komodo di Nusa Tenggara Timur ini adalah merupakan salah satu dari 7  wirisan dunia yang berada di Indonesia berupa sebuah pulau yang memiliki keindahan alam menakjubkan dan merupakan habitat asli dari hewan purba Komodo.\n" +
                "Di Taman Nasional Komodo ini anda tidak hanya dapat melihat langsung kehidupan hewan purba di habitat aslinya, melainkan anda juga dapat menikmati pesona alam yang mengaggumkan yang berada di pulau komodo Nusa Tenggara Timur ini.\n",
            R.drawable.nttpulaukomodo)

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

           (adapter as VacationAdapter).setOnItemClickCallback(object : VacationAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Vacation) {
                    showSelectedVacation(data)
                }
            })
        }
    }

    private fun showSelectedVacation(vacation: Vacation) {
        val args = SecondMenuFragmentDirections.actionSecondMenuFragmentToDetailFragment(vacation.nameVacation,vacation.provinsiVacation,vacation.kotaVacation,vacation.kotaVacation,
            vacation.detailVacation,vacation.photoVacation)
        findNavController().navigate(args)
    }
}
