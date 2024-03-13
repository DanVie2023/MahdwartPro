package com.example.mahdwartpro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mahdwartpro.databinding.ActivityMessagePreviewBinding

class MessagePreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessagePreviewBinding
    private lateinit var messagePreviewText: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagePreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
        displayMessage()
    }

    private fun displayMessage() {
        messagePreviewText = """
            Sehr geehrte Damen und Herren,
            
            Im Windpark WINDPARKNAME in GEMEINDE, LANDKREIS gab es ein Mahd- oder Ernteereignis.
            
            Aufgrund des MAHD/ERNTE-Ereignisses im Einwirkbereich der WEA WEANUMMER muss diese Anlage
            für X Tage abgeschalten werden.
            
            Mit freundlichen Grüßen
            Parkwart          
            
        """.trimIndent()

        binding.textViewPreviewMessage.text = messagePreviewText
    }

    private fun setListeners() {
        binding.buttonPreviewSend.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, "Daniel.Vieler@web.de")
                putExtra(Intent.EXTRA_SUBJECT, "WP TEST - Ereignis")
                putExtra(Intent.EXTRA_TEXT,messagePreviewText)
            }
            try {
                startActivity(intent)
            }
            catch (e: Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }
    }
}