package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class tuan3_adapter (val ls:ArrayList<tuan3_model>,val context: Context): BaseAdapter() {
    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView= convertView
        var vax:ViewAX
        if (convertView ==null) {
            vax = ViewAX()
            convertView = LayoutInflater.from(context).inflate(R.layout.layout,null)
            vax.img_hinh = convertView.findViewById(R.id.)
            vax.tv_ten = convertView.findViewById(R.id)
            vax.tv_tuoi = convertView.findViewById(R.id)

            convertView.tag = vax
        }
        else {
            vax = convertView.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[position].hinh)
        vax.tv_ten!!.text=ls[position].ten
        vax.tv_tuoi!!.text=ls[position].tuoi

        return convertView
    }
    internal inner class ViewAX {
        var img_hinh: ImageView? =null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }
}