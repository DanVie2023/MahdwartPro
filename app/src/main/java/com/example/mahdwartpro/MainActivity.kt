package com.example.mahdwartpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    private lateinit var lvTodoList: ListView
    private lateinit var fat: FloatingActionButton
    private lateinit var shoppingItems: ArrayList<String>
    private lateinit var itemAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        lvTodoList = findViewById(R.id.ivTodoList)
        fat = findViewById(R.id.floatingActionButton4)
        shoppingItems = ArrayList()

        shoppingItems.add("Apfel")

        itemAdapter = ArrayAdapter( this, android.R.layout.simple_list_item_1, shoppingItems)
        lvTodoList.adapter = itemAdapter
    }
}