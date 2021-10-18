package com.example.linah_alkhurayyif_appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitbtn=findViewById<Button>(R.id.submit)
        val editText =findViewById<EditText>(R.id.editText)
        val user_output =findViewById<TextView>(R.id.useroutput)
        submitbtn.setOnClickListener {
            user_output.text =editText.text.toString()
        }
    }
}