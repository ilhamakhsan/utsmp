package com.ilhamakhsan.utsmpku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ilhamakhsan.utsmpku.adapter.ImageAdapter
import kotlinx.android.synthetic.main.activity_tentang.*

class BeritaActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Berita"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        val imageList = listOf<Image>(
            Image(
                R.drawable.berita1,
                "Puan Akui Matikan Mik Politikus Demokrat di Rapur Omnibus Law",
                "Jakarta - Ketua DPR RI Puan Maharani angkat bicara soal insiden dalam Rapat Paripurna DPR RI pada 5 Oktober 2020. Ia mengakui mematikan mikrofon lewat alat yang ada di hadapannya ketika itu."
            ),
            Image(
                R.drawable.berita2,
                "Rizieq Shihab, Suntikan Energi Baru Oposisi Kritik Pemerintah ",
                "Terlebih, petinggi PKS sudah menyatakan dukungan terhadap rencana revolusi akhlak yang digalang Rizieq.\n" +
                        "\n" +
                        "Menurut Adi, gelagat para tokoh politik yang mendatangi kediaman Rizieq itu membuktikan bahwa oposisi memang memiliki hubungan erat dengan petinggi FPI tersebut.\n" +
                        "\n" +
                        "Adi menilai Rizieq adalah sosok yang mampu mempengaruhi dinamika politik di tanah air. Tak lepas dari perangainya yang agresif atau menyerang suatu pihak secara terang-terangan. "
            ),
            Image(
                R.drawable.berita3,
                "PKS Nilai Partai Politik Terlalu Kecil untuk Habib Rizieq ",
                "Jakarta -\n" +
                        "\n" +
                        "Partai Keadilan Sejahtera (PKS) menyebut Habib Rizieq Syihab terlalu besar untuk masuk partai politik. PKS merasa Rizieq lebih cocok sebagai figur nasional.\n" +
                        "\n" +
                        "\"Ya Habib Rizieq kan sudah menjadi tokoh umat. Jadi kalau beliau berkiprah langsung di partai, ya terlalu kecil ya,\" kata Syaikhu, di Jalan Petamburan III, Tanah Abang, Jakpus, Rabu (11/11/2020).."
            ),
            Image(
                R.drawable.berita4,
                "Pimpinan KPK ke Calon Kepala Daerah: Kalau Mau Mewah Jadi Selebriti Saja!",
                "Jakarta - Para calon kepala daerah yang akan berlaga dalam Pilkada Serentak 2020 mendapatkan wejangan dari pimpinan KPK. Mereka diingatkan untuk menjadi pejabat yang benar-benar melayani rakyat.\n" +
                        "Dalam webinar pembekalan pilkada yang disiarkan kanal YouTube KPK, Wakil Ketua KPK Nurul Ghufron menjelaskan menjadi pejabat bukan ajang untuk meningkatkan harta kekayaan pribadi. Terlebih, menurut Ghufron, cara-cara seperti korupsi yang sudah terbukti tidak hanya merugikan diri sendiri."
            ),
            Image(
                R.drawable.berita5,
                "Jakarta Amburadul? Jangan Ngaco Ah!",
                "MUDANEWS.COM – Amburadul! Begitu kata ketua umum PDIP, Megawati dalam menilai Kota Jakarta. Satu alasannya, karena research Universitas Negeri Jakarta (UNJ) tidak menempatkan Jakarta sebagai tiga besar city of intellectual.\n" +
                        "\n" +
                        "Menurut research UNJ, ada tiga kota yang meraih nilai tertinggi dalam city of intellectual, yaitu Semarang, Solo dan Surabaya. Ketiga kota itu dipimpin oleh Wali Kota dari PDIP.."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
