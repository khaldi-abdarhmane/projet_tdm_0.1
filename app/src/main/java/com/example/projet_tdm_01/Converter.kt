package com.example.projet_tdm_01

import androidx.room.TypeConverter
import java.util.*

class Converter {


    @TypeConverter
    fun dateToTimesTamp(date:Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun fromTimestamp(value:Long? ):Date?{
        if (value != null){
            return Date(value)
        }
        else return null

    }



}