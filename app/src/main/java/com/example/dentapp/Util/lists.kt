package com.example.dentapp.Util

import com.example.dentapp.R
import com.example.dentapp.ui.*

class lists {
    val penyakitllist: List<listpenyakit> =listOf(
        listpenyakit(
            id = "P01",
            namaPenyakit = "Karies Gigi",
            deskripsi = "Proses remineralisasi dan demineraslisasi mineral-mineral penyusun "+
                    "gigi serta ketidakseimbangan antara penyusunan dan pembuangan mineral gigi.",
            gejala = "G01 - Sakit gigi \n" +
                    "G02 - Gigi terasa ngilu \n" +
                    "G03  - Sakit gigi sampai pusing",
            penyebab = "makanan yang manis, lengket, berkarbohidrat, makanan asam  dan  mengosok "+
                    "gigi dengan metode dan frekuensi yang salah.",
            penanganan = "Berkumur dengan air garam dan meminum obat penahan nyeri (ponstan, paracetamol, dll)",
            pencegahan = "Sikat gigi teratur serta menggunakan metode dan frekuensi yang baik.",
            perawatan = "Pembersihan gigi, penambalan gigi dan perawatan saluran akar gigi."
        ),
        listpenyakit(
            id = "P02",
            namaPenyakit = "Karang Gigi",
            deskripsi = "Pengerasan sisa makanan dan bakteri yang tersisa/menempel pada permukaan gigi.",
            gejala = "G04 - Gigi terasa kotor  \n" +
                    "G05 - Berdarah ketika menyikat gigi",
            penyebab = "Cara gosok gigi yang tidak tepat.",
            penanganan = "Tidak ada penanganan pertama oleh pasien. Karang gigi tidak boleh dicongkel-congkel "+
                    "sendiri serta tidak boleh membeli obat-obatan kimia yang tidak disarankan dokter gigi.",
            pencegahan = "Menggosokgigi dengan frekuensi dan teknik yang tepat.",
            perawatan = "Scaling dan root Planning (Pembersihan karang gigi)."
        ),
        listpenyakit(
            id = "P03",
            namaPenyakit = "Gingivitis",
            deskripsi = "Gusi mengalami pembengkakan/peradangan yang disebabkan oleh sisa makanan "+
                    "yang mengeras/Karang gigi dan bakteri.",
            gejala = "G05 - Berdarah ketika menyikat gigi   \n" +
                    "G07 - Gusi mengalami pembekakan  \n"+
                    "G08 - Gusi terasa saki",
            penyebab = "Gingivitis disebabkan oleh bakteri/ karang gigi.",
            penanganan = "Meminum obat anti radang",
            pencegahan = "Menggosokgigi dengan frekuensi dan teknik yang tepat.",
            perawatan = "Scaling dan root Planning (Pembersihan karang gigi) dab pemberian "+
                    "obat-obatan anti raadang, antibiotik, sampai operasi gusi."
        ),
        listpenyakit(
            id = "P04",
            namaPenyakit = "Periodontitis",
            deskripsi = "Peradangan pada jaringan penyokong gigi.",
            gejala = "G09 - Gigi terasa ngilu yang menyebar   \n" +
                    "G10 - Gigi terasa ngilu saat mengunyah  \n"+
                    "G11 - Gigi goyah \n"+
                    "G12 - Gigi terlihat memanjang",
            penyebab = "Trauma gigitan, Tambalan berlebih, usia lanjut, karang gigi, karies gigi.",
            penanganan = "Meminum obat penahan nyeri dan anti radang",
            pencegahan = "Menggosokgigi dengan frekuensi dan teknik yang tepat dan scaling teratur setidaknya 6 bulan sekali.",
            perawatan = "Scaling dan root Planning (Pembersihan karang gigi) serta pemberian obat-obatan."
        ),
        listpenyakit(
            id = "P05",
            namaPenyakit = "Abses Periodontal",
            deskripsi = "Keluarnya nanah yang disebabkan oleh infeksi di daerah sekitar gigi.",
            gejala = "G09 - Gigi terasa ngilu yang menyebar \n" +
                    "G10 - Gigi terasa ngilu saat mengunyah \n"+
                    "G11 - Gigi goyah",
            penyebab = "Trauma gigitan, Tambalan berlebih, usia lanjut, karang gigi, karies gigi.",
            penanganan = "Meminum obat penahan nyeri dan anti radang",
            pencegahan = "Menggosokgigi dengan frekuensi dan teknik yang tepat dan scaling teratur setidaknya 6 bulan sekali.",
            perawatan = "Scaling dan root Planning (Pembersihan karang gigi) serta pemberian obat-obatan antibiotik."
        ),
        listpenyakit(
            id = "P06",
            namaPenyakit = "Abses Apikal",
            deskripsi = "Disebabkan oleh bakteri karies yang menginfeksi sampai ke saraf gigi (pasti disertai dengan gigi berlubang).",
            gejala = "G10 - Gigi terasa ngilu saat mengunyah\n" +
                    "G13 - Sakit yang terlokalisir (spesifik ke tempat tertentu)\n"+
                    "G14 - Gigi terasa pegal \n" +
                    "G15 - Gigi terasa sakit walaupun sudah ditambal",
            penyebab = "meminum obat penahan nyeri.",
            penanganan = "meminum obat penahan nyeri.",
            pencegahan = "Menggosokgigi dengan frekuensi dan teknik yang tepat.",
            perawatan = "Scaling dan root Planning (Pembersihan karang gigi) serta pemberian obat-obatan."
        ),
        listpenyakit(
            id = "P07",
            namaPenyakit = "Kanker Mulut",
            deskripsi = "Kondisi keganasan/ jaringan asing yang tidak seharusnya berkembang di dalam mulut. ",
            gejala = "G16 - Sariawan terjadi terus menerus   \n" +
                    "G17 - Berat badan menurun \n"+
                    "G18 - Muncul benjolan di daerah mulut" ,
            penyebab = "Merokok, jarang kontrol ke dokter gigi, mengunyah sirih, obat-obatan/benda-benda karsinogenik.",
            penanganan = "Disarankan untuk langsung ke dokter gigi.",
            pencegahan = "Tidak merokok, mengindari bahan karsinogenik, dan kontrol teratur ke dokter gigi karena "+
                    "kanker gigi sebagian banyak tidak terdeteksi/tanpa gejala.",
            perawatan = "Pengobatan dan pembedahan kanker."
        ),
        listpenyakit(
            id = "P08",
            namaPenyakit = "Abrasi Gigi",
            deskripsi = "Terkikirnya bagian gigi yang berdekatan dengan gusi.",
            gejala = "G19 - Gigi terasa ngilu saat minum-minuman panas/dingin" ,
            penyebab = "Cara menggosok gigi yang salah/terlalu keras sehingga terkikisnya gigi.",
            penanganan = "Mengubah cara dan frekuensi menggosok gigi.",
            pencegahan = "Kontrol teratur ke dokter gigi.",
            perawatan = "Penambalan gigi  serta memperbaiki metode dan frekuensi menggosok gigi."
        ),
        listpenyakit(
            id = "P09",
            namaPenyakit = "Gangguan Gigi Bungsu",
            deskripsi = "Nyeri yang disebabkan oleh pertumbuhan gigi bungsu.",
            gejala = "G20 - Terasa sakit yang tajam di daerah belakang gigi(dekat rahang belakang) \n" +
                    "G21 - Gigi terasa sakit hingga ke mata/telinga\n"+
                    "G22 - Migrain \n"+
                    "G23 - Sakit gigi diusia gigi bungsu tumbuh (18-25 tahun)",
            penyebab = "Tumbuhnya gigi bungsu yang mendesak posisi gigi sebelahnya.",
            penanganan = "Meminum obat analgetik.",
            pencegahan = "Rajin kontrol ke dokter gigi sehingga dapat terdiagnosa lebih awal.",
            perawatan = "pengobatan dan operasi pencabutan gigi."
        ),
        listpenyakit(
            id = "P10",
            namaPenyakit = "Halitosis",
            deskripsi = "Bau mulut yang mengganggu.",
            gejala = "G06 - Bau mulut \n" +
                    "G24 - Sakit perut",
            penyebab = "dapat disebabkan oleh faktor dalam mulut (karang gigi dan bakteri karies),"+
                    " faktor dalam tubuh (sakit lambung, dan ginjal).",
            penanganan = "faktor dalam mulut = boleh menggunakan obat kumur dengan sayarat sesuai dengan anjuran "+
                    "dokter gigi dan tidak boleh digunakan lebih dari 2 minggu.\n" +
                    "faktor dalam tubuh = jika bau mulut tidak dari dalam mulut, kemungkinan "+
                    "disebabkan oleh lambung dan ginjal dan segera ke dokter spesialis penyakit dalam.",
            pencegahan = "Kontrol ke dokter gigi dan perubahan metode gosok gigi.",
            perawatan = "Mengilangkan/menyebuhkan faktor penyebab dan pengobatan."
        )
    )
    val gejalalist: List<listgejala> = listOf(
        listgejala(
            id = "G01",
            namagejala = "Sakit Gigi"
        ),
        listgejala(
            id = "G02",
            namagejala = "Gigi Terasa Ngilu"
        ),
        listgejala(
            id = "G03",
            namagejala = "Sakit Gigi Sampai Pusing "
        ),
        listgejala(
            id = "G04",
            namagejala = "Gigi Terasa Kotor"
        ),
        listgejala(
            id = "P05",
            namagejala = "Berdarah Ketika Menyikat Gigi"
        ),
        listgejala(
            id = "G06",
            namagejala = "Bau Mulut"
        ),
        listgejala(
            id = "G07",
            namagejala = "Gusi Mengalami Pembengkakan"
        ),
        listgejala(
            id = "G08",
            namagejala = "Gusi Terasa Sakit"
        ),
        listgejala(
            id = "G09",
            namagejala = "Gigi Terasa Ngilu Yang Menyebar"
        ),
        listgejala(
            id = "G10",
            namagejala = "Gigi Terasa Ngilu Saat Mengunyah"
        ),
        listgejala(
            id = "G11",
            namagejala = "Gigi Goyah"
        ),
        listgejala(
            id = "G12",
            namagejala = "Gigi Terlihat Memanjang"
        ),
        listgejala(
            id = "G13",
            namagejala = "Sakit Yang Terlokalisir"
        ),
        listgejala(
            id = "G14",
            namagejala = "Gigi Terasa Pegal"
        ),
        listgejala(
            id = "G15",
            namagejala = "Gigi Terasa Sakit Walaupun Sudah Ditambal"
        ),
        listgejala(
            id = "G16",
            namagejala = "Sariawan Terjadi Terus Menerus"
        ),
        listgejala(
            id = "G17",
            namagejala = "Berat Badan Menurun"
        ),
        listgejala(
            id = "G18",
            namagejala = "Muncul benjolan Di Mulut"
        ),
        listgejala(
            id = "G19",
            namagejala = "Gigi Ngilu Saat Minum Minuman Dingin/Panas"
        ),
        listgejala(
            id = "G20",
            namagejala = "Terasa Sakit Yang Tajam Pada Gigi Belakang"
        ),
        listgejala(
            id = "G21",
            namagejala = "Gigi Sakit Hingga Merambat Ke Telinga/Mata"
        ),
        listgejala(
            id = "G22",
            namagejala = "Migrain"
        ),
        listgejala(
            id = "G23",
            namagejala = "Gigi Sakit Ketika Usia 18-25 Tahun"
        ),
        listgejala(
            id = "G24",
            namagejala = "Sakit Perut"
        )
    )
    val petunjuklist: List<listpetunjuk> = listOf(
        listpetunjuk(
            id = "Pt01",
            namapetunjuk = "Diagnosis",
            descpetunjuk = "Menu Diagnosis pada halaman utama berfungsi untuk memulai diagnosa. Anda diminta untuk menjawab beebrapa pertanyaan yang akan ditampilkan hanya dengan tombol 'Ya' atau 'Tidak'. Kemudian sistem akan mengolah dan menampilkan hasil perkiraan diagnosis dari jawaban anda. ",
            iconId = R.mipmap.ic_diagnosis
        ),
        listpetunjuk(
            id = "Pt02",
            namapetunjuk = "Daftar Penyakit",
            descpetunjuk = "Menu Daftar Penyakit pada halaman utama berfungsi untuk menampilkan daftar penyakit pada sistem ini, serta menampilkan informasi detail dari penyakit",
            iconId = R.mipmap.ic_penyakit
        ),
        listpetunjuk(
            id = "Pt03",
            namapetunjuk = "Daftar Gejala",
            descpetunjuk = "Menu Daftar Gejala pada halaman utama berfungsi untuk menampilkan daftar gejala penyakit gigi dan mulut",
            iconId = R.mipmap.ic_gejala
        ),
        listpetunjuk(
            id = "Pt04",
            namapetunjuk = "Tentang",
            descpetunjuk = "Menu Tentang pada halaman utama berfungsi untuk menampilkan informasi terkait aplikasi",
            iconId = R.mipmap.ic_tentang
        ),
    )
    val menulist: List<featured> = listOf(
        featured(
            id = "DP",
            title = "Daftar Penyakit",
            R.mipmap.ic_penyakit,
            BlueViolet1,
            BlueViolet2,
            BlueViolet3
        ), featured(
            id = "DG",
            title = "Daftar Gejala",
            R.mipmap.ic_gejala,
            LightGreen1,
            LightGreen2,
            LightGreen3
        ), featured(
            id = "P",
            title = "Petunjuk",
            R.mipmap.ic_petunjuk,
            OrangeYellow3,
            OrangeYellow2,
            OrangeYellow1
        ), featured(
            id = "T",
            title = "Tentang",
            R.mipmap.ic_tentang,
            Beige1,
            Beige2,
            Beige3
        )
    )
    val pertanyaanlist: List<listpertayaan> =listOf(
        listpertayaan(
            idpertanyaan = "Q01",
            soal = "Apakah gigi anda terasa ngilu saat mengunyah?",
            jawaban1 = "Q02",
            jawaban0 = "Q05"
        ),
        listpertayaan(
            idpertanyaan = "Q02",
            soal = "Apakah gigi anda terasa ngilu yang menyebar?",
            jawaban1 = "Q03",
            jawaban0 = "Q04"
        ),
        listpertayaan(
            idpertanyaan = "Q03",
            soal = "Apakah gigi anda terlihat memanjang pada beberapa/salah satu gigi?",
            jawaban1 = "Penyakit Periodontitis",
            jawaban0 = "Penyakit Abses Periodontal"
        ),
        listpertayaan(
            idpertanyaan = "Q04",
            soal = "Apakah anda merasakan rasa sakit yang terlokalisisr/terpusat dan " +
                    "merasakan pegal pada gigi?",
            jawaban1 = "Penyakit Abses Apikal",
            jawaban0 = "Penyakit Periodontitis atau Abses Periodontal atau Abses Apikal"
        ),
        listpertayaan(
            idpertanyaan = "Q05",
            soal = "Apakah gigi anda pernah berdarah ketika menggosok gigi?",
            jawaban1 = "Q06",
            jawaban0 = "Q08"
        ),
        listpertayaan(
            idpertanyaan = "Q06",
            soal = "Apakah gigi anda terasa kotor?",
            jawaban1 = "Penyakit Karang Gigi",
            jawaban0 = "Q07"
        ),
        listpertayaan(
            idpertanyaan = "Q07",
            soal = "Apakah gusi anda mengalami pembekakan dan terasa sakit?",
            jawaban1 = "Penyakit Gingivitis",
            jawaban0 = "Penyakit Karang Gigi atau Gingivitis"
        ),
        listpertayaan(
            idpertanyaan = "Q08",
            soal = "Apakah anda merasakan gigi ngilu dan sakit gigi sampai sakit kepala?",
            jawaban1 = "Penyakit Karies Gigi",
            jawaban0 = "Q09"
        ),
        listpertayaan(
            idpertanyaan = "Q09",
            soal = "Apakah anda mengalami sakit perut dan bau mulut?",
            jawaban1 = "Penyakit Halitosis",
            jawaban0 = "Q10"
        ),
        listpertayaan(
            idpertanyaan = "Q10",
            soal = "Apakah anda mengalami sariawan terus menerus dan muncul benjolan di " +
                    "daerah mulut?",
            jawaban1 = "Penyakit Kanker Mulut",
            jawaban0 = "Q11"
        ),
        listpertayaan(
            idpertanyaan = "Q11",
            soal = "Apakah anda merasakan rasa sakit yang tajam pada gigi belakang/sampai " +
                    "telinga dan mengalami migrain?",
            jawaban1 = "Penyakit Gangguan Gigi Bungsu",
            jawaban0 = "Q12"
        ),
        listpertayaan(
            idpertanyaan = "Q12",
            soal = "Apakah Anda merasakan ngilu saat minum minuman dingin/panas?",
            jawaban1 = "Penyakit Abrasi Gigi",
            jawaban0 = "SEHAT"
        )
    )
}