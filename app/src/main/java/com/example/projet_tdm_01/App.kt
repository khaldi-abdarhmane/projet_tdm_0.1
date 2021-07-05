package com.example.projet_tdm_01

import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Roomservice.context=applicationContext
    }
}