package com.example.dentapp.Util

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dentapp.Halaman.*
import com.example.dentapp.Model.AuthViewModel
import com.example.dentapp.WelcomeScreen
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@ExperimentalAnimationApi
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val context = LocalContext.current
    val navController = rememberNavController()
    val savedEmail = SavedPreference.getEmail(context).toString()
    val loginHandler = if (savedEmail == "DefaultEmail" || savedEmail == "") Screen.AuthScreen.route else Screen.WelcomeScreen.route
    NavHost(
        navController = navController,
        startDestination = loginHandler
    ){
        composable(route = Screen.WelcomeScreen.route){
            WelcomeScreen(navController)
        }
        composable(route = Screen.AuthScreen.route){
            AuthScreen(authViewModel = AuthViewModel(),navController)
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

