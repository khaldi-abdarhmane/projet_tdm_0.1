package com.example.projet_tdm_01.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
@Dao
interface AyaDao {

    @Insert
    fun addAya(aya: Aya)

    @Insert
    fun addAyas(ayas: List<Aya>)

    @Delete
    fun delAya (aya: Aya)

    @Query("select * from Aya")
    fun getAllAya(): List<Aya>


    @Query("select * from Aya where id_Aya=:id_Aya")
    fun getAyasByid_Aya(id_Aya:String): List<Aya>

    @Query("select * from Index_Sourat natural join Aya ")
    fun getAllAyasAndSourats():List<SouratAya>

    @Query("select * from Index_Sourat sur  join Aya ay on sur.idSourat=ay.idSourat where  nomSourat=:nomSourat ")
    fun getPetBySourat(nomSourat: String): List<Aya>



}
