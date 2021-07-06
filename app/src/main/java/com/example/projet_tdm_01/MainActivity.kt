package com.example.projet_tdm_01

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projet_tdm_01.database.*
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStreamReader



class MainActivity : AppCompatActivity() {

    val activity: Activity =this
    lateinit var t1:MyThread


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  val date22= SimpleDateFormat("dd/mm/yyyy").parse("21/02/2000")
        val racine= Racine(434,	"أبب",	"أ",	"ب",	"ب"	,"","",		22)
val sourat= Sourat(1,	"الفاتحة","مكيّة"	,7	,29	,139)

val aya= Aya("1:1",	55,	1	,"بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ",4)

 val word = Word(1	,"1:1"	,1	,1	,1493,"بِسْمِ","In (the) name" )
      //  println("lllllllll")
//t1=MyThread()
  //      println("lllllllll")
    //    t1.start()
      //  println("lllllllll")
//Roomservice.appDatabase.getSouratDao().addSourat(sourat)

       //Roomservice.appDatabase.getAyaDao().addAya(aya)

        //val sourats=Roomservice.appDatabase.getSouratDao().getAllSourat()
       //    val l=Roomservice.appDatabase.getRacineDao().getAllUser()
        //  text.text=l.size.toString()

           // .allowMainThreadQueries().build()

val s= Roomservice.appDatabase.getSouratDao().getSouratsBynomSourat("آل عمران")
        Roomservice.appDatabase.getSouratDao().delSourat(s[0])

        button.setOnClickListener {

          //  text.text=l.size.toString()
            text.text="ffffffff"

        }



    }






    inner class MyThread :Thread()
    {
        var  x:Int=0

        override fun run() {
            super.run()
            println("debut")
            val l=getAllDatabase(activity)
            Roomservice.appDatabase.getRacineDao().addRacine(l)
            val l2=getAllDatabase1(activity)
            Roomservice.appDatabase.getSouratDao().addSourat(l2)

            val l3=getAllDatabase2(activity)
            Roomservice.appDatabase.getAyaDao().addAyas(l3)

            val l4=getAllDatabase3(activity)
            Roomservice.appDatabase.getWordDao().addWords(l4)
        println("fin")

        }

        fun getAllDatabase(context:Context):List<Racine>{
            val racines = mutableListOf<Racine>()
            try {

                val csvfile = InputStreamReader(context.assets.open("Racine_des_mots_arabe.csv"))

                val csvfilereader = BufferedReader(csvfile)

                var nextLine= csvfilereader.readLine()

                nextLine= csvfilereader.readLine()

                while(nextLine!= null) {

                    val data = nextLine.split(',')
                    racines.add(Racine( data[0].toInt(), data[1],data[2], data[3] ,data[4], data[5],data[6], data[7].toInt() ))
                    nextLine= csvfilereader.readLine()



                }
            } catch (e: Exception) {
                e.printStackTrace()

            }
            return racines
        }

        fun getAllDatabase1(context:Context):List<Sourat>{
            val sourats = mutableListOf<Sourat>()
            try {

                val csvfile = InputStreamReader(context.assets.open("Index_Sourat.csv"))

                val csvfilereader = BufferedReader(csvfile)

                var nextLine= csvfilereader.readLine()

                nextLine= csvfilereader.readLine()

                while(nextLine!= null) {

                    val data = nextLine.split(',')
                    sourats.add(Sourat( data[0].toInt(), data[1],data[2], data[3].toInt() ,data[4].toInt(), data[5].toInt() ))
                    nextLine= csvfilereader.readLine()



                }
            } catch (e: Exception) {
                e.printStackTrace()

            }
            return sourats
        }

        fun getAllDatabase2(context:Context):List<Aya>{
            val ayas = mutableListOf<Aya>()
            try {

                val csvfile = InputStreamReader(context.assets.open("Aya.csv"))

                val csvfilereader = BufferedReader(csvfile)

                var nextLine= csvfilereader.readLine()

                nextLine= csvfilereader.readLine()

                while(nextLine!= null) {

                    val data = nextLine.split(',')

                    ayas.add(Aya(  id_Aya =  data[0].toString(), idSourat = data[1].toInt(),numAya = data[2].toInt(),text_AR =  data[3] ,nbMots =  data[4].toInt() ))
                    nextLine= csvfilereader.readLine()



                }
            } catch (e: Exception) {
                e.printStackTrace()

            }
            return ayas
        }

        fun getAllDatabase3(context:Context):List<Word>{
            val words = mutableListOf<Word>()
            try {

                val csvfile = InputStreamReader(context.assets.open("Mots_du_Coran.csv"))

                val csvfilereader = BufferedReader(csvfile)

                var nextLine= csvfilereader.readLine()

                nextLine= csvfilereader.readLine()

                while(nextLine!= null) {

                    val data = nextLine.split(',')

                    words.add(Word(    data[0].toInt(),  data[1],data[2].toInt(), data[3].toInt() ,  data[4].toInt(),data[5],data[6] ))
                    nextLine= csvfilereader.readLine()



                }
            } catch (e: Exception) {
                e.printStackTrace()

            }
            return words
        }


    }


    }



