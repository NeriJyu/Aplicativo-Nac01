package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_ebay.*

class Ebay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)
        WebViewEbay.loadUrl("https://www.ebay.com")
    }
}
