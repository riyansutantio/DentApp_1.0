package com.example.dentapp.Halaman

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.ui.DaftarColor
import com.example.dentapp.ui.gradbg
import com.example.dentapp.Util.Screen
import com.example.dentapp.Model.listTentang
import com.example.dentapp.Util.lists

@ExperimentalFoundationApi
@Composable
fun TentangScreen(navController: NavController) = Box(
    modifier = Modifier
        .background(gradbg)
        .fillMaxSize()
) {
    Column {
        TentangTitle(navController)
        Tentangisi(lists().tentangList)
    }
}

@Composable
fun TentangTitle(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {
        Row() {
            IconButton(
                modifier = Modifier.weight(1f),
                onClick = { navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)} }
            ) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
            }
            Text(
                text = "Tentang",
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .weight(3f)
            )
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun Tentangisi(list:List<listTentang>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(1),
        contentPadding = PaddingValues(start = 7.dp,end = 7.dp,bottom = 10.dp),
        modifier = Modifier.fillMaxHeight(),
        content = {
            items(list.size){
                ListD(lists = list[it])
            }
        }
    )

}

@Composable
fun ListD(lists: listTentang) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DaftarColor)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Image(painter = painterResource(id = lists.iconId), contentDescription = "Icon")
                Text(
                    text = lists.appname,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = lists.desc1,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = lists.desc2,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = lists.desc3,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Text(
                    text = lists.desc4,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
        }
    }
}