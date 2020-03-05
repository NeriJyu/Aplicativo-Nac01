package com.example.pirombolas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class Americanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        WebViewAmericanas.loadUrl("https://www.americanas.com.br")
    }
}
