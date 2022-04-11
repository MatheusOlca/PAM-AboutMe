package com.example.about

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_done).setOnClickListener {
            addNickname(it)
        }
        findViewById<EditText>(R.id.edit_nickname)
    }

    private fun addNickname(view: View) {
        val editTextNIckname = findViewById<EditText>(R.id.edit_nickname)
        val textViewNickname = findViewById<TextView>(R.id.tview_nickname)

        textViewNickname.text = editTextNIckname.text
        editTextNIckname.visibility = View.GONE
        view.visibility = View.GONE
        textViewNickname.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}