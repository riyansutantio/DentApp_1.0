package com.example.dentapp.Halaman

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
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
import com.example.dentapp.Util.listpetunjuk
import com.example.dentapp.ui.DaftarColor
import com.example.dentapp.ui.gradbg
import com.example.dentapp.R
import com.example.dentapp.Util.lists

@ExperimentalFoundationApi
@Composable
fun PetunjukScreen(navController: NavController) = Box(
    modifier = Modifier
        .background(gradbg)
        .fillMaxSize()
) {
    Column {
        petunjukTitle()
        PetunjukSection(
            petunjuk = lists().petunjuklist
        )
    }
}

@Composable
fun petunjukTitle() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {
        Text(
            text = "Petunjuk",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 10.dp)
        )
    }
}

@ExperimentalFoundationApi
@Composable
fun PetunjukSection(petunjuk:List<listpetunjuk>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(1),
            contentPadding = PaddingValues(5.dp),
            modifier = Modifier
                .fillMaxHeight(),
            content = {
                items(petunjuk.size){
                    PetunjukItems(item = petunjuk[it])
                }
            }
        )
    }
}

@Composable
fun PetunjukItems(item: listpetunjuk) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DaftarColor)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Image(painter = painterResource(id = item.iconId), contentDescription = "Icon")
                Text(
                    text = item.namapetunjuk,
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = item.descpetunjuk,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = Color.White
                )
            }
        }
    }
}