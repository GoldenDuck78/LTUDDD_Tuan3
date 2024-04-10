package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tuan3_model {
    var ten:String?=null
    var tuoi:String?=null
    var hinh:Int?=0

    constructor()
    constructor(ten: String?, tuoi: String?, hinh: Int?) {
        this.ten = ten
        this.tuoi = tuoi
        this.hinh = hinh
    }

}