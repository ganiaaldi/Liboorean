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
            R.drawable.acehhermeshotel),
        Hotel("Cambridge Hotel Medan","Sumatera Utara","Medan","Jl. S. Parman No.217, Petisah Tengah, Medan Petisah, Kota Medan, Sumatera Utara 20151, Indonesia",
            " Terletak di jantung kawasan bisnis Medan, Hotel ini menawarkan akomodasi berbintang untuk perjalanan bisnis atau wisata Anda di Medan. Hotel ini terletak di sebelah pusat perbelanjaan yang menawarkan banyak toko, taman bermainan anak, dan berbagai fasilitas hiburan. Anda dapat menemukan Stasiun Kereta Medan yang terletak 3 km saja dari sini. Sementara untuk Anda yang datang dari luar kota menggunakan pesawat terbang, hotel ini dapat dicapai dengan 1 jam berkendara dengan mobil. Dari sini, Cambridge City Square terletak 0.7 km, Plaza Medan Fair terletak 1.7 km, dan Istana Maimun terletak 1.9 km saja. Cambridge Hotel Medan menawarkan kamar-kamar ber-AC lengkap dengan TV kabel layar datar untuk kenyamanan menginap Anda. Setiap kamarnya dilengkapi dengan fasilitas membuat kopi/teh dan air mineral kemasan gratis. Tersedia juga jubah mandi, sandal, dan perlengkapan mandi gratis di kamar mandi showernya. Anda juga dapat mengakses WiFi gratis dari dalam kamar Anda. Fasilitas dan pelayanan yang ditawarkan mencakup tempat parkir gratis untuk kendaraan pribadi dan WiFi gratis di semua areanya. Hotel ini juga menawarkan kolam renang luar ruangan, layanan spa dan pijat, sauna, hot tub, dan pusat kebugaran sebagai fasilitas hiburan. Anda tidak akan kehabisan kegiatan untuk dilakukan selama menginap di Cambridge Hotel Medan. Terdapat layanan binatu, layanan antar-jemput bandara, dan layanan penyimpanan bagasi. Hotel ini juga menyediakan fasilitas rapat/perjamuan. The Café memiliki dapur terbuka, dan menyajikan pilihan masakan Asia dan Barat. The Rendezvous Lobby Lounge menawarkan makanan ringan lokal dan internasional. The Edge Restaurant terletak di atap, dan merupakan pilihan tempat bersantap lainnya yang dapat Anda nikmati dengan pemandangan kota yang tak terhalang.",
            R.drawable.medancambridgehotel),
        Hotel("Karibia Hotel Boutique Medan","Sumatera Utara","Medan","Jl. Timor Blok J No.I-IV, Gg. Buntu, Kec. Medan Tim., Kota Medan, Sumatera Utara",
            "Karibia Boutique Hotel Medan terletak strategis di pusat kota, tepat di sebelah mal perbelanjaan terbesar, Centre Point Mall, serta stasiun kereta api. Hotel ini dapat dicapai dengan 5 menit berkendara dari Pusat Pasar Medan Mall dan 10 menit berkendara dari Sun Plaza Shopping Mall. Dari sini, Pajak Ikan Medan dan Mall Medan berjarak 0.5 km sedangkan Istana Maimun dan Cambridge City Square berjarak 1.7 km. Selain itu, Plaza Medan Fair juga dapat dicapai dengan 30 menit berkendara. Kamar-kamar di Karibia Boutique Hotel Medan dilengkapi dengan AC dan TV kabel layar datar. Setiap kamar dilengkapi dengan minibar, fasilitas membuat kopi/teh, dan air mineral kemasan gratis. Semua kamarnya menampilkan dekorasi elegan, serta memiliki jendela besar yang menyuguhkan pencahayaan alami. Tersedia juga brankas dan area untuk duduk bersantai. Kamar mandi pribadinya menyediakan shower dan perlengkapan mandi gratis. Karibia Boutique Hotel Medan menawarkan fasilitas dan pelayanan modern yang menjamin kenyamanan menginap Anda. Selain itu, hotel ini juga menyediakan meja depan 24-jam yang akan membantu Anda dengan segala kebutuhan Anda selama menginap. Tersedia layanan binatu, penyewaan mobil, layanan penyimpanan bagasi, dan layanan concierge. Anda juga dapat memanfaatkan fasiltias rapat/perjamuan dan pusat bisnis selama menginap. ",
            R.drawable.medankaribiahotel),
        Hotel("Horison  Hotel Pematangsiantar ","Sumatera Utara","Pematang Siantar","Gedung Siantar City Square, Jalan Raya Medan No. 88, Martoba, Kecamatan Siantar Utara, Naga Pita., Siantar Martoba, Kota Pematang Siantar, Sumatera Utara 21138, Indonesia","Horison Hotel Pematang Siantar berjarak hanya berselang jalan kaki beberapa menit ke Pusat Perbelanjaan Siantar City Square di Pematang Siantar. Lokasinya yang strategis dengan akomodasi indah dan modern menjadikan hotel ini pilihan favorit para wisatawan dan pebisnis. Hotel ini dapat dicapai dengan 10 menit berkendara dari pusat Kota Pematang Siantar dan 15 menit berkendara dari Kebun Binatang Pematang Siantar. Anda juga dapat mengunjungi Danau Toba yang terkenal hanya dengan 45 menit berkendara. Sementara untuk Anda yang datang dari luar kota menggunakan pesawat terbang, Horison Hotel Pematang Siantar dapat dicapai dengan 3 jam berkendara dari Bandara Internasional Kuala Namu. Berbagai fasilitas dan pelayanan modern ditawarkan Horison Hotel Pematang Siantar untuk memaksimalkan pengalaman menginap Anda. Tersedia akses WiFi gratis di seluruh area hotel dan tempat parkir gratis untuk kendaraan pribadi Anda. Hotel ini juga menyediakan sebuah kolam renang luar ruangan sebagai fasilitas hiburan. Fasilitas lain seperti penyewaan mobil, layanan antar-jemput, layanan binatu, dan layanan laundry juga tersedia dengan biaya tambahan. Meja depan 24-jamnya dapat membantu Anda dengan layanan laundry, layanan penyimpanan bagasi, dan layanan pramutamu. ",
            R.drawable.pematanghorisonhotel),
        Hotel("Siantar Hotel Pematangsiantar","Sumatera Utara","Pematang Siantar","Jl. WR Supratman No. 3, Dwikora, Siantar Barat, Proklamasi, Siantar Bar., Kota Pematang Siantar, Sumatera Utara 21144, Indonesia","Siantar Hotel Pematangsiantar bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Siantar Barat. Fasilitas yang tersedia di Siantar Hotel Pematangsiantar akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Siantar Hotel Pematangsiantar ketika Anda melakukan kunjungan kerja atau berwisata ke Siantar Barat dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.",
            R.drawable.pematangsiantar),
        Hotel("Graha Kardopa Hotel & Convention Hall","Sumatera Utara","Binjai","Jl. Sultan Hasanuddin No. 7E","Graha Kardopa Hotel & Convention Hall letaknya sangat sempurna baik untuk keperluan bisnis maupun berwisata di Binjai. Menampilkan daftar fasilitas yang lengkap, tamu akan merasakan bahwa mereka menginap di properti yang nyaman. Staf yang siap melayani akan menyambut dan memandu Anda di Graha Kardopa Hotel & Convention Hall. Televisi layar datar, AC, penghangat ruangan, meja tulis, bar mini dapat ditemukan di beberapa kamar. Nikmati fasilitas rekreasi di hotel, termasuk karaoke, sebelum masuk ke kamar untuk beristirahat dengan nyaman. Kemudahan dan kenyamanan membuat Graha Kardopa Hotel & Convention Hall pilihan yang sempurna sebagai tempat menginap Anda di Binjai.\n" +
                "Graha Kardopa Hotel & Convention Hall bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Binjai Timur. Fasilitas yang tersedia di Graha Kardopa Hotel & Convention Hall akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Graha Kardopa Hotel & Convention Hall ketika Anda melakukan kunjungan kerja atau berwisata ke Binjai Timur dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",R.drawable.binjaigrahakardopa),
        Hotel("The Axana Hotel Padang","Sumatera Barat","Padang","Padang","The Axana Hotel Padang merupakan salah satu pilihan hotel yang wajib Anda kunjungi. Dengan kualitas hotel bintang 4, The Axana Hotel Padang mengupayakan kenyamanan maksimal para tamunya. Hotel ini berjarak 20,6 km dari Bandara Minangkabau. Hotel yang dibangun pada tahun 2012 ini menawarkan askes mudah ke beberapa atraksi wisata. Museum Adityawarman hanya berjarak 0,38 km, sedangkan Pasar Padang dapat dicapai dengan jarak 0,57 km. Hotel yang berada di pusat kota ini dapat ditempuh dengan 0,63 km dari Plaza Andalas dan 0,90 km dari Pantai Padang.  Layanan yang ditawarkan mencakup layanan kamar 24 jam, layanan penitipan bagasi, layanan penukaran mata uang, layanan penjaga pintu dan layanan binatu. Layanan antar-jemput bandara tersedia dengan biaya tambahan. The Axana Hotel Padang juga menyediakan layanan persewaan mobil dan membantu Anda mengatur perjalanan wisata. Tersedia pula layanan penitipan anak serta layanan pijat, spa dan sauna dengan biaya tambahan. The Axana Hotel Padang menawarkan fasilitas seperti area parkir, AC, elevator, area merokok, restoran, kedai kopi dan klub malam. ",R.drawable.padangaxana),
        Hotel("Grand Inna Daira Palembang","Sumatera Selatan","Palembang","Jl. Jenderal Sudirman No.153, 20 Ilir D. IV, Ilir Tim. I, Kota Palembang, Sumatera Selatan 30114, Indonesia",
            "Menawarkan akomodasi bintang empat, Hotel Grand Inna Daira Palembang terletak di kawasan bisnis utama Palembang. Hotel ini berjarak 20 menit berkendara dari Bandara Internasional Sultan Mahmud Baddarudin II. Dari sini, situs bersejarah di Palembang terletak dekat dan dapat dicapai dengan mudah. Palembang Indah Mall juga berjarak kurang dari 2 km. Selain itu, Bumi Sriwijaya Stadium, Palembang Square, dan Jempatan Ampera berjarak kurang dari 2 km dari Hotel Grand Inna Daira Palembang. Jangan lewatkan juga untuk mengunjungi Athlete Village Jakabaring Palembang dan Stadion Gelora Sriwijaya yang berjarak 6.4 km. Untuk pilihan tempat bersantap, Hotel Grand Inna Daira Palembang menawarkan hidangan mewah di Suranadi Restaurant. Selain itu, Anda juga dapat menikmati koktail di Narmada Lobby Bar dan Mayura Pool Bar. Anda juga dapat mengunjungi Pizza Corner & Snacks untuk makanan ringan. Sedangkan pilihan bersantap lainnya mencakup Rumah Makan Sari Nande Restaurant yang terletak 0.8 km dari hotel. ",
            R.drawable.palembanggrand),
        Hotel("Aryaduta Pekanbaru","Riau","Pekanbaru","Jl. Diponegoro No.34, Simpang Empat, Pekanbaru Kota, Kota Pekanbaru, Riau 28113, Indonesia","Berstatus sebagai penginapan bintang 4 terbaik, Hotel Aryaduta Pekanbaru adalah akomodasi bergengsi yang menawarkan pengalaman menginap dengan biaya ramah di kantong. Saat menghabiskan waktu di akomodasi ini, Anda tak perlu menyiapkan dana perjalanan yang begitu besar. Pasalnya, harga Hotel Aryaduta Pekanbaru yang ditawarkan pihak pengelola sangatlah bersaing dan dapat dijangkau oleh semua kalangan. ",
            R.drawable.pekanbaruhotel),
        Hotel("Grand Tjokro Bandung","Jawa Barat","Bandung","Jalan Cihampelas No. 211-217, Jawa Barat 40131, Indonesia","Grand Tjokro Bandung Hotel merupakan akomodasi bintang 4 yang terletak di Jalan Cihampelas 211-217, Bandung. Dengan menawarkan akomodasi modern, dan terletak strategis di Bandung, akomodasi ini merupakan pilihan tepat bagi Anda yang sedang cari hotel di Jawa Barat. Bandar Udara Internasional Sastranegara dan Stasiun Kereta Bandung berjarak 3 km, serta Terminal Bus Cicaheum berjarak 6 km dari Grand Tjokro Bandung Hotel. Fasilitas publik seperti ATM Center, Apotek, Rumah Sakit, dan Minimarket dapat Anda temui di sekitar akomodasi. Akomodasi ini menawarkan banyak sekali akses mudah menuju berbagai tempat penting atau tempat menarik yang ada di kota ini. Hotel ini berjarak 10 menit berkendara dari Cihampelas WalkShoppingMall,Anda juga bisa mengunjungi FactoryOutlet rumah mode yang trendy dan terkenal dengan berkendara 15 menit dari Grand Tjokro Bandung Hotel. Selain itu, tempat wisata populer seperti Tangkuban Perahu dan Lembang berjarak 20 menit berkendara dari akomodasi ini. Kamar-kamar di Grand Tjokro Bandung Hotel dibagi menjadi beberapa kategori kamar, mulai dari kamar keluarga, kamar Superior Twin, kamar Junior Suite, sampai kamar Premier Double atau Twin. Semua kamar diakomodasi ini sangat bersih dan nyaman, karena layanan kebersihan kamar selalu diberikan pada jam tertentu selama Anda menginap. ",R.drawable.bandunghotel),
        Hotel("Patra Semarang Hotel & Convention","Jawa Tengah","Semarang","Jl. Sisingamangaraja Candi Baru",
            "Terletak strategis dikota semarang, tempat ini hanya berjarak 10 menit dari Simpang Lima, Patra Semarang Convention Hotel berjarak 15 menit dari Sam Po Kong Buddhist Temple. Achmad Yani Airport berjarak 20 menit berkendara. Patra Semarang Convention Hotel memiliki spa, kolam renang outdoor dan bak mandi air panas. Fasilitas voli dan jogging track yang ditawarkan, parkir gratis, restoran, bar, meja tur, pusat bisnis dan fasilitas meeting. Setiap kamar dilengkapi dengan fasilitas AC, TV, telepon, satelit dan pembuat teh / kopi, Wi-Fi gratis dan pilihan room dengan balcony.\n" +
                    "Patra Semarang Hotel & Convention bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Semarang Selatan. Fasilitas yang tersedia di Patra Semarang Hotel & Convention akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Patra Semarang Hotel & Convention ketika Anda melakukan kunjungan kerja atau berwisata ke Semarang Selatan dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",
            R.drawable.semarangpatra),
        Hotel("Dialoog Banyuwangi","Jawa Timur","Banyuwangi","Jl. Yos Sudarso, Kaliklatak, Klatak, Kalipuro, Kabupaten Banyuwangi, Jawa Timur 68421, Indonesia",
            "Terletak di pantai di Banyuwangi, Dialoog Banyuwangi memiliki kolam renang outdoor dan Wi-Fi gratis. Menawarkan meja depan 24 jam, properti ini juga menyediakan restoran untuk tamu. Akomodasi ini menyediakan transfer bandara, sementara layanan penyewaan sepeda juga tersedia. Di hotel, kamar memiliki meja. Dialoog Banyuwangi memiliki beberapa kamar dengan pemandangan laut, dan semua kamar termasuk ketel. Di akomodasi, setiap kamar memiliki TV layar datar dengan saluran kabel. Sarapan prasmanan disajikan setiap hari di akomodasi. Dialoog Banyuwangi menawarkan taman bermain anak-anak. Daerah ini populer untuk bersepeda, dan penyewaan mobil tersedia di hotel. Watu Dodol berjarak 12 km dari Dialoog Banyuwangi, sedangkan Taman Nasional Baluran berjarak 41 km dari properti. Bandara Banyuwangi berjarak 25 km.\n" +
                    "Dialoog Banyuwangi bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Kalipuro. Fasilitas yang tersedia di Dialoog Banyuwangi akan membuat Anda semakin betah menginap. \n",
            R.drawable.banyuwangihotel),
        Hotel("Grand Inna Malioboro","Daerah Istimewa Yogyakarta","Daerah Istimewa Yogyakarta","Jl. Malioboro No. 60Suryatmajan Danurejan",
            "Grand Inna Malioboro merupakan akomodasi bintang 4 yang berada di Jalan Malioboro, nomor 60, Yogyakarta. Akomodasi ini memiliki desain arsitektur kolonial Belanda yang dipadukan dengan ornamen budaya Jawa, sehingga cocok untuk Anda yang sedang cari hotel di Jogja dengan fasilitas dan pelayanan yang baik. Lokasinya juga sangat strategis karena dari stasiun Tugu Jogjakarta hanya berjarak 500 m, serta dari Bandar Udara Internasional Adi Sucipto Jogjakarta hanya berjarak 9 km saja. Anda juga Bisa dengan mudah menemukan fasilitas publik seperti ATM minimarket supermarket serta restoran di sekitar Hotel Grand Inna Malioboro. Lokasinya yang berada di pusat kota Jogjakarta juga membuat beragam jenis wisata bisa dengan mudah anda kunjungi melalui hotel. Mengunjungi lokasi wisata terkenal seperti Jalan Malioboro dan Tugu Jogjakarta bisa dilakukan hanya dengan berjalan kaki 5 menit saja. Pilihan wisata kuliner seperti House of Raminten dan wisata kuliner di sepanjang Jalan Malioboro juga bisa menjadi pilihan wisata menarik di sekitar Hotel. Selain itu wisata budaya di Kraton Jogja, Taman Sari, dan benteng vandebrug bisa anda lakukan hanya dengan berjalan kaki 5 menit dari hotel. ",
            R.drawable.yogyakartahotel),
        Hotel("INAYA Putri Bali","Bali","Bali","Kawasan wisata Nusa Dua Lot S-3 Nusa Dua","Hotel ini bisa ditempuh dalam waktu 25 menit dari Bandara Internasional Ngurah Rai melewati jalur tol Mandara yang terkenal. Dari kawasan Kuta, hotel ini dapat dicapai dengan berkendara selama sekitar 30 menit. Sementara itu, Pantai Nusa Dua yang terkenal dengan pasir putihnya berada tepat di belakang area hotel dan bisa kamu tempuh dengan berjalan kaki selama 2 menit saja. Fasilitas Kamar Hotel INAYA Putri Bali akan mengajakmu menikmati liburan yang tenang dan nyaman dalam suasana tropis yang eksotis. Ada 455 kamar yang terbagi ke dalam 7 tipe, termasuk vila dengan satu atau dua kamar tidur. ",
            R.drawable.baliinaya),
        Hotel("Sheraton Bali Kuta Resort","Bali","Bali","Jl. Pantai Kuta, Kuta Sel., Kabupaten Badung, Bali 80361, Indonesia",
            "Dengan menginap di Sheraton Bali Kuta Resort di kota Kuta (Pusat Kota Kuta), Anda hanya akan berjarak beberapa langkah dari Beachwalk Shopping Center dan Pantai Kuta. Hotel bintang 5 berjarak 0,6 mi (1 km) dari Kendra Gallery dan 2,8 mi (4,5 km) dari Kuta Square. Manjakan diri Anda dengan mengunjungi spa, yang menawarkan pijat dan perawatan wajah. Anda pasti akan menyukai fasilitas rekreasi yang ada, seperti 2 kolam renang outdoor, klub kesehatan, dan sauna. Fasilitas tambahan di Hotel ini mencakup akses Internet nirkabel gratis, layanan concierge, dan Aula pertemuan.",
            R.drawable.balisheraton),
        Hotel("The Apurva Kempinski Bali","Bali","Bali","Raya Nusa Dua Selatan, Sawangan - 80361, 80361 Nusa Dua, Indonesia",
            "The Apurva Kempinski Bali merupakan hotel bintang lima dengan pemandangan pantai yang sangat indah. Hotel di Nusa Dua ini menyajikan kemewahan tepi pantai sebagai akomodasi berkelas untukmu. The Apurva Kempinski Bali berada di Jalan Raya Nusa Dua Selatan, Sawangan, Nusa Dua, Bali, Indonesia, 80361. Hotel ini dikelilingi pantai indah yang bisa kamu capai dalam beberapa menit saja. Selain itu, ada banyak tempat wisata dan relaksasi lain di sekitarnya yang bisa kamu kunjungi dengan jalan kaki.",
            R.drawable.baliapurva),
        Hotel("Allium Tangerang Hotel","Banten","Banten","Jalan Benteng Betawi No. 88","Wisatawan yang berkunjung ke Tangerang dapat menjadikan Allium Tangerang Hotel sebagai lokasi bermalam. Selain menyediakan akses Wi-Fi gratis di seluruh area hotel, akomodasi ini menawarkan kamar-kamar penuh gaya dengan paduan lantai kayu. Pemandangan kota disuguhkan sebagai sajian hiburan melalui jendela kamarnya. Anda yang tertarik booking Allium Tangerang Hotel dapat menjangkau akomodasi ini dari Bandara Internasional Soekarno Hatta yang berjarak 22 km dari hotel. Akomodasi yang menyediakan kolam renang outdoor dan pusat kebugaran ini memiliki kamar berdesain minimalis dan stylish yang dilengkapi dengan perabotan modern berupa AC, TV layar datar, brankas pribadi, dan minibar. Shower, pengering rambut, dan perlengkapan mandi gratis.Properti ini mudah menjangkau beberapa atraksi wisata populer seperti Taman Monas, Lippo Mall Karawaci, Tanah Abang, Dunia Fantasi, dan lain-lain. Akomodasi menyiapkan Paris-Lyon Café untuk menyuguhkan beragam hidangan khas Asia, Indonesia hingga Barat. ",
            R.drawable.bantenhotel),
        Hotel("Grand Mahkota Hotel","Kalimantan Barat","Pontianak","Jalan Sidas No.8, Kota Pontianak, Kalimantan Barat 78243",
            "Hadir dengan layanan meja depan 24 jam, Grand Mahkota Hotel Pontianak terletak di lokasi yang bagus serta dekat dengan kawasan penting dan destinasi petualangan menarik. Area parkir di akomodasi terbuka untuk semua tamu yang tengah berkunjung. Sementara akses wifi gratis tersedia di seluruh area properti. Saat menginap di sini, Anda bisa meminta koran di lobby, memesan layanan antar jemput bandara atau menyewa fasilitas mobil yang disediakan pihak pengelola. Staf pramutamu juga bisa membantu dalam berbagai hal, dari mulai penitipan bagasi, penyewaan fasilitas bisnis dan masih banyak lagi. Silahkan pilih kamar-kamar yang ditawarkan akomodasi. Tak hanya mewah dan berkelas, Grand Mahkota Hotel Pontianak juga menghadirkan beberapa tipe kategori kamar, mulai dari queen superior, superior king, deluxe king, hingga superior twin room. Berbagai fasilitas unggul juga turut melengkapi semua kamar yang tersedia, termasuk TV kabel layar datar, penyejuk ruangan, ketel listrik untuk membuat minuman teh/kopi, hingga area tempat duduk.",
            R.drawable.pontianakgrand),
        Hotel("Villa Aveli","Kalimantan Tengah","Barito","Jalan Lebak Sari, Gang Soham No. 5",
            "Buat diri Anda nyaman di vila ber-AC ini, memiliki fitur dapur dengan lemari es dan oven.Terdapat balkon atau patio pribadi.TV LCD dengan program kabel untuk hiburan, sementara akses Internet kabel kecepatan tinggi gratis membuat Anda tetap terhubung.Kenyamanan meliputi meja tulis dan ruang duduk terpisah, dan pembersihan disediakan setiap hari.",
            R.drawable.baritohotel),
        Hotel("Hotel Bumi Senyiur","Kalimantan Timur","Samarinda","Jalan Pangeran Diponegoro, No 17-19, Pelabuhan, Samarinda Kota, Kota Samarinda, Kalimantan Timur 75111, Indonesia",
            "Hotel Bumi Senyiur Samarinda, dibuka pada 1995 sebagai satu-satunya hotel berbintang empat di Samarinda. Berada di pusat kawasan bisnis Samarinda, Hotel Bumi Senyiur Samarinda adalah tempat yang sempurna untuk wisatawan bisnis maupun berlibur. Lokasi hotel sangat strategis karena hanya berjarak 1,87 km dengan Bandar Udara Temindung. Terdapat beberapa tempat menarik di sekitarnya, seperti Rumah Makan Pondok Borneo yang berjarak sekitar 0,1 km dan Taman Samarendah berjarak sekitar 0,63 km. Kamar-kamar dikelompokkan dalam Superior, Deluxe, Junior Suite, Executive Suite, dan Senyiur Suite. Semua kamar dirancang luas dan dilengkapi dengan telepon SLI, brankas di dalam kamar, kamar mandi batu marmer yang mewah dengan air panas/dingin, mini-bar/kulkas, TV satelit, fasilitas pembuat kopi dan teh, Wi-Fi gratis, layanan kamar 24 jam, surat kabar harian, pilihan keranjang buah-buahan atau kue rumahan pilihan, serta minuman penyambut serta handuk dingin saat tiba di hotel. ",
            R.drawable.samarindahotel),
        Hotel("Swiss-Belhotel Tarakan","Kalimantan Utara","Tarakan","Jl. Mulawarman No.15, Karang Anyar Pantai, Tarakan Bar., Kota Tarakan, Kalimantan Utara 77111, Indonesia",
            "Swiss-Belhotel Tarakan terletak di lokasi paling strategis, yaitu di Jalan Mulawarman Kalimantan Timur, hanya 10 menit dari Bandar Udara Juwata serta dekat dengan tempat wisata menarik seperti Pantai Amal dan suaka hutan bakau, menjadikan hotel ini pilihan terbaik bagi para pelaku bisnis maupun wisatawan. Swiss-Belhotel Tarakan adalah hotel bintang 4 yang menawarkan 82 kamar dalam berbagai ukuran untuk melengkapi kebutuhan akomodasi selama perjalanan Anda. Setiap jenis kamar menawarkan kenyamanan dengan berbagai fasilitas seperti sambungan telepon IDD, televisi dengan saluran lokal dan internasional, akses Internet, kotak penyimpanan barang pribadi, minibar, fasilitas pembuat teh dan kopi dan lain-lain. Bagi para pelaku bisnis yang datang dan tinggal di Swiss-Belhotel Tarakan, tersedia fasilitas sekretarial di pusat layanan bisnis termasuk jasa pengetikan dan pengiriman dokumen, fotokopi, faksimili dan lain sebagainya. Di Tarakan Swiss-Belhotel, Anda dapat menikmati berbagai masakan termasuk masakan Indonesia, Cina, dan Barat. Lounge lobi juga menawarkan tempat yang ideal untuk bersantai sambil minum dan menikmati makanan ringan. Hotel ini juga memilki ruang pertemuan yang dapat menapung hingga 400 orang, sehingga tepat dipergunakan sebagai tempat penyelenggaraan acara-acara perusahaan, pelatihan, seminar maupun pernikahan. ",
            R.drawable.tarakanhotel),
        Hotel("Arthama Hotels Makassar","Sulawesi Selatan","Makassar","Jalan Haji Bau No.5 Losari Makassar, Sulawesi Selatan, Indonesia 90111","Baik untuk menikmati masa berlibur dengan keluarga maupun perjalanan bisnis di area Pantai Losari, Arthama Hotels Makassar merupakan pilihan yang tepat. Akomodasi yang berjarak 1 km dari pusat kota ini berlokasi di Jl. Haji Bau No.5, Makassar, Sulawesi Selatan. Arthama Hotels Makassar berjarak 5,47 km dari Terminal Bus Malengkeri dan 18,64 km dari Bandara Internasional Sultan Hasanuddin. Masjid Terapung Amirul Mukminin berjarak 0,35 km. Sementara Anjungan Pantai Losari dapat ditempuh dengan jarak 0,63 km. Jangan lewatkan pula kesempatan mengunjungi Wisata Belanja Jalan Somba Opu yang hanya berjarak 0,84 km dari akomodasi. Akomodasi bintang 4 yang dibangun sejak tahun 2016 ini menawarkan fasilitas seperti area parkir, Wi-Fi yang bisa diakses di area publik, AC, lift, brankas dan alat pemanas. Ada pula area merokok, area bebas rokok, ruang keluarga, restoran, kafe, teras rooftop dan perapian di lobi. ",
            R.drawable.makasarhotel),
        Hotel("Naya Matahora Island Resort","Sulawesi Tenggara","Wakatobi","Jalan Poros Liya, Wangi-Wangi Sel., Kabupaten Wakatobi, Sulawesi Tenggara 93795, Indonesia",
            "Naya Matahora Island REsort terletak di Sulawesi tenggara, hotel bintang 3 yang memiliki total 30 kamar dengan beberapa fasilitas kolam renang, restaurant, Wifi, Meeting room dan masih banyak lainnya. Cocok untuk liburan keluarga atau bekerja.\n" +
                    "Naya Matahora Island Resort bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Wangi Wangi. Fasilitas yang tersedia di Naya Matahora Island Resort akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Naya Matahora Island Resort ketika Anda melakukan kunjungan kerja atau berwisata ke Wangi Wangi dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",
            R.drawable.wakatobihotel),
        Hotel("Yama Resort","Sulawesi Utara","Minahasa","Lrg. SMA N 2 Tondano, Tataaran Patar, Tondano Sel., Kabupaten Minahasa, Sulawesi Utara, Indonesia","" +
                "Hotel bintang 4 dengan total 88 kamar memiliki beberapa fasilitas, antara lain parkir area, concierge, AC, Wifi dan masih banyak lainnya.\n" +
                "Cocok untuk kebutuhan bisnis kantor ataupun berlibur anda.\n" +
                "Yama Resort bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Tondano. Fasilitas yang tersedia di Yama Resort akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Yama Resort ketika Anda melakukan kunjungan kerja atau berwisata ke Tondano dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",
            R.drawable.minahasahotel),
        Hotel("Kakatua Hostel","Papua","Raja Ampat","Jalan Yos Sudarso No. 8,Raja Ampat, Waigeo",
            "Saat Anda menginap di Kakatua Hostel di kota Kota Waisai, Anda akan berada 14 menit dengan mobil dari Pelabuhan Saonek.Nikmati kenyamanan rumah Anda sendiri di salah satu dari 6 kamar berpenyejuk udara. Akses Internet nirkabel gratis tersedia untuk menjamin koneksi Anda. Kamar mandi memiliki shower, perlengkapan mandi gratis, dan pengering rambut. Fasilitas mencakup air minum kemasan gratis dan layanan pembenahan kamar disediakan setiap hari.\n" +
                    "Di Kakatua Hostel, nikmati hidangan lezat di restoran.Hilangkah dahaga dengan minuman favorit Anda di bar/lounge. Sarapan prasmanan gratis tersedia setiap hari mulai pukul 06.00 hingga 10.30.",R.drawable.rajaampatkakatua),
        Hotel("Pratama Hotel and Convention","Nusa Tenggara Barat","Nusa Tenggara Barat",
            "Jl. Adi Sucipto No.10, Ampenan Utara, Kec. Ampenan, Kota Mataram, Nusa Tenggara Bar. 83113, Indonesia",
            "Pratama Hotel and Convention berada di kawasan Jalan Adisucipto No 10, Mataram, Lombok, Indonesia Anda dapat dengan mudah mengunjungi Pasar Amperan yang berjarak 600 m dan pusat perbelanjaan seperti Mataram Mall yang berjarak 4.7 km. Sedangkan Blue Marlin Dive dapat ditempuh dengan jarak sekitar 8.3 km dan Senggigi Plaza 8.3 km dari hotel mewah ini. Hotel ini juga memiliki restoran yang menghidangkan aneka masakan lokal, masakan laut dengan bumbu khas, serta minuman yang menyegarkan.\n" +
                    "Pratama Hotel and Convention bisa menjadi pilihan akomodasi penginapan yang sangat tepat untuk Anda yang membutuhkan penginapan nyaman di Mataram. Fasilitas yang tersedia di Pratama Hotel and Convention akan membuat Anda semakin betah menginap. Nikmati pelayanan terbaik dari Pratama Hotel and Convention ketika Anda melakukan kunjungan kerja atau berwisata ke Mataram dan dapatkan pengalaman menginap yang tak terlupakan bersama keluarga dan orang tercinta Anda.\n",R.drawable.ntbotel),
        Hotel("Hotel On The Rock By Prasanthi Sea View","Nusa Tenggara Timur","Nusa Tenggara Timur",
            "Jl. Raya Timor No.2 Kelapa Lima","Hotel On The Rock by Prasanthi Sea View adalah hotel bintang tiga yang terletak di dekat garis pantai. Hotel ini menyajikan pemandangan pantai yang tiada duanya. Keluar hotel pun, kamu akan langsung dimanjakan dengan pemandangan pantai tropis di penginapan yang modern. Meskipun terletak di dekat bibir pantai, Hotel On The Rock by Prasanthi Sea View cukup mudah dicari. Kamu cukup menuju ke alamat Jalan Timor Raya No. 2 KM5, Kelapa Lima, Kupang, Nusa Tenggara Timur.",
            R.drawable.ntthotel)
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