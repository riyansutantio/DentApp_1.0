package com.example.dentapp.Model

import androidx.annotation.DrawableRes

data class listTentang(
    @DrawableRes val iconId: Int,
    val appname:String,
    val desc1:String,
    val desc2:String,
    val desc3:String,
    val desc4:String,
)
