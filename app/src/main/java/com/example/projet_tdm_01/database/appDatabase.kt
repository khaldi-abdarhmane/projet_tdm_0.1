package com.example.projet_tdm_01.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = arrayOf(Racine::class, Word::class, Aya::class, Sourat::class),version =1 )
@TypeConverters(Converter::class)
abstract class appDatabase: RoomDatabase() {


    abstract fun getRacineDao(): RacineDao
    abstract  fun getWordDao(): WordDao
    abstract fun getAyaDao(): AyaDao
    abstract  fun getSouratDao(): SouratDao

}