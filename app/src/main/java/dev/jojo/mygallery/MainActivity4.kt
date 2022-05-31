package dev.jojo.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {

    lateinit var btnBack4:Button
    lateinit var btnNext4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            var intent = Intent(this,MainActivity3 ::class.java)
            startActivity(intent)

        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            var intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}