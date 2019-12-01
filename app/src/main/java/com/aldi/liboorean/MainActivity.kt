package com.aldi.liboorean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaPulau = intent.getStringExtra(CATEGORY1)
        val namaProvinsi = intent.getStringExtra(CATEGORY2)
        val namaKota = intent.getStringExtra(CATEGORY3)
        cate1.text = namaPulau.toString()
        cate2.text = namaProvinsi.toString()
        cate3.text = namaKota.toString()
    }

    companion object{
        const val CATEGORY1 = "category1"
        const val CATEGORY2 = "category2"
        const val CATEGORY3 = "category3"
    }
}
