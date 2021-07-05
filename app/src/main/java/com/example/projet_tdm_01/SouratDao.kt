package com.example.projet_tdm_01

import androidx.room.*
import java.util.*

@Dao
interface SouratDao {

    @Insert
    fun addSourat (sourat:Sourat)
    @Insert
    fun addSourats(Sourats:List<Sourat>)

    @Delete
    fun delSourat (sourat:Sourat)


    @Query("select * from Index_Sourat")
    fun getAllSourat():List<Sourat>

    @Query("select * from Index_Sourat where nomSourat=:nomSourat")
    fun getSouratsBynomSourat(nomSourat:String):List<Sourat>




}