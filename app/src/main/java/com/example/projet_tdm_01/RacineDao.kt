package com.example.projet_tdm_01

import androidx.room.*
import java.util.*

@Dao
interface RacineDao {

    @Insert
    fun addRacine (racine:Racine)

    @Insert
    fun addRacine(racines:List<Racine>)


    @Query("select * from Racine_des_mots_arabe ")
    fun getAllUser():List<Racine>

    @Query("select * from Racine_des_mots_arabe where racine=:racine")
    fun getUsersByFirstName(racine:String):List<Racine>



}