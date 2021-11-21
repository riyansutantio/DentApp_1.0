package com.example.dentapp.Halaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.ui.DaftarColor
import com.example.dentapp.ui.gradbg
import com.example.dentapp.R

@Composable
fun TentangScreen(navController: NavController) = Box(
    modifier = Modifier
        .background(gradbg)
        .fillMaxSize()
) {
    Column {
        tentangTitle()
        tentangisi()
    }
}

@Composable
fun tentangTitle() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {
        Text(
            text = "Pesan dari Pengembang",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 10.dp)
        )
    }
}

@Composable
fun tentangisi() {
    Surface(
        elevation = 10.dp,
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(DaftarColor)
                .clip(RoundedCornerShape(10.dp))
                .padding(7.5.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Image(painter = painterResource(id = R.mipmap.logoapp), contentDescription = "Logo")
                Text(
                    text = "DentApp",
                    style = MaterialTheme.typography.h4,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
                Text(
                    text = "Aplikasi ini digunakan untuk memberikan pencerdasan kepada masyarakat tentang pentingnya kesehatan gigi dan mulut dengan memberikan informasi penyakit, gejala, dan informasi detail penyakit serta memiliki fungsi utama sebagai alat mendiagnosa kemungkinan penyakit gigi dan mulut.\n"+
                            "\nPerlu diketahui bahwa sumber pengetahuan mengenai penyakit gigi dan mulut didapatkan dari proses wawancara dengan dokter gigi.",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.White,
                )
                Text(
                    text = "PERHATIAN!!",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                )
                Text(
                    text = "Fungsi diagnosa penyakit gigi dan mulut pada aplikasi ini tidak 100% akurat. Namun, terdapat usaha dalam pengembangan aplikasi ini dapat berffungsi semaksimal mungkin dalam memberikan informasi, mohon digunakan dengan bijak.\n"+
                            "\nPihak pengembang mempersilahkan pengguna untuk memberi saran dan kritikan melalui kontra email pengembang. mohon maaf yang sebesar-besarnya bila terdapat tutur kata yang kurang baik dalam aplikasi ini.",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.White,
                )
                Text(
                    text = "Terimakasih, \n" +
                            "Pengembang.\n\n"+"Riyan Sutantio Bangkit Nugroho\n" +
                            "Riyantio84@gmail.com",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.White,
                )
            }
        }
    }
}