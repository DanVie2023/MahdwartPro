package com.example.mahdwartpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    private lateinit var lvTodoList: ListView
    private lateinit var fab: FloatingActionButton
    private lateinit var shoppingItems: ArrayList<String>
    private lateinit var itemAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        lvTodoList = findViewById(R.id.ivTodoList)
        fab = findViewById(R.id.floatingActionButton4)
        shoppingItems = ArrayList()

        shoppingItems.add("Apfel")
        shoppingItems.add("Banane")

        itemAdapter = ArrayAdapter( this, android.R.layout.simple_list_item_1, shoppingItems)
        lvTodoList.adapter = itemAdapter

        lvTodoList.onItemLongClickListener =
            AdapterView.OnItemLongClickListener { arg0, arg1, pos, id->
                shoppingItems.removeAt(pos)
                itemAdapter.notifyDataSetChanged()
                Toast.makeText(applicationContext, "gelöscht", Toast.LENGTH_SHORT).show()
                true
            }

        fab.setOnClickListener{
            var builder = AlertDialog.Builder(this)
            builder.setTitle("Hinzufügen")
            builder.setMessage("Hallo das ist der Text")

            var input = EditText(this)
            input.hint = "Text eingeben"
            input.inputType = InputType.TYPE_CLASS_TEXT
            builder.setView(input)

            builder.setPositiveButton("OK"){ dialog, which ->
                shoppingItems.add(input.text.toString())
            }

            builder.setNegativeButton("Abbrechen"){dialog, which ->
                Toast.makeText(applicationContext, "Abgebrochen", Toast.LENGTH_SHORT).show()
            }

            builder.show()
        }

         */

    }
}