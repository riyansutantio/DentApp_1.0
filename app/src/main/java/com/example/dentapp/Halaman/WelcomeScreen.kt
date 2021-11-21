package com.example.dentapp

import  androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.Util.Screen
import com.example.dentapp.Util.featured
import com.example.dentapp.Util.lists
import com.example.dentapp.Util.standardQuadFromTo
import com.example.dentapp.ui.*

@ExperimentalFoundationApi
@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(gradbg)
            .fillMaxSize()
            .padding(start = 5.dp, end = 5.dp, bottom = 5.dp, top = 20.dp)
    ) {
        Column {
            GreetingSection(navController)
            MainMenu(navController)
            FeatureSection(
                features = lists().menulist,navController)
        }
    }
}

@Composable
fun GreetingSection(navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp, top = 20.dp, bottom = 15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Welcome",
                style = MaterialTheme.typography.h3
            )
            Text(
                text = "To DentApp",
                style = MaterialTheme.typography.h6
            )
        }
        Button(
            modifier = Modifier
                .padding(5.dp),
            onClick = {
                navController.navigate(Screen.LoginScreen.route){popUpTo(0)}
            }
        ) {
            Text(text = "Logout")
        }
    }
}

@Composable
fun ChipSection(chips: List<String>) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ){
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}

@Composable
fun MainMenu(navController: NavController) {
    Surface(
        elevation = 10.dp,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(LightRed)
                .padding(horizontal = 15.dp, vertical = 20.dp)
                .fillMaxWidth()
                .clickable {
                    navController.navigate(Screen.DiagnosisScreen.route)
                }
        ){
            Column(
            ) {
                Text(
                    text = "Diagnosis",
                    style = MaterialTheme.typography.h4
                )
                Text(
                    text = "Tekan Untuk Memulai Diagnosis",
                    style = MaterialTheme.typography.body1,
                    color = TextWhite
                )
            }
            Button(
                onClick =  {
                    navController.navigate(Screen.DiagnosisScreen.route)
                },
                modifier = Modifier
                    .padding(10.dp)
            ){
                Image(painter = painterResource(id = R.mipmap.ic_diagnosis), contentDescription ="Menu Gejala" )
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun FeatureSection(features: List<featured>,navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Featured",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(15.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.dp,end = 7.dp,bottom = 10.dp),
            modifier = Modifier.fillMaxHeight(),
            content = {
                items(features.size){
                    FeaturedItems(feature = features[it],navController)
                }
            }
        )
    }
}


@ExperimentalFoundationApi
@Composable
fun FeaturedItems(feature: featured,navController: NavController) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor),
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        //medium color path
        val mediumColoredPath1 = Offset(0f, height * 0.3f)
        val mediumColoredPath2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPath3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPath4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPath5 = Offset(width * 1.4f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPath1.x, mediumColoredPath1.y)
            standardQuadFromTo(mediumColoredPath1, mediumColoredPath2)
            standardQuadFromTo(mediumColoredPath2, mediumColoredPath3)
            standardQuadFromTo(mediumColoredPath3, mediumColoredPath4)
            standardQuadFromTo(mediumColoredPath4, mediumColoredPath5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        //light color path
        val lightColoredPath1 = Offset(0f, height * 0.35f)
        val lightColoredPath2 = Offset(width * 0.1f, height * 0.4f)
        val lightColoredPath3 = Offset(width * 0.3f, height * 0.35f)
        val lightColoredPath4 = Offset(width * 0.65f, height.toFloat())
        val lightColoredPath5 = Offset(width * 1.4f, -height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(mediumColoredPath1.x, mediumColoredPath1.y)
            standardQuadFromTo(lightColoredPath1, lightColoredPath2)
            standardQuadFromTo(lightColoredPath2, lightColoredPath3)
            standardQuadFromTo(lightColoredPath3, lightColoredPath4)
            standardQuadFromTo(lightColoredPath4, lightColoredPath5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(
                path = mediumColoredPath,
                color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath,
                color = feature.lightColor
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text(
                text = feature.title,
                style = MaterialTheme.typography.h4,
                lineHeight = 25.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )
            Image(
                painter = painterResource(id = feature.iconId),
                contentDescription = feature.title,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = "Start",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        when (feature.id) {
                            "DG" -> navController.navigate(Screen.GejalaScreen.route)
                            "DP" -> navController.navigate(Screen.PenyakitScreen.route)
                            "P" -> navController.navigate(Screen.PetunjukScreen.route)
                            "T" -> navController.navigate(Screen.TentangScreen.route)
                        }
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 5.dp, horizontal = 10.dp)
            )
        }
    }
}












