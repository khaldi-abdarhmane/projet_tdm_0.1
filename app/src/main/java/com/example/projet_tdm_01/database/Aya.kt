package com.example.projet_tdm_01.database

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName = "Aya" ,foreignKeys = arrayOf(
        ForeignKey(entity = Sourat::class,
                parentColumns = arrayOf("idSourat"),
                childColumns = arrayOf("idSourat"),
                onDelete = ForeignKey.CASCADE)
),primaryKeys = arrayOf("idSourat","numAya") )
data class Aya(

        val id_Aya:String,
        val idSourat:Int,
        val numAya:Int,

        ////////////////////////////
        val text_AR:String,
        val nbMots:Int



)


