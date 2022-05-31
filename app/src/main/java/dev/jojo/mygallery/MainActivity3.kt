package dev.jojo.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    lateinit var btnBack3:Button
    lateinit var btnNext3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            var intent = Intent(this,MainActivity2 ::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            var intent = Intent(this,MainActivity4 ::class.java)
            startActivity(intent)
        }
    }
}