package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tuan3 : AppCompatActivity() {
    var dapter :tuan3_adapter? = null
    var ls = ArrayList<tuan3_model>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan3)
        var listView  = findViewById<ListView>(R.id.tuan3_lv)
        ls.add(tuan3_model("Nguyen Van A","22"))
    }
}