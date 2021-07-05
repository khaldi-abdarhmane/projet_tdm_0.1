package com.example.projet_tdm_01

import android.content.Context
import androidx.room.Room

object Roomservice {
    lateinit var context: Context
  val appDatabase by lazy {

      Room.databaseBuilder(context, appDatabase::class.java, "khadsfdirrldi")
          .allowMainThreadQueries().build()
  }


}
