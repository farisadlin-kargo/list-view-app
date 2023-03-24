package com.example.list_view_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items = listOf(
        Item("Item 1", "Description 1"),
        Item("Item 2", "Description 2"),
        Item("Item 3", "Description 3"),
        Item("Item 4", "Description 4")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemAdapter = ItemAdapter(items)
        val itemList = findViewById<RecyclerView>(R.id.item_list)
        itemList.adapter = itemAdapter
    }
}