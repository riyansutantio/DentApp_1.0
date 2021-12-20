package com.example.dentapp.Halaman

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.Util.Screen
import com.example.dentapp.Model.listgejala
import com.example.dentapp.Util.lists
import com.example.dentapp.ui.DaftarColor
import com.example.dentapp.ui.gradbg

@ExperimentalFoundationApi
@Composable
fun GejalaScreen(navController: NavController) = Box(
    modifier = Modifier
        .background(gradbg)
        .fillMaxSize()
) {
    Column {
        GejalaTitle(navController)
        GejalaSection(
            gejala = lists().gejalalist
        )
    }
}

@Composable
fun GejalaTitle(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
    ) {
        Row() {
            IconButton(
                modifier = Modifier.weight(1f),
                onClick = { navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)} }
            ) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
            }
            Text(
                text = "Daftar Gejala",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(bottom = 30.dp).weight(3f)
            )
        }
    }
}


@ExperimentalFoundationApi
@Composable
fun GejalaSection(gejala:List<listgejala>) {
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
                items(gejala.size){
                    gejalaitems(item = gejala[it])
                }
            }
        )
    }
}

@Composable
fun gejalaitems(item: listgejala) {
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
            Text(
                text = item.id + " - " + item.namagejala,
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
        }
    }
}










