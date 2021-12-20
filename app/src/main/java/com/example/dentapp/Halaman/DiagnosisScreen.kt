package com.example.dentapp.Halaman

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Restore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.dentapp.Model.listpertayaan
import com.example.dentapp.Util.*
import com.example.dentapp.ui.*

var cur = "Q01"
val ques:List<listpertayaan> = lists().pertanyaanlist
private const val TAG = "DiagnosisActivity"
@Composable
fun DiagnosisScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(gradbg)
            .fillMaxSize()
    ) {
        Column {
            Title(navController)
            Question(quest = ques,navController)
            if ("P" in cur) {
                ShowDiagnose(item = cur, navController)
                Log.d(TAG,"Kemungkinan Penyakit diketahui $cur")

            }
            if (cur == "SEHAT") {
                ShowDiagnose(item = cur, navController)
                Log.d(TAG,"Kemungkinan User $cur")
            }
        }
    }
}

@Composable
fun Title(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 30.dp, end = 30.dp, bottom = 30.dp)
        ) {
            IconButton(
                modifier = Modifier.weight(1f),
                onClick = { navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)} }
            ) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
            }
            Text(
                text = "Diagnosis",
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
                    .weight(3f)
            )
        }
    }
}

@Composable
fun Disclaimer(navController: NavController) {
    var dialogState by remember { mutableStateOf(false) }
    Row() {
        Button(
            onClick = {
                val awal = "Q01"
                cur = awal
                navController.navigate(Screen.DiagnosisScreen.route){popUpTo(0)}
                Log.d(TAG,"Restart Diagnosis")
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(ResetButton),
            modifier = Modifier
                .padding(10.dp)
                .weight(1f)
        ) {
            Icon(imageVector = Icons.Filled.Restore,contentDescription ="reset", tint = Color.White)
        }
        Button(
            modifier = Modifier
                .padding(10.dp)
                .weight(1f),
            shape = RoundedCornerShape(10.dp),
            onClick = { dialogState = true },
            colors = ButtonDefaults.buttonColors(ResetButton)
        ) {
            Text(
                text = "Alert",
                color = Color.White,
                fontSize = 20.sp
            )
        }
        if (dialogState) {
            AlertDialog(
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                title = {
                    Text(
                        fontSize = MaterialTheme.typography.h5.fontSize,
                        textAlign = TextAlign.Center,
                        text = "!!ALERT!!"
                    )
                },
                onDismissRequest = {
                    dialogState = false
                },
                text = {
                    Text(
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        text = "Hasil diagnosis akan direkam untuk kepentingan pengumpulan data " +
                                "dan Data pribadi anda akan dirahasiakan"
                    )
                },
                confirmButton = {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(HomeButton),
                        onClick = {
                            dialogState = false
                        }) {
                        Text(fontSize = 15.sp, text = "Saya Paham dan Saya Mengerti",color = Color.White,)
                    }
                }
            )
        }
    }
}

@Composable
fun Question(quest:List<listpertayaan>, navController: NavController) {
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
fun Pertanyaan(item: listpertayaan, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = item.soal,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 50.dp)
        )
        Row(){
            Button(
                onClick = {
                    cur = item.jawaban1
                    navController.navigate(Screen.DiagnosisScreen.route)
                    Log.d(TAG,"Diagnosa Pilihan $cur")
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(YesButton),
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
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
                    cur = item.jawaban0
                    navController.navigate(Screen.DiagnosisScreen.route)
                    Log.d(TAG,"Diagnosa Pilihan $cur")
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(NoButton),
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Tidak",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        Disclaimer(navController)
    }
}


@Composable
fun ShowDiagnose(item:String,navController: NavController) {
    val openDialog = remember { mutableStateOf(false)}
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
                    text = "Kemungkinan anda menderita $item"
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
                    insertIntoDatabase(cur)
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
                    insertIntoDatabase(cur)
                    openDialog.value = false
                    CurReturn()
                    navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)}
                }) {
                Text(fontSize = 15.sp,text = "Halaman Utama")
            }
        }
    )
}
fun CurReturn(): String {
    val item = "Q01"
    cur = item
    return cur
}