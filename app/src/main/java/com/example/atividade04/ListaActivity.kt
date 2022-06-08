package com.example.atividade04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Pokedex")
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}