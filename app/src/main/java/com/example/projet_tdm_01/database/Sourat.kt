package com.example.projet_tdm_01.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Index_Sourat")
data class Sourat(
    @PrimaryKey

    val idSourat:Int,
    ////////////////////////////////////////
    val nomSourat:String,
    val location:String,
    val nbrAyat:Int,
    val nbrMots:Int,
    val nbrLettre:Int

)

