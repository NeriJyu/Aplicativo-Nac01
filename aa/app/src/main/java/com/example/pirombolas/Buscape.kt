package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_paginas.*

class Buscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)
//        WebViewBuscape.webViewClient = WebViewClient()
//        WebViewBuscape.settings.javaScriptEnabled = true
//        WebViewBuscape.loadUrl(intent.getStringExtra("url"))
        WebViewBuscape.loadUrl("https://www.buscape.com.br")

    }
}
