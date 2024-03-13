package com.example.mahdwartpro

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mahdwartpro.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    //private var listItems = emptyArray<String>()
    private lateinit var listItems: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListItems()
        listViewAction()

    }

    private fun listViewAction() {
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, listItems)
        binding.listViewEmailContacts.adapter = adapter

        binding.listViewEmailContacts.setOnItemClickListener { _, _, position, _ ->
            listItems.removeAt(position)
            adapter.notifyDataSetChanged()
        }

        binding.buttonSettingsAddEmail.setOnClickListener {
            if (binding.textInputSettingsAddEmail.text?.isNotEmpty() == true) {
                val inputEmailAddress = binding.textInputSettingsAddEmail.text.toString()
                if (inputEmailAddress.isValidEmail()) {
                    listItems.add(inputEmailAddress)
                    adapter.notifyDataSetChanged()
                } else {
                    Toast.makeText(this, "Invalid E-Mail", Toast.LENGTH_LONG).show()
                    binding.textInputSettingsAddEmail.setText("")
                }
            }
        }
    }

    private fun setListItems() {
        listItems = arrayListOf("d.vieler@e3-gmbh.de", "daniel.vieler@web.de")
    }

    private fun String.isValidEmail() =
        isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()


}