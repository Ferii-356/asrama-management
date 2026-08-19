package com.example.asramamanagement // Sesuaikan dengan package kamu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi CardView
        val cardSantri = findViewById<CardView>(R.id.cardSantri)
        val cardKamar = findViewById<CardView>(R.id.cardKamar)
        val cardInventaris = findViewById<CardView>(R.id.cardInventaris)
        val cardLaporan = findViewById<CardView>(R.id.cardLaporan)
        val cardKesehatan = findViewById<CardView>(R.id.cardKesehatan)

        // Listener Klik
        cardSantri?.setOnClickListener {
            Toast.makeText(this, "Membuka Data Santri...", Toast.LENGTH_SHORT).show()
        }

        cardKamar?.setOnClickListener {
            Toast.makeText(this, "Membuka Data Kamar...", Toast.LENGTH_SHORT).show()
        }

        cardInventaris?.setOnClickListener {
            Toast.makeText(this, "Membuka Data Inventaris...", Toast.LENGTH_SHORT).show()
        }

        cardLaporan?.setOnClickListener {
            Toast.makeText(this, "Membuka Laporan Kendala...", Toast.LENGTH_SHORT).show()
        }

        cardKesehatan?.setOnClickListener {
            Toast.makeText(this, "Membuka Divisi Kesehatan...", Toast.LENGTH_SHORT).show()
        }
    }
}