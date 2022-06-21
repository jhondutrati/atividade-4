
package com.example.atividade04

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)

        setTitle("Black Tabacaria")

        val contatinhos = arrayOf("Juice", "R$:19,90 ",
            "Carvão", "R$:20,00",
            "Essencia","R$:10,00")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, contatinhos)


        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador





        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }
    }

}