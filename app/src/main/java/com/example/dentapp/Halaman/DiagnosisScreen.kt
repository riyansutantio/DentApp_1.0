package com.example.dentapp.Halaman

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dentapp.MainActivity
import com.example.dentapp.Util.Screen
import com.example.dentapp.Util.listpenyakit
import com.example.dentapp.Util.listpertayaan
import com.example.dentapp.Util.lists
import com.example.dentapp.ui.*

var cur = "Q01"
val ques:List<listpertayaan> = lists().pertanyaanlist
@Composable
fun DiagnosisScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(gradbg)
            .fillMaxSize()
    ) {
        Column {
            Title()
            Question(quest = ques,navController)
            if ("P" in cur) {
                ShowDiagnose(item = cur, navController)
            }
            if (cur == "SEHAT") {
                ShowDiagnose(item = cur, navController)
            }
        }
    }
}

@Composable
fun Title() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {
        Text(
            text = "Halaman Diagnosis",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 30.dp)
        )
    }
}

@Composable
fun Question(quest:List<listpertayaan>,navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {
        for (i in quest) {
            if (i.idpertanyaan == cur) {
                Pertanyaan(item = i, navController)
            }
        }
    }
}

@Composable
fun Pertanyaan(item:listpertayaan,navController: NavController) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Text(
                text = item.soal,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 80.dp)
            )
            Button(
                onClick = {
                    navController.navigate(Screen.DiagnosisScreen.route)
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(YesButton),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = "Ya",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
            Button(
                onClick = {
                    navController.navigate(Screen.DiagnosisScreen.route)
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(NoButton),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = "Tidak",
                    color = Color.White,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        Column() {
            Row(
            ) {
                Button(
                    onClick = {
                        navController.navigate(Screen.DiagnosisScreen.route){popUpTo(0)}
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(ResetButton),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(0.5f)
                ) {
                    Text(
                        text = "Reset Diagnosis",
                        color = Color.White,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
                Button(
                    onClick = {
                        navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)}
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(HomeButton),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(1f)
                ) {
                    Text(
                        text = "Home",
                        color = Color.White,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ShowDiagnose(item:String,navController: NavController) {
    val openDialog = remember { mutableStateOf(false)  }
    AlertDialog(
        modifier = Modifier.clip(RoundedCornerShape(15.dp)),
        onDismissRequest = { openDialog.value = false},
        title = {
            Text(
                fontSize = MaterialTheme.typography.h5.fontSize,
                textAlign = TextAlign.Center,
                text = "Hasil Diagnosis"
            )
        },
        text = {
            if (cur != "SEHAT") {
                Text(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    text = "Kemungkinan anda menderita ${item}"
                )
            } else {
                Text(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    text = "Kemungkinan anda ${cur}"
                )
            }
        },
        confirmButton = {
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {
                    openDialog.value = false
                    CurReturn()
                    navController.navigate(Screen.DiagnosisScreen.route){popUpTo(0)}
                }) {
                Text(fontSize = 15.sp,text = "Mengulang proses diagnosis?" )
            }
        },
        dismissButton = {
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {
                    openDialog.value = false
                    CurReturn()
                    navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)}
                }) {
                Text(fontSize = 15.sp,text = "Kembali ke menu utama")
            }
        }

    )
}

fun CurReturn(): String {
    var item = "Q01"
    cur = item
    return cur
}