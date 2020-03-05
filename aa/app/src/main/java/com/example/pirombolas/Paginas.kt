package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_paginas.*

class Paginas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paginas)


        WebView.loadUrl("https://www.mercadolivre.com.br")

//        class MyWebViewClient : WebViewClient(){
//            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
//                view?.loadUrl(request?.url.toString())
//                return true
//            }
//
//            override fun shouldOverrideKeyEvent(view: WebView?, event: KeyEvent?): Boolean {
//                view?.loadUrl(url)
//                return true
//            }
//        }









    }
}
