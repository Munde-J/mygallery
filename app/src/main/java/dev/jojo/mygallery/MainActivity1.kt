package dev.jojo.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {

    lateinit var btnBack1:Button
    lateinit var btnNext1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        btnBack1 = findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            var intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            var intent = Intent(this,MainActivity2 ::class.java)
            startActivity(intent)
        }
    }
}