package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddcardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_addcard)
        val questionField = findViewById<EditText>(R.id.Addcardactivity1)
        val answerField = findViewById<EditText>(R.id.Addcardactivity)
        val saveButton = findViewById<ImageView>(R.id.Addcardactivity3)

        saveButton.setOnClickListener {
            val question = questionField.text.toString()
            val answer = answerField.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("question", question)
            intent.putExtra("answer", answer)
            startActivity(intent)
        }
        val buttonCancel = findViewById<ImageView>(R.id.Addcardactivity2)

        buttonCancel.setOnClickListener {
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}