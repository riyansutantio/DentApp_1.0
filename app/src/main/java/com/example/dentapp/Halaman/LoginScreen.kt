package com.example.dentapp.Halaman

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dentapp.Util.Screen
import com.example.dentapp.ui.YesButton
import com.example.dentapp.ui.gradbg

@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(gradbg)
            .fillMaxSize()
            .padding(20.dp)
    ){
        Column {
            TitleLogin()
            LoginForm(navController)
        }
    }
}

@Composable
fun TitleLogin() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {
        Text(
            text = "Halaman Login",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(start = 10.dp,top = 10.dp,bottom = 30.dp)
        )
    }
}


@Composable
fun LoginForm(navController: NavController) {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(start = 20.dp,top = 50.dp,end = 20.dp,bottom = 10.dp)

    ) {
        EmailTextField()
        PassTextField()
        Button(
            modifier = Modifier
                .background(YesButton)
                .fillMaxWidth(),
            onClick = {
                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()//diubah buat login
                navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)}
            }
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(5.dp)
            )
        }
        Text(
            text = "Lanjutkan Sebagai Guest",
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.WelcomeScreen.route){popUpTo(0)}
                },
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
    }
}
@Composable
fun EmailTextField() {
    var texts by remember { mutableStateOf("") }
    val invalidInput = '@' !in texts
    Box(
        modifier = Modifier
            .padding(horizontal = 10.dp).fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = texts,
                onValueChange = { texts = it},
                placeholder = {
                    Text(text = "Input Email")
                },
                label = {
                    val label = if (invalidInput)"Email*" else "Email"
                    Text(label)
                },
                isError = invalidInput ,
                leadingIcon = { Icon(imageVector = Icons.Filled.Email, contentDescription = "iconEmail" )},
            )
            val textColor = if (invalidInput) {
                MaterialTheme.colors.error
            }else{
                MaterialTheme.colors.onSurface
            }
            Text(
                text = if (invalidInput) "Requires '@' in email" else "Helper message",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.caption.copy(color = textColor)
            )

        }
    }
}

@Composable
fun PassTextField() {
    var texts by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .padding(horizontal = 10.dp).fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = texts,
                onValueChange = { texts = it},
                placeholder = {
                    Text(text = "Input Password")
                },
                label = {
                    Text(text = "Password")
                },
                leadingIcon = { Icon(imageVector = Icons.Filled.Lock, contentDescription = "iconLock" )},
            )
            Text(
                text = if (texts.count() < 8) "Password lenght must over 8 " else "Helper message",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.caption.copy(color = MaterialTheme.colors.onSurface)
            )

        }
    }
}
