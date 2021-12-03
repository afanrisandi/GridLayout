package com.afan.gridlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afan.gridlayout.adapters.AlphaAdapters
import com.afan.gridlayout.model.AlphaChar

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<AlphaChar>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<AlphaChar> {

        var arrayList: ArrayList<AlphaChar> = ArrayList()

        arrayList.add(AlphaChar(R.drawable.letter_a, "A Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_b, "B Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_c, "C Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_d, "D Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_e, "E Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_f, "F Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_g, "G Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_h, "H Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_i, "I Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_j, "J Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_k, "K Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_l, "L Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_m, "M Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_n, "N Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_o, "o Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_p, "P Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_q, "Q Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_r, "R Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_s, "S Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_t, "T Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_u, "U Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_v, "V Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_w, "W Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_x, "X Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_y, "Y Latter"))
        arrayList.add(AlphaChar(R.drawable.letter_z, "Z Latter"))

        return arrayList
    }

}