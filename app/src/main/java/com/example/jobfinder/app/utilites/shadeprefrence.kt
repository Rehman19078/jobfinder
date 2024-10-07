package com.example.jobfinder.app.utilites

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsHelper(context: Context) {
    private val sharedPreferences: SharedPreferences =
        //tiny db folder name prefes
        context.getSharedPreferences("Prefs", Context.MODE_PRIVATE)

    fun setBoolean(Key:String, Value:Boolean){
        sharedPreferences.edit().putBoolean(Key,Value).apply()
    }

    fun getBoolean(Key:String,defaultValue:Boolean):Boolean{
        return sharedPreferences.getBoolean(Key,defaultValue)?:defaultValue
    }
}