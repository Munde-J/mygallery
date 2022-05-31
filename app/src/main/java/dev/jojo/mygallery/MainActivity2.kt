package dev.jojo.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    lateinit var btnBack2:Button
    lateinit var btnNext2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnBack2 = findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            var intent = Intent(this,MainActivity1 ::class.java)
            startActivity(intent)
        }
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            var intent = Intent(this,MainActivity3 ::class.java)
            startActivity(intent)
        }
    }
}