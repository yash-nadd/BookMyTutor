package com.example.bookmytutor

// src/MainActivity.
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OptionActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonTutor: Button
    private lateinit var buttonParent: Button
    private lateinit var buttonAdmin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        buttonTutor = findViewById(R.id.buttonTutor)
        buttonParent = findViewById(R.id.buttonParent)
        buttonAdmin = findViewById(R.id.buttonAdmin)

        buttonTutor.setOnClickListener(this)
        buttonParent.setOnClickListener(this)
        buttonAdmin.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonTutor -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.buttonParent -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.buttonAdmin -> {

            }
        }
    }
}
