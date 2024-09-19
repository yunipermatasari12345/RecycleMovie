package com.tugasmobileyuni

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tugasmobileyuni.Adapter.BukuAdapter
import com.tugasmobileyuni.model.ModelBuku

private lateinit var rev_data : RecyclerView

class RecycleViewAtcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view_atcivity)

        rev_data = findViewById(R.id.rv_data)

        val listBuku = listOf(
            ModelBuku(judul = "hujan", penulis = "Tere Liye"),
            ModelBuku(judul = "Bumi", penulis = "Tere Liye"),
            ModelBuku(judul = "Laskar Pelangi", penulis = "Andrea Hirata"),
            ModelBuku(judul = "hujan", penulis = "Tere Liye"),
            ModelBuku(judul = "petin", penulis = "Tere Liye"),
            ModelBuku(judul = "daun yg jatuh tak menghianati angin", penulis = "Tere Liye"),
            ModelBuku(judul = "ikan", penulis = "Tere Liye"),
        )

        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewAtcivity)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}