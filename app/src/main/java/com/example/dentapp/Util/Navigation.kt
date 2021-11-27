package com.example.dentapp.Util

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dentapp.Halaman.*
import com.example.dentapp.WelcomeScreen
import com.example.dentapp.google.GoogleUserModel
import com.squareup.moshi.Moshi

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.AuthScreen.route){
        composable(route = Screen.AuthScreen.route){
            AuthScreen(navController)
        }
        composable(route = Destinations.Home){ backStackEntry ->
            val userJson = backStackEntry.arguments?.getString("user")

            val moshi = Moshi.Builder().build()
            val jsonAdapter = moshi.adapter(GoogleUserModel::class.java)
            val userObject = jsonAdapter.fromJson(userJson!!)

            WelcomeScreen(navController, userModel = userObject!!)
        }
        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController)
        }
        composable(route = Screen.SignUpScreen.route){
            SignUpScreen(navController)
        }
        composable(route = Screen.DiagnosisScreen.route){
            DiagnosisScreen(navController)
        }
        composable(route = Screen.GejalaScreen.route){
            GejalaScreen(navController)
        }
        composable(route = Screen.PenyakitScreen.route){
            PenyakitScreen(navController)
        }
        composable(route = Screen.PetunjukScreen.route){
            PetunjukScreen(navController)
        }
        composable(route = Screen.TentangScreen.route){
            TentangScreen(navController)
        }
    }
}

