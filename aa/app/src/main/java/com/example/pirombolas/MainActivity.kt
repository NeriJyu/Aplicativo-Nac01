package com.example.pirombolas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_paginas.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)
//        btGravar.setOnClickListener { view: View? ->
//            sh.edit().putString("vl",txtValor.text.toString()).apply()
//
//
//        }
//        btMostrar.setOnClickListener { view: View? ->
//            sh.edit().putString("vl",txtValor.text.toString()).apply()
//            var texto = sh.getString("vl", "Limpou!")
//            Toast.makeText(this, texto, Toast.LENGTH_SHORT)
//        }


        //Mercado Livre
        imgMercadoLivre.setOnClickListener { view: View? ->

            try{

                startActivity(intent)
                var intent = Intent(this, Paginas::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }
        }

//        //Buscapé
//        imgBuscape.setOnClickListener { view: View? ->
//
//            try{
//
//                startActivity(intent)
//                var intent = Intent(this, Buscape::class.java)
//                intent.putExtra("url", "https://www.webmotors.com.br")
//                startActivity(intent)
//            }catch(e: Exception) {
//                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
//            }
//        }
        //Buscapé
        imgBuscape.setOnClickListener { view: View? ->

            try{

                startActivity(intent)
                var intent = Intent(this, Buscape::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }
        }

        //Ebay
        imgEbay.setOnClickListener { view: View? ->

            try{

                startActivity(intent)
                var intent = Intent(this, Ebay::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }
        }


        //WebMotors
        imgWebMotors.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, WebMotors::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }

        //Magalu
        imgMagalu.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, Magalu::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }

        //Netshoes
        imgNetshoes.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, Netshoes::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }

        //Americanas
        imgAmericanas.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, Americanas::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }

        //Submarino
        imgSubmarino.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, Submarino::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }

        //Sobre
        btSobre.setOnClickListener { view: View? ->

            try{
                startActivity(intent)
                var intent = Intent(this, Sobre::class.java)

                startActivity(intent)
            }catch(e: Exception) {
                Toast.makeText(this, "Algo de errado não está certo", Toast.LENGTH_SHORT).show()
            }

        }










    }
}
