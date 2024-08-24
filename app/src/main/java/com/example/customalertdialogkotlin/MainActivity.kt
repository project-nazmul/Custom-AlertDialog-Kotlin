package com.example.customalertdialogkotlin

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.custom_dialog)
            //dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val text1 = dialog.findViewById<TextView>(R.id.textView1)
            val text2 = dialog.findViewById<TextView>(R.id.textView2)
            val text3 = dialog.findViewById<TextView>(R.id.textView3)
            val text4 = dialog.findViewById<TextView>(R.id.textView4)
            val text5 = dialog.findViewById<TextView>(R.id.textView5)
            val yes = dialog.findViewById<Button>(R.id.yes)
            val no = dialog.findViewById<Button>(R.id.no)

            text1.text = "Hello!"
            text2.text = "How are you!"
            text3.text = "Are you ready!"
            text4.text = "to yes or no!"
            text5.text = "Click Yes or No Button!"

            yes.setOnClickListener {
                Toast.makeText(this, "You Clicked Yes!", Toast.LENGTH_SHORT).show()
            }

            no.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }
    }
}