package com.example.rvarraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edName :EditText
    private lateinit var edNum : EditText
    private lateinit var btnGet : Button
    private lateinit var btnAdd :Button
    private lateinit var tv :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = ArrayList<String>()
        tv=findViewById(R.id.tv)
        edName=findViewById(R.id.edName)
        edNum=findViewById(R.id.edNum)
        btnAdd=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val name = edName.text.toString()
            edName.text.clear()
            names.add(name)
            tv.text= names.toString()


        }

        btnGet=findViewById(R.id.btnGet)
        btnGet.setOnClickListener {
            val num = edNum.text.toString().toInt()
            edNum.text.clear()
            tv.text=names[num]
        }


    }

}