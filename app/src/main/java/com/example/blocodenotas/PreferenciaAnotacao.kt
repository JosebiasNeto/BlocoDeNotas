package com.example.blocodenotas

import android.content.Context
import android.content.SharedPreferences

class PreferenciaAnotacao (private val context: Context){

    private val ARQUIVO = "anotacao.preferencia"
    private val preferences: SharedPreferences
    private val editor: SharedPreferences.Editor

    fun salvarAnotacao(){

    }

    fun RecuperarAnotacao(){

    }

    init {
        preferences = context.getSharedPreferences(ARQUIVO, 0)
        editor =
    }
}