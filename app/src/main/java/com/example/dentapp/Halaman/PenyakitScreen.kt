package com.example.dentapp.Halaman

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.Util.listpenyakit
import com.example.dentapp.Util.lists
import com.example.dentapp.ui.DaftarColor
import com.example.dentapp.ui.gradbg

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun PenyakitScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(gradbg)
            .fillMaxSize()
    ) {
        Column {
            PenyakitTitle()
            PenyakitSection(
                penyakit = lists().penyakitllist
            )
        }
    }
}
@Composable
fun PenyakitTitle() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
    ) {
        Text(
            text = "Daftar Penyakit",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 20.dp)
        )
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun PenyakitSection(penyakit: List<listpenyakit>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(1),
            contentPadding = PaddingValues(5.dp),
            modifier = Modifier.fillMaxHeight(),
            content = {
                items(penyakit.size) {
                    Penyakititems(item = penyakit[it])
                }
            }
        )
    }
}

@ExperimentalMaterialApi
@Composable
fun Penyakititems(item: listpenyakit) {
    var expandableState by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(
        targetValue =
        if (expandableState) 180f
        else 0f
    )
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .background(DaftarColor)
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            onClick = {
                expandableState = !expandableState
            }
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = item.id + " - " + item.namaPenyakit,
                        fontSize = 25.sp,
                        color = Color.White,
                        textAlign = TextAlign.Left,
                        modifier = Modifier
                            .background(DaftarColor)
                            .padding(5.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .weight(6f)
                    )
                    Button(
                        modifier = Modifier
                            .weight(1f)
                            .rotate(rotation),
                        onClick = {expandableState = !expandableState}) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "arrow")
                    }
                }
                if(expandableState){
                    Text(
                        text = "\nDeskripsi :",
                        fontSize = 25.sp
                    )
                    Text(
                        text = item.deskripsi,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "\nGejala :",
                        fontSize = 25.sp
                    )
                    Text(
                        text = item.gejala,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "\nPenyebab Penyakit :",
                        fontSize = 25.sp
                    )
                    Text(
                        text = item.penyebab,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "\nPenanganan Pertama Oleh Pasien :",
                        fontSize = 25.sp
                    )
                    Text(
                        text = item.penanganan,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "\nLangkah Pencegahan :",
                        fontSize = 25.sp
                    )
                    Text(
                        text = item.pencegahan,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "\nPerawatan Oleh Dokter :",
                        fontSize = 25.sp
                    )
                    Text(
                        text =  item.perawatan,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}








