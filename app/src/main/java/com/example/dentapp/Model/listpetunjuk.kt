package com.example.dentapp.Model

import androidx.annotation.DrawableRes

data class listpetunjuk(
    val id:String,
    val namapetunjuk:String,
    val descpetunjuk:String,
    @DrawableRes val iconId: Int
)
