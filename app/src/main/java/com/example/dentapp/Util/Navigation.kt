package com.example.dentapp.Util

import android.os.Handler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dentapp.Halaman.*
import com.example.dentapp.WelcomeScreen

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screen.WelcomeScreen.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.DiagnosisScreen.route){
            DiagnosisScreen(navController = navController)
        }
        composable(route = Screen.GejalaScreen.route){
            GejalaScreen(navController = navController)
        }
        composable(route = Screen.PenyakitScreen.route){
            PenyakitScreen(navController = navController)
        }
        composable(route = Screen.PetunjukScreen.route){
            PetunjukScreen(navController = navController)
        }
        composable(route = Screen.TentangScreen.route){
            TentangScreen(navController = navController)
        }
    }
}

