package com.example.projet_tdm_01.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface WordDao {

    @Insert
    fun addWord(word: Word)

    @Insert
    fun addWords(words: List<Word>)

    @Delete
    fun delword (word: Word)

    /*

    @Query("select * from mots_du_coran ")
    fun getAllWord(): List<Word>

    @Query("select * from mots_du_coran where arabicWord=:arabicWord")
    fun getWordsByarabicWord(arabicWord:String): List<Word>

    @Query("select * from Racine_des_mots_arabe natural join mots_du_coran ")
    fun getAllWordsandRacine():List<WordRacine>

    @Query("select * from Racine_des_mots_arabe r natural join mots_du_coran mot on r.idracine=mot.idracine where  r.racine=:racine")
    fun getWordsByRacine(racine:String): List<Word>


    @Query("select * from Aya natural join mots_du_coran ")
    fun getAllWordsandAyas():List<WordAya>

    @Query("select * from Aya ay natural join mots_du_coran mot on mot.id_Aya=mot.id_Aya where  id_Aya=:id_Aya ")
    fun getWordsByUAya(id_Aya:String): List<Word>


*/



}


