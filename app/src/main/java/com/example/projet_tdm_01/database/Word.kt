package com.example.projet_tdm_01.database

import androidx.room.Entity
import androidx.room.ForeignKey

import androidx.room.PrimaryKey





@Entity(tableName = "Mots_du_Coran",foreignKeys = arrayOf(
    ForeignKey(

        entity = Aya::class,
        parentColumns = arrayOf("idSourat","numAya"),
        childColumns =  arrayOf("idSourat","numAya"),
        onDelete = ForeignKey.CASCADE),


    ForeignKey(

        entity = Racine::class,
        parentColumns = arrayOf("idracine"),
        childColumns =  arrayOf("idracine"),
        onDelete = ForeignKey.CASCADE

    )
)

)
data class Word(
    @PrimaryKey
    val id_Word:Int,
    val id_Aya:String,
    val idSourat:Int,
    val numAya:Int,
    val idracine:Int,

    /////////////////////////////////////////////////////
    val arabicWord:String,
    val englishWord:String,



)
