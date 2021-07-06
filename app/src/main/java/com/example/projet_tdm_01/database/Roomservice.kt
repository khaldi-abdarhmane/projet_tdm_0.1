package com.example.projet_tdm_01.database

import android.content.Context
import androidx.room.Room

object Roomservice {
    lateinit var context: Context
  val appDatabase by lazy {

      Room.databaseBuilder(context, com.example.projet_tdm_01.database.appDatabase::class.java, "khaldi")
          .allowMainThreadQueries().build()
  }


}
