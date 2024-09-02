package com.example.new1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private var player:ArrayList<String> = arrayListOf("musk","jamal","kamal","alamin","billinor","kamal","alamin","billinor","kamal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView =findViewById(R.id.listview)
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,player)
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,player[position],Toast.LENGTH_SHORT).show()
        }
    }
}
