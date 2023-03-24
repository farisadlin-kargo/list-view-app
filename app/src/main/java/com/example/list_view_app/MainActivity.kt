package com.example.list_view_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsA = resources.getStringArray(R.array.example_names)
        val itemsB = resources.getStringArray(R.array.example_descriptions)
        val items = itemsA.zip(itemsB).map { (name, description) ->
            Item(name, description)
        }

        val itemAdapter = ItemAdapter(items)
        val itemList = findViewById<RecyclerView>(R.id.item_list)
        itemList.adapter = itemAdapter
    }
}