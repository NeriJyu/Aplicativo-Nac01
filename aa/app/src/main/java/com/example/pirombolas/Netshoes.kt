package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class Netshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)


        WebViewNetshoes.loadUrl("https://www.netshoes.com.br")
    }
}
