package com.example.praktikumm_modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobilsportlist = listOf<Mobilsport>(
            Mobilsport(
                R.drawable.cardview_01,
                nameMobilsport = "Toyota 86",
                descMobilsport = "Rekomendasi mobil sport murah yang pertama adalah Toyota 86. Kendaraan dengan mesin 2.0 liter dengan konfigurasi 4 \n" +
                        "silinder boxer tersebut dijual mulai Rp 775,75 juta (OTR Jakarta).Hanya saja sekarang unitnya sudah habis, jadi kalau \n" +
                        "kamu mau memilikinya bisa dalam kondisi bekas.\n" +
                        "Soal performa, tidak perlu diragukan. Mesin Toyota 86 bisa memuntahkan torsi hingga 205 Nm pada 6.600 rpm dan tenaga \n" +
                        "maksimal 200 PS pada 7.000 rpm. Tersedia pilihan transmisi 6-percepatan manual dan otomatis sebagai padanannya. Kemudian untuk tampilan, mobil Toyota ini sangat aerodinamis. Punya pusat gravitasi rendah, serta berbagai komponen pembelah angin khususnya untuk varian termahal atau TRD. Nah, untuk kamu yang tertarik dengan Toyota 86, stok mobil bekas sportscar ini sudah tersedia di pasaran. Tentunya dengan harga yang lebih terjangkau."
            ),
            Mobilsport(
                R.drawable.cardview_02,
                nameMobilsport = "Mini 3-Door JCW",
                descMobilsport = "Nama John Cooper Works memang identik dengan performa buas. Hal ini diimplementasikan oleh Mini lewat penggunaan mesin 2.0 liter Twinpower Turbo. Jantung mekanis tersebut diracik khusus agar bisa mengeluarkan torsi puncak 450 Nm dan tenaga maksimal 306 hp. Kelebihan lain dari Mini 3-Door JCW punya knalpot lebih besar dari varian standar, penggerak semua roda, driving mode, suspensi lebih rendah 10 mm, serta berbagai komponen bodi aerodinamis. Alhasil performanya mantap. Kemampuan berlarinya dari posisi diam hingga 100 Kpj, hanya butuh 6,1 detik."
            ),
            Mobilsport(
                R.drawable.cardview_03,
                nameMobilsport = "BMW M2 Competition",
                descMobilsport = "Kalau kamu mau membeli BMW M termurah, maka M2 Competition bisa jadi pilihan. Mobil sport ini dijual mulai Rp 1,8 miliar. Dengan banderol tersebut, kamu bisa mendapat mobil buas dengan mesin 3.0 liter berkonfigurasi enam silinder. Jantung mekanis BMW M2 Competition sanggup melontarkan torsi hingga 550 Nm dan tenaga maksimal 410 PS. Jika diajak berakselerasi, BMW M paling murah ini bisa melaju dari posisi diam hingga 100 Kpj cuma dalam waktu 4,2 detik. Lalu bicara kecepatan maksimal tembus 280 Kpj. Soal kabin, kendaraan ini bisa memuat empat orang. Tersedia pula berbagai fitur menarik seperti voice control, audio steering switch, head unit layar sentuh, dan lain-lain."
            ),
            Mobilsport(
                R.drawable.cardview_04,
                nameMobilsport = "Marcedes-AMG A 35 4Matic",
                descMobilsport = "Bila kamu mengincar mobil sport merek Mercedes-AMG, paling murah model A 35 4MATIC. Harganya Rp 1,2 miliar off the road. Mobil ini berjenis hatchback atau bisa disebut sebagai hothatch. Desain eksteriornya sungguh istimewa dengan berbagai aksesori pembelah angin, termasuk spoiler belakang yang seperti sayap mobil balap. Kelebihan lainnya, pakai mesin 2.0 liter berkonfigurasi empat silinder. Jantung mekanis itu bisa melontarkan torsi puncak 400 Nm pada 3.000 – 4.000 rpm dan tenaga maksimal 306 hp pda 5.800 rpm. Pakai mesin tersebut, Mercedes-AMG A 35 4 MATIC bisa melaju 4,7 detik dari posisi diam hingga 100 Kpj. Kemudian untuk kecepatan maksimalnya mencpai 250 Kpj. Soal fitur mewah yang dipunya mobil sport murah ini adalah head unit layar sentuh dengan konektivitas Android Auto dan Apple CarPlay, head up display, blind spot assist, keyless, active parking assist, dan auto AC."
            ),
            Mobilsport(
                R.drawable.cardview_05,
                nameMobilsport = "Honda Civiv Type R",
                descMobilsport = "Honda memberinya kapasitas 2.0 liter, empat silinder dengan teknologi VTEC dan Turbo. Alhasil di atas kertas torsinya bisa tembus 400 Nm pada 2.500 – 4.500 rpm dan tenaga maksimal 301 PS pada 6.500 rpm. Ada pula mode berkendara yang bisa dipilih sesuai kebutuhan, mulai dari comfort, sport, dan +R. Hadir pula cakram Brembo buat memaksimalkan pengereman. Soal kualitas, Honda Civic Type R telah membuktikan diri sebagai mobil berpenggerak roda depan tercepat di Sirkuit Nurburgring. Catatan waktunya mengelilingi satu lap adalah 7 menit, 43,80 detik. Bicara kenyamanan di dalam kabin, mobil Honda buas ini mempunyai head unit layar sentuh ukuran 7 inci yang bisa terkoneksi smartphone. Ada pula sistem navigasi Garmin. Kemudian audio steering switch, cruise control, dan Auto AC Dual Zone. Terkait keamanan, tersedia alarm dan immobilizer untuk mencegah maling. Sistem keselamatan mobil sport murah, Honda Civic Type R juga mantap. Ada vehicle stability assist (VSA), hill start assist (HSA), emergency stop signal (ESS), brake override system, aribags, dan line watch."
            ),
            Mobilsport(
                R.drawable.cardview_06,
                nameMobilsport = "BMW M3 Competition",
                descMobilsport = "Mobil sport murah lainnya yang bisa kamu pinang adalah BMW M3 Competition. Mobil yang rilis pada pertengahan tahun 2021 ini hadir dengan sederet kelebihan pada performa khas BMW M Series. Sedan 5 orang penumpang ini dibanderol dengan harga sekitar Rp 2,1 miliar off the road. Untuk mesinnya bisa melontarkan torsi 650 Nm pada 2.750 – 5.500 rpm dan tenaga maksimal 510 hp pada 6.250 rpm. Sementara untuk transmisi pakai BMW M Steptronic delapan-percepatan. Kalau diajak berakselerasi, BMW mengklaim dari posisi diam hingga 100 km/jam cuma dalam 3,9 detik."
            ),
            Mobilsport(
                R.drawable.cardview_07,
                nameMobilsport = "Mercedes-AMG CLA 45 S 4MATIC+ Coupe",
                descMobilsport = "hadir dengan menyodorkan performa luar biasa untuk penggemarnya di Indonesia. New Mercedes-AMG tersedia dengan mesin 2.0 liter 4 silinder turbocharger yang mampu menghasilkan tenaga sebesar 421 HP. Mobil sport ini mengusung teknologi AMG Speedshift DCT-8G yang diklaim memiliki perpindahan gigi yang sangat cepat. Di dukung dengan sistem all-wheel drive AMG Performance sedan ini mampu mendistribusikan tenaga ke roda bagian belakang secara selektif dengan traksi terbaik. Buktinya pabrikan asal negeri panser Jerman ini mampu menyelesaikan sprint dari nol hingga 100 km/jam dalam waktu 4 detik dengan kecepatan tertinggi yang mampu mencapai 270 km/jam. Sejak tahun lalu hingga saat ini, Mercedes-AMG CLA 45 S 4MATIC+ Coupe Terbaru telah tersedia di Indonesia, dipasarkan dengan harga off the road Rp 1,4 Miliar."
            ),
            Mobilsport(
                R.drawable.cardview_08,
                nameMobilsport = "Mini Countryman JCW",
                descMobilsport = "New Mini Countryman kali ini hadir sebagai generasi kedua yang memiliki desain terbaru dan sebagai kendaraan compact premium. Kendaraan MINI terbesar dan fleksibel ini juga telah dirakit di BMW Group Production Network 2, Gaya Motor, Jakarta. Nah Mini Countryman juga merilis versi JCW dibanderol Rp 1,5 miliar. Spek mesinnya sama dengan versi lainnya yakni berkapasitas 2.000cc,dan  sanggup memuntahkan tenaga sebesar 306 HP. Mini Countryman JCW juga mengusung mesin twin power turbo 4 silinder yang memiliki top speed hingga 250km/jam."
            ),
            Mobilsport(
                R.drawable.cardview_09,
                nameMobilsport = "Toyota GR Supra",
                descMobilsport = "Bicara mobil sport Toyota GR Supra juga patut dilirik. Mobil ini memiliki mesin dengan tipe B58 6 silinder, in-line type berkubikasi 2.988 cc. Tenaga maksimum yang dapat dikeluarkan oleh mobil ini adalah 387 ps pada 5.800-6.500 rpm. Torsi maksimumnya adalah 500 Nm pada 1.800-5.000 rpm. Mobil ini dilengkapi dengan transmisi otomatis delapan percepatan. Mobil ini memiliki dimensi panjang 4.380 mm, lebar 1.855 mm dan tinggi 1.290 mm. Wheelbase-nya sekitar 2.470 mm. Toyota GR Supra dapat dibeli dengan sistem spot order, harganya Rp 2,035 miliaran."
            ),
            Mobilsport(
                R.drawable.cardview_11,
                nameMobilsport = "BMW M1",
                descMobilsport = "Inilah mobil sport murah BMW yang paling terjangkau. BMW M135i  mengaplikasi mesin 2.000 cc 4 silinder TwinPower Turbo yang mampu menghasilkan tenaga 306 hp dengan torsi 450 Nm. Mobil yang dibanderol Rp 1,1 miliar itu diklaim sebagai BMW bermesin 4 silinder paling kuat. Moladin adalah platform mobil bekas berkualitas dan terpercaya. Sudah tersedia di 135 kota dengan 40.000 agen dan dealer, jadi kalau kamu mau beli mobil bekas di Moladin aja. Dapatkan pula info mobil bekas, review mobil bekas, dan mengetahui tips dan trik perawatan mobil dengan mengunjungi laman Moladin. (Diupdate oleh Tigor Sihombing)"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_mobil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MobilsportAdapter(this, mobilsportlist){
            val intent = Intent (this, DetailMobilsportActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}