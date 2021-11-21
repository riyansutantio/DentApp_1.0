package com.example.dentapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.core.content.IntentCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dentapp.Util.Navigation
import com.example.dentapp.Util.listpenyakit
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Navigation()
        }
    }
    fun triggerRestart() {
        val inte = intent
        /*inte.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        inte.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)*/


        /*val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        this.startActivity(intent)
        if (this is Activity) {
            (this as Activity).finish()
        }*/
    }
}