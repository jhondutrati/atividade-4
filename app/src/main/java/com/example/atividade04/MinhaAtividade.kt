package com.example.atividade04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MinhaAtividade : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate excecutado...")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        println("onStart excecutado...")
    }

    override fun onResume() {
        println("onStart excecutado...")
        super.onResume()
    }

    override fun onPause() {
        println("onPause excecutado...")
        super.onPause()
    }

    override fun onStop() {
        println("onStop excecutado...")
        super.onStop()
    }

    override fun onRestart() {
        println("onRestart excecutado...")
        super.onRestart()
    }

    override fun onDestroy() {
        println("onDestroy excecutado...")
        super.onDestroy()
    }
}