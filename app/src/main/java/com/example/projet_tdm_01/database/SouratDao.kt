package com.example.projet_tdm_01.database

import androidx.room.*

@Dao
interface SouratDao {

    @Insert
    fun addSourat (sourat: Sourat)
    @Insert
    fun addSourat(Sourats:List<Sourat>)

    @Delete
    fun delSourat (sourat: Sourat)


    @Query("select * from Index_Sourat")
    fun getAllSourat():List<Sourat>

    @Query("select * from Index_Sourat where nomSourat=:nomSourat")
    fun getSouratsBynomSourat(nomSourat:String):List<Sourat>




}