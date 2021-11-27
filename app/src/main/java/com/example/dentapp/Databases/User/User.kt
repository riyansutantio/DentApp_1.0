package com.example.dentapp.Databases.User

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user")
data class User(
    @Expose
    @PrimaryKey(autoGenerate = true)
    var id_user:Long,

    @Expose
    @SerializedName("Nama_User")
    @ColumnInfo(name = "Nama_User")
    var nama_user:String,

    @Expose
    @SerializedName("Email_User")
    @ColumnInfo(name = "Email_User")
    var email_user:String,

    @Expose
    @SerializedName("Password_User")
    @ColumnInfo(name = "Password_User")
    var password_user:String,

    )