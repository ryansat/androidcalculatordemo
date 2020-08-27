package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tampung : String = ""
        var hasilPerhitungan : Int
        var bilangan1 : Int = 0
        var bilangan2 : Int = 0
        val btn1 = findViewById(R.id.angka1) as Button
        val btn2 = findViewById(R.id.angka2) as Button
        val btn3 = findViewById(R.id.angka3) as Button
        val btn4 = findViewById(R.id.angka4) as Button
        val btn5 = findViewById(R.id.angka5) as Button
        val btn6 = findViewById(R.id.angka6) as Button
        val btn7 = findViewById(R.id.angka7) as Button
        val btn8 = findViewById(R.id.angka8) as Button
        val btn9 = findViewById(R.id.angka9) as Button
        val btn0 = findViewById(R.id.angka0) as Button
        val btnplus = findViewById(R.id.btnSum) as Button
        val btnresult = findViewById(R.id.btnResult) as Button
        val hasil = findViewById(R.id.hasilPerhitungan) as TextView
        btn1.setOnClickListener {
            tampung = tampung+"1"
            hasil.text = tampung
        }
        btn2.setOnClickListener {
            tampung = tampung+"2"
            hasil.text = tampung
        }
        btn3.setOnClickListener {
            tampung = tampung+"3"
            hasil.text = tampung
        }
        btn4.setOnClickListener {
            tampung = tampung+"4"
            hasil.text = tampung
        }
        btn5.setOnClickListener {
            tampung = tampung+"5"
            hasil.text = tampung
        }
        btn6.setOnClickListener {
            tampung = tampung+"6"
            hasil.text = tampung
        }
        btn7.setOnClickListener {
            tampung = tampung+"7"
            hasil.text = tampung
        }
        btn8.setOnClickListener {
            tampung = tampung+"8"
            hasil.text = tampung
        }
        btn9.setOnClickListener {
            tampung = tampung+"9"
            hasil.text = tampung
        }
        btn0.setOnClickListener {
            tampung = tampung+"0"
            hasil.text = tampung
        }
        btnplus.setOnClickListener {
            if (bilangan1 <= 0) {
                bilangan1 = tampung.toInt()
                tampung = ""
            }else if (bilangan2 <= 0){
                bilangan2 = tampung.toInt()
                tampung = ""
            }else {
                hasilPerhitungan = bilangan1+bilangan2
                hasil.text = hasilPerhitungan.toString()
            }

        }
        btnresult.setOnClickListener {
            bilangan2 = tampung.toInt()
            tampung = ""
            hasilPerhitungan = bilangan1+bilangan2
            hasil.text = hasilPerhitungan.toString()
        }
    }
}