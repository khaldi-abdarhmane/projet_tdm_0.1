package com.example.projet_tdm_01

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Racine_des_mots_arabe")
data class Racine(
   @PrimaryKey
   val idracine:Int,


   ///////////////////////////
   val racine:String,
   val e1: String,
   val e2:String,
   val e3:String,
   val e4:String,
   val e5:String,
   val e6:String,
   val nblettre:Int,
   )
