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
import androidx.recyclerview.widget.LinearLayoutManager
import com.aldi.liboorean.Adapter.RestaurantAdapter
import com.aldi.liboorean.Model.Restaurant

import com.aldi.liboorean.R
import kotlinx.android.synthetic.main.fragment_restaurant.*
import kotlinx.android.synthetic.main.fragment_second_menu.*


class RestaurantFragment : Fragment() {
    private val restaurantData = arrayListOf(
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
                "Harga: Sekitar 5,000 – 15,000 IDR per porsi\n", R.drawable.acehrujakk),
        Restaurant("Soto Keswan","Sumatera Utara","Medan","Sesuai dengan namanya, menu yang ditawarkan di sini adalah soto dengan kuah gurih yang menggiurkan. Isian dari udang, paru kering, daging sapi serta ayam kampung memiliki tekstur empuk yang mudah dikunyah. Campuran rempah yang kuat membuat sajian ini pas disantap sore hari.",R.drawable.medansotokeswann),
        Restaurant("Bihun Bebek Asie","Sumatera Utara","Medan","Pernah dengar nama Bihun Bebek Kumango? Warung ini terkenal dengan kelezatan bihun yang bercampur daging bebek. Campuran bihun dengan rempah benar-benar nikmat dan bikin ketagihan. Sementara daging bebeknya memiliki tekstur empuk meskipun ukurannya besar. Tak lupa pula sayuran serta sambal yang nikmat di lidah. Kuliner ini pun menjadi opsi kuliner Medan Halal yang paling diburu. Makin penasaran dengan rasanya kan? Kunjungi saja warungnya di Jalan Kumango, Kesawan.",R.drawable.medanbihunbebek),
        Restaurant("Miso Siantar","Sumatera Utara","Pematang Siantar","Miso siantar sudah sangat terkenal loh, selain rasanya yang enak dengan campuran daging ayam dan bumbu rendang satenya satu porsinya bisa mengenyangkan makan siang atau malam. Berikut beberapa lokasi yang paling diminati warga siantar untuk menikmati Miso Siantar.\n" +
                "Warung Miso Pematang (WMP), letaknya di Jl. Jenderal Sudirman, Teladan, Siantar Barat, Kota Pematang Siantar, Sumatera Utara 21144. Buka mulai jam 9.00 pagi hingga jam 10.00 malam. Selain menu Miso, ada juga tersedia mi goreng, nasi goreng, ayam penyet dan lain-lain.\n" +
                "Miso Lestari terletak di Jl. H. Adam Malik, Timbang Galung, Siantar Barat. \n" +
                "Miso Sri, yang terletak di Jl. Silimakuta, Simarito. Tempat ini selalu ramai, apalagi kalau menjelang sore bisa kenak antrian. Porsinya yang banyak misonya juga enak. Harga per porsi sekitaran Rp. 11.000,-\n",R.drawable.pematangmisoo),
        Restaurant("Lontong Mie","Sumatera Utara","Pematang Siantar","Kedai Lontong Siantar juga menjamur setiap paginya. Menu sarapan pagi ini didominasi dengan mie spesial yakni mie gomak. Ada Kedai Lontong “Mak Pesek”, terletak di persimpangan jalan Bahagia dan Jalan Gereja. Lontongnya lembut dan enak. Tidak terlalu lemak santan pokoknya enak. seporsinya hanya Rp. 10.000,- Buka mulai pagi pukul 7.00 hingga 12.00 siang setiap hari ini. Kedai Lontong Rasa, enak juga. Terletak di Jl. H. Adam Malik No.84a, Simarito. Lontong sayur diberi sambal, 1 butir telur dan kuah sayur santan setiap porsinya. Harganyapun berfariasi dari Rp. 7.000 sampai dengan 10.000,-. Lontong Malam Cokro, di Jl. Cokroaminoto No.189, Pahlawan, Siantar Timur – Nah, jika Anda hendak menyantap lontong di malam hari tidak usah kuatir, di Siantar juga punya kedainya. Buka mulai pukul 7.00 malam hingga jam 10.00 malam. Menu mulai dari Lontong Sayur, ada juga pergedel, sate dan bakwan. Harga mulai Rp. 8.000,- sampai Rp. 10.000,-",R.drawable.pematanglontongg),
        Restaurant("Kampung Kuliner Binjai","Sumatera Utara","Binjai","Setelah lelah mengelilingi Kota Binjai, Anda bisa beristirahat sambil menikmati berbagai makanan lezat di Kampung Kuliner Binjai yang beralamat di Jalan Medan-Banda Aceh, Tanah Tinggi, Binjai Tim, Kota Binjai Sumatera Utara 20735.",R.drawable.binjaikk),
        Restaurant("Sate Danguang-nguang","Sumatera Barat","Padang","Ke Padang tanpa mencoba wisata kuliner sate padang tentu tak akan afdol. Salah satu tempat berburu sate padang paling terkenal di Padang adalah Sate Danguang-Danguang. Dengan kuah saus sate padang yang khas dan daging sapi yang gurih, sate padang daguang-daguang menjadi spot wisata kuliner favorit di Padang.\n" +
                "Alamat: Jalan Simpang Kinol, Padang\n" +
                "Harga mulai dari: Rp 17.000\n",R.drawable.padangsate),
        Restaurant("Martabak  HAR","Sumatera Selatan","Palembang",
            "Martabak HAR merupakan salah satu makanan legendaris yang dimiliki Kota Palembang. Nama HAR sendiri merupakan singkatan dari pemilik resto yang bernama Haji Abdul Rojak. Kamu pasti mau tau kan, apa yang membedakan Martabak HAR ini dengan martabak lainnya?\n" +
                    "Martabak HAR ini terbuat dari kulit martabak yang berisi telur ayam atau bebek. Namun, penyajian martabak satu ini ditambah dengan kuah kari kambing kental, dan dicampur dengan potongan kentang dan daging,\n" +
                    "Kamu juga bisa menjadikan sambal kecap sebagai dipping sauce nya nih, sobat tiket. Saat di Palembang, kamu bisa mencicipinya langsung ke  Jalan protokol Sudirman, Palembang.\n",
            R.drawable.palembangmartabak),
        Restaurant("Kimteng","Riau","Pekanbaru","Kimteng yang berdiri sejak tahun 1950 ini merupakan salah satu kedai kopi legendaris di Pekanbaru. Blom ke Pekanbaru jika blom ke Kimteng. \n" +
                "Pusatnya terletak di Jalan Senapelan. Outletnya ada di Senapelan Plaza, Mall SKA, Mall Ciputra, Transmart Pekanbaru, RS. Awal Bros Sudirman, RS Awal Bros Panam dan RS Awal Bros Ahmad Yani.\n" +
                "Yang recommended disini adalah roti bakar selai srikaya dan juga secangkir kopinya. Rotinya lembut, enak, manis srikayanya juga pas. Mantap! Kimteng yang berdiri sejak tahun 1950 ini merupakan salah satu kedai kopi legendaris di Pekanbaru. \n",
            R.drawable.pekanbarukimteng),
        Restaurant("Paskal Food Market","Jawa Barat","Bandung","Paskal Food Market hadir dengan konsep ruangan terbuka. Di lokasi kuliner bandung ini terdapat lebih dari 50 stand yang menyediakan berbagai makanan. Stand-stand makanan ini menyajikan hidangan chinese food, japanese food. Tidak ketinggalan masakan khas nusantara seperti empal gentong, bakso, dan masih banyak lainnya.\n" +
                "Tidak kurang dari 1001 menu tersedia di lokasi kuliner bandung dengan tata ruang yang rapi ini. Saat malam hari, tempat ini merupakan tempat yang romantis, karena sebagian penerangan adalah lampu pijar kuning lengkap dengan hiasan obor di bagian outdoor.\n" +
                "Selain stand penjaja makanan yang beragam, salah satu daya tarik kuliner bandung Paskal Food Market adalah live music. Di tengah-tengah kolam air mancur, terdapat sebuah panggung tempat para band perform live music. Lokasi ini cocok untuk bisa bersantai sambil mendengarkan live music dan menyantap ragam hidangan lesat\n" +
                "Alamat : Paskal Hypersquare, tepatnya di Jalan Pasir Kaliki Nomor 25-27, Bandung\n" +
                "Jam Buka : Hari biasa, tempat ini buka mulai pukul 11:00 sampai 23:30 WIB. Pada Akhir pekan buka pukul 11:00 sampai 00:30.\n" +
                "Harga per Orang: Kurang dari Rp 50.000\n",R.drawable.bandungpaskal),
        Restaurant("Mie Sangki","Jawa Tengah","Semarang","Kuliner semarang cukup legendaris pertama yang bisa dijumpai di Gang Lombok. Bagi kalian yang gemar menyantap varian hidangan mie bisa langsung meluncur Mie Sang Kie. Kedai ini termasuk legendaris karena sudah berdiri sejak zaman kolonial. Luar biasanya, hingga kini mereka masih punya banyak penikmat setia.\n" +
                "Ada beberapa jenis kuliner semarang yang bisa Teman Traveler coba di Mie Sang Kie. Namun yang jadi andalan adalah Mie Godok alias Mie Rebus. Seporsinya terdiri dari mie, potongan kecil telur dadar, kekian. Semua bahan tersebut lantas disajikan bersama kuah kaldu hangat yang nikmatnya luar biasa.\n",
            R.drawable.semarangmiesangki),
        Restaurant("Sego Cawuk Bu Mantih","Jawa Timur","Banyuwangi","Sego cawuk atau nasi cawuk merupakan makanan yang sangat pas disantap setelah seharian beraktivitas. Bahan dasar panganan ini adalah nasi yang ditaburi parutan kelapa, kemudian ditambah kuah yang berasal dari bumbu-bumbu pilihan.\n" +
                "Sebagai pelengkap, ada tambahan lauk seperti dendeng, telur, pepes ikan, dan masih banyak lagi. Jika Toppers penasaran akan cita rasa sego cawuk, datanglah ke Warung Bu Mantih yang menyediakan kuliner populer khas Banyuwangi ini. Sebagai tips, datanglah ke tujuan wisata kuliner Banyuwangi ini lebih awal karena biasanya mulai jam 11:00, lauk sudah mulai habis.\n" +
                "Lokasi: Warung Bu Mantih, Jalan Wahid Hasyim (Dekat Stasiun Rogojampi), Prejengan, Rogojampi, Kecamatan Rogojampi, Kabupaten Banyuwangi, Jawa Timur\n" +
                "Jam Operasional: 07:00 – 15:00\n" +
                "Kisaran Harga: Rp 7.000,- – Rp 15.000,-\n",
            R.drawable.banyuwangikuliner),
        Restaurant("Gudeg Mbah Lindu Sosrowijayan","Daerah Istimewa Yogyakarta",
            "Daerah Istimewa Yogyakarta","Mlaku-mlaku ning Malioboro (jalan-jalan di Malioboro), asyiknya menikmati landmark terkemuka Jogja tambah lengkap sambil menyuap sepiring nasi gudeg yang ada di Jalan Sosrowijayan. Gudeg legendaris ini merupakan racikan Mbah Lindu yang kini berusia hampir 100 tahun yang sudah berjualan sejak ia remaja! Jangan heran kalau antreannya nggak habis-habis.",
            R.drawable.yogyakartagudeg),
        Restaurant("Warung Nyoman","Bali","Bali","Tak lengkap jika ke Bali tanpa menikmati ayam betutu, kuliner khas Pulau Dewata ini. Salah satu tempat wisata kuliner di Bali yang menyajikan ayam betutu terlezat adalah Warung Nyoman yang terletak di Jalan Raya Bedugul. Ayam betutu disajikan bersama nasi panas, lawar alias sayur khas Bali dan sambal mentah. Rasanya? Silakan datang sendiri dan buktikan kelezatannya Guys.",
            R.drawable.balinyoman),
        Restaurant("Nasi Ayam Kedewatan Ibu Mangku","Bali","Bali","Nasi Ayam Kedewatan Ibu Mangku merupakan tempat wisata kuliner yang wajib kamu kunjungi saat berada di kawasan Ubud, Bali. Meski terdapat banyak tempat makan serupa di sekitarnya, namun Nasi Ayam Kedewatan Ibu Mangku yang terletak tepat di Jalan Kedewatan 18, Ubud, ini paling populer dan tak pernah sepi pengunjung. Kamu bisa memilih duduk di bangku dan meja yang telah disiapkan atau lesehan di pendopo sambil menikmati hidangan istimewa ini. Satu porsi nasi ayam ini berisi nasi, ayam, sambal kacang-teri, telur, sate lilit, irisan mentimun, urap dan sambal super pedas.",
            R.drawable.balinasi),
        Restaurant("Bubur Setan","Banten","Banten","Dari sekian banyak kuliner di Provinsi Banten, Bubur Setan adalah salah satu Tempat Wisata Kuliner yang paling banyak dicari dan dirindukan oleh warga Serang, Banten. Bubur ayam yang telah ada sejak 1963 ini bahkan sudah mempunyai tiga cabang, masing-masing di Mal Ramayana Serang, Pasar Lama Serang, dan daerah Mangga Dua. Buset, begitu singkatan dari Bubur Setan yang melegenda di Kota Serang. Bubur berbahan beras yang memiliki banyak penggemar dari masyarakat biasa sampai pejabat Banten tersebut, merupakan kuliner warisan kebudayaan Tiongkok. Nama setan diberikan karena dulu jam bukanya mulai jam 9 malam dan tutup jam 2 pagi. Selain itu, lokasi warung bubur ayam yang selalu pindah-pindah membuat pelanggannya kebingungan, sehingga memberikan nama bubur ayamnya sebagai Bubur Setan. ",
            R.drawable.bantenbubur),
        Restaurant("Bubbor Paddas Pak Ngah","Kalimantan Barat","Pontianak","Makanan ini lebih identik sebagai kuliner khas Melayu Sambas. Namun popularitasnya di Pontianak juga tidak terbantahkan. Perpaduan bubur nasi dengan kangkung, kecambah, kacang panjang, jagung muda, daun katak kesum, daun kencur, ikan teri, daging ayam dan kacang tanah goreng menghadirkan kuliner dengan aroma yang khas dan rasa yang unik. Penasaran mencicipi kuliner ini?\n" +
                "Lokasi: Jl. Komyos Sudarso, Sungai Jawi Luar, Pontianak Bar., Kota Pontianak\n" +
                "Jam buka: Setiap hari, 08.00 hingga 22.00 WIB\n" +
                "Harga: Mulai dari 7,000 IDR hingga 9,000 IDR per porsi\n",
            R.drawable.pontianakbubur),
        Restaurant("Sop Kaki Kambing Irwan","Kalimantan Tengah","Barito",
            "\n" +
                    "Siapapun yang sering jalan-jalan di sekitaran Barito, pasti sudah tidak asing lagi dengan Sop Kaki Kambing Irwan. Terletak sejajar dengan pasar hewan dan buah Barito, membuat kedai yang buka setiap harinya hingga pukul 12 malam ini sangat mudah ditemukan. Sop Kaki Kambing Campur di sini dihargai Rp 45 ribu per porsinya. Walaupun terdengar cukup mahal, tapi kamu wajib cobain langsung, agar percaya kalau sop yang berisi banyak potongan kaki kambing, emping, dan kuah yang menggunakan minyak samin ini memang terbukti kelezatannya!\n",
            R.drawable.baritokuliner),
        Restaurant("Ayam Cicane","Kalimantan Timur","Samarinda","Dari namanya saja sudah membuat penasaran. Apalagi dari segi rasanya.\n" +
                "Jadi, Ayam Cincane ini sebenarnya ayam kampung yang dibakar dan dinikmati dengan sambal tomat. Meski kelihatannya sama dengan ayam kebanyakan, namun sebenarnya ayam ini diolah dan dibumbui dengan bumbu yang berbeda.\n" +
                "Sebelum dibakar ayam cincane ini biasanya di rebus terlebih dahulu dengan bumbu khusus. Setelah itu dilumuri dengan bumbu dan dibakar hingga kecokelatan. Baru setelah itu dilumuri dengan sambal tomat.\n",
            R.drawable.samarindayamcicane),
        Restaurant("Olahan Kepiting Soka","Kalimantan Utara","Tarakan","Kuliner Tarakan memang kaya akan cita rasa laut. Makanan seafood khas Tarakan lain yang bisa dicoba adalah berbagai olahan dari Kepiting Soka. Berbeda dengan kepiting pada umumnya, kepiting jenis ini memiliki cangkang lebih lunak.\n" +
                "Berlibur ke Tarakan, Toppers bisa temukan banyak olahan dari Kepiting Soka, mulai dari Kepiting Soka Asam Manis, Saus Padang hingga sekedar digoreng garing sebagai camilan atau makanan ringan.\n",
            R.drawable.tarakanmakan),
        Restaurant("Coto Makassar","Sulawesi Selatan","Makassar","Coto merupakan makanan khas Makassar dan memiliki ciri khas tersendiri dalam bumbu. Coto berbahan dasar daging sapi. Diolah dengan menggunakan berbagai macam rempah. Seperti menggunakan kacang, kemiri, cengkeh, pala, serei yang ditumbuk halus. Lengkuas, merica, bawang merah, bawang putih, jintan, ketumbar merah, ketumbar putih, jahe, daun jeruk purut, daun salam, daun kunyit, daun bawang, daun seledri, lombok merah, lombok hijau, gula merah, asam, kayu manis, garam, dan berbagai jenis bahan lainnya.\n" +
                "Kuah coto dari campuran air beras, ada juga yang menggunakan santan, susu dan telur untuk menghasilkan kuah yang kental.\n" +
                "Karena berbahan daging, beberapa tempat kuliner coto mulai memperhatikan pembuatan coto dari segi kesehatan. Beberapa pemilik kuliner coto mulai mengganti air beras dengan bahan yang lebih sehat seperti telur untuk mengentalkan kuahnya. Mengingat beras mulai banyak mengandung pemutih atau bahan kimia lainnya.\n",
            R.drawable.makasarcoto),
        Restaurant("Kasuami","Sulawesi Tenggara","Wakatobi","Kuliner Wakatobi Kasuami ini bisa dibilang adalah makanan pengganti nasi bagi masyarakat Wakatobi. Karena memang menanam padi di Wakatobi jauh lebih sulit daripada menanam Singkon. Makanya Kasuami ini banyak diperdagangkan disana, karena memang bahan makanan pokok tiap hari. Bahan dasarnya adalah singkong yang diparut, diperas hingga tidak ada airnya.\n" +
                "Biasanya dimakan dengan disiram terlebih dahulu dengan kuah agar menjadi lembut lagi. Kuah Ikan Parende adalah pasangan yang pas untuk makan Kasuami. Kalau tidak, ya lumayan keras ketika digigit. Menurut saya, ini juga merupakan salah satu kuliner khas Wakatobi yang unik, karena biasanya disajikan dalam bentuk oval.\n",
            R.drawable.wakatobikasuami),
        Restaurant("Tinutuan","Sulawesi Utara","Minahasa","Baik di Manado maupun Minahasa, tinutuan tak hanya jadi pengisi perut. Makanan ini menjadi lambang pergaulan antarkelompok. Tinutuan muncul dari kreativitas orang-orang pada zaman penjajahan Belanda. Kala itu, bahan makanan pokok amatlah sulit. Jadi untuk memenuhi kebutuhan makanan, orang-orang memasak bahan makanan yang ada dan mudah diperoleh di pekarangan rumah. Ubi, labu, daun pepaya, jagung, daun gedi, dan kangkung dimasak bersama sedikit nasi.\n" +
                "Tinutuan merupakan bubur yang dimasak bersama berbagai macam sayuran, seperti labu kuning, bayam, kangkung, kemangi, dan jagung. Tampilannya benar-benar mencerminkan makna kata tinutuan. Dalam bahasa Manado, tinutuan bermakna 'semrawut atau campur aduk' dalam bahasa Manado. Kini, bubur tanpa daging ini memang bisa dinikmati berbagai kalangan di saat sarapan. Rasanya sedap.\n",
            R.drawable.minahasamakanan),
        Restaurant("Ulat sagu","Papua","Raja Ampat","Sebenarnya ulat sagu tidak hanya ditemukan di Raja Ampat, melainkan di seantero Papua Barat, bahkan beberapa daerah Indonesia Timur lainnya.\n" +
                "Ulat ini merupakan larva kumbang merah yang suka mendiami pohon sagu tua yang sudah ditebang, atau sudah diambil sagunya.\n" +
                "Biasanya, ulat sagu dibakar seperti sate. Jika diolah seperti itu, teksturnya saat matang mirip dengan sosis bakar. Bumbunya bisa macam-macam, seperti rica-rica atau balado, bahkan bisa juga dibuat pepes.\n" +
                "Sementara itu, masyarakat lokal di Raja Ampat juga suka menyantap ulat sagu mentah-mentah. Ulat sagu mentah memiliki cita rasa manis campur gurih. Saat digigit ada cairan manis yang keluar dari perutnya.\n",
            R.drawable.rajaampatulat),
        Restaurant("Ayam Taliwang","Nusa Tenggara Barat","Nusa Tenggara Barat","Makanan khas NTB yang kesatu merupakan Ayam Taliwang. Makanan khas NTB ini merupakanmakanan yang sangat terkenal di Nusa Tenggara Barat yakni tepatnya di Pulau Lombok.\n" +
                "Ayam Taliwang ini merupakanmakanan yang terbuat dari ayam yang telah diberi bumbu khas Indonesia yang kaya akan rempah-rempah. Ayam Taliwang ini ternyata tak hanya terkenal di wilayah NTB loh, makanan khas Ayam Taliwang ini juga adalahmakanan khas Bali. Rasanya yang begitu enak menciptakan tidak tidak banyak orang menyukai makanan ini.\n",
            R.drawable.ntbayam),
        Restaurant("Kuah Asam Ikan Tenau","Nusa Tenggara Timur","Nusa Tenggara Timur",
            "Kuliner lokal yang langsung berasal dari sumber laut NTT ini adalah makanan dengan bahan dasar ikan yang diracik sedemikian rupa dan dibakar dengan bumbu-bumbu yang khas.\n" +
                    "Salah satu detinasi Wisata Kuliner Kuah Asam Ikan Tenau yang sudah cukup terkenal dan bisa Toppers temukan adalah Warung Artis. Dari hari Senin sampai Sabtu, destinasi wisata kuliner NTT ini tidak pernah sepi didatangi pengunjung. Tidak hanya penduduk Kupang saja, tujuan wisata kuliner Kupang ini juga sudah cukup populer di kalangan pejabat pemerintahan.\n" +
                    "Lokasi: Jalan M. Praja, Kelurahan Alak, Kecamatan Alak, Kota Kupang, NTT.\n" +
                    "Jam Operasional: Senin-Sabtu, sebelum pukul 14.00 WITA\n" +
                    "Kisaran Harga: Rp 15.000,- – Rp 35.000,-\n",
            R.drawable.nttmakan)
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
            (adapter as RestaurantAdapter).setOnItemClickCallback(object : RestaurantAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Restaurant) {
                    showSelectedRestaurant(data)
                }
            })
        }
    }

    private fun showSelectedRestaurant(vacation: Restaurant) {
        Toast.makeText(context, "Kamu memilih " + vacation.nameRestaurant, Toast.LENGTH_SHORT).show()
    }
}