package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer_1)
        val flashcard_answer_2 = findViewById<TextView>(R.id.flashcard_answer_2)
        val flashcard_answer_3 = findViewById<TextView>(R.id.flashcard_answer_3)
        val flashcardAnswer4 = findViewById<TextView>(R.id.flashcard_answer_4)

        flashcardAnswer4.setOnClickListener {
            flashcardAnswer4.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }
        flashcard_answer_3.setOnClickListener {
            flashcard_answer_3.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        flashcard_answer_2.setOnClickListener {
            flashcard_answer_2.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        }
        flashcardAnswer1.setOnClickListener {
            flashcardAnswer1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }

        flashcardAnswer.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer.visibility = View.INVISIBLE
            }
        }


}
