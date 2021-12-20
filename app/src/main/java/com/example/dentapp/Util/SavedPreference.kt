package com.example.dentapp.Util

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object SavedPreference {
    const val EMAIL= "DefaultEmail"
    const val DISPLAYNAME="DefaultName"

    private  fun getSharedPreference(ctx: Context?): SharedPreferences? {
        return PreferenceManager.getDefaultSharedPreferences(ctx)
    }
    private fun  editor(context: Context, const:String, string: String){
        getSharedPreference(
            context
        )?.edit()?.putString(const,string)?.apply()
    }
    fun setEmail(context: Context, email: String){
        editor(
            context,
            EMAIL,
            email
        )
    }
    fun setDisplayName(context: Context, displayname:String){
        editor(
            context,
            DISPLAYNAME,
            displayname
        )
    }
    fun getEmail(context: Context)= getSharedPreference(
        context
    )?.getString(EMAIL,"")
    fun getDisplayName(context: Context) = getSharedPreference(
        context
    )?.getString(DISPLAYNAME,"")
    fun setDefaultName(context: Context){
        editor(
            context,
            DISPLAYNAME,
            "DefaultName"
        )
    }
    fun setDefaultEmail(context: Context){
        editor(
            context,
            EMAIL,
            "DefaultEmail"
        )
    }
}