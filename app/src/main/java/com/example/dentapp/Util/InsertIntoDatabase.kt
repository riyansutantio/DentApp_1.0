package com.example.dentapp.Util

import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

private const val TAG = "Insert Into Database"
fun insertIntoDatabase(cur : String){
    val alphabet: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val userID = List(20) { alphabet.random() }.joinToString("")
    val database: DatabaseReference = Firebase.database.reference
    database.child("History_Diagnosis").child(userID).setValue(cur).addOnSuccessListener {
        Log.d(TAG,"Insert History Successful ")
    }.addOnFailureListener {
        Log.d(TAG,"Insert History Not Successful ")
    }
}