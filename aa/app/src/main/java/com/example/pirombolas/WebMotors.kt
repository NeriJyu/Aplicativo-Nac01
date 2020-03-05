package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paginas.*
import kotlinx.android.synthetic.main.activity_web_motors.*

class WebMotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_motors)

        WebViewWebMotors.loadUrl("https://www.webmotors.com.br")

    }
}
