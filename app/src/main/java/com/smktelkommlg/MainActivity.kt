package com.smktelkommlg

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDownload: Button = findViewById(R.id.btn_download)
        buttonDownload.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=jp.konami.pesam")
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Game Spec"
        }
    }
}