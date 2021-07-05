package com.example.projet_tdm_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment.getExternalStorageDirectory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.FileReader


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  val date22= SimpleDateFormat("dd/mm/yyyy").parse("21/02/2000")
        val racine=Racine(1493,	"أبب",	"أ",	"ب",	"ب"	,"","","",		3)
val sourat=Sourat(1,	"الفاتحة","مكيّة"	,7	,29	,139)

val aya=Aya("1:1",	1,	1	,"بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ",4)

 val word =Word(1	,"1:1"	,1	,1	,1493,"بِسْمِ","In (the) name" )

val aya= Ay
//Roomservice.appDatabase.getSouratDao().addSourat(sourat)

       //Roomservice.appDatabase.getAyaDao().addAya(aya)
  Roomservice.appDatabase.getSouratDao().addSourat(sourat)
  Roomservice.appDatabase.getAyaDao().addAya(aya)
  Roomservice.appDatabase.getRacineDao().addRacine(racine)
  Roomservice.appDatabase.getWordDao().addWord(word)
        //val sourats=Roomservice.appDatabase.getSouratDao().getAllSourat()

        // text.text=sourats[0].nomSourat

        button.setOnClickListener {


            text.text="ffffffff"

        }



    }




    }



}