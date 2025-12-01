package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.flashcardapp.R



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question = intent.getStringExtra("question")
        val answer = intent.getStringExtra("answer")
        if (question != null && answer != null) {
            val questionView = findViewById<TextView>(R.id.flashcard_question)
            val answerView = findViewById<TextView>(R.id.flashcard_answer)
            questionView.text = question
            answerView.text = answer
        }

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer_1)
        val flashcard_answer_2 = findViewById<TextView>(R.id.flashcard_answer_2)
        val flashcard_answer_3 = findViewById<TextView>(R.id.flashcard_answer_3)
        val flashcardAnswer4 = findViewById<TextView>(R.id.flashcard_answer_4)
        val buttonAdd = findViewById<ImageView>(R.id.Addcardactivity)

        buttonAdd.setOnClickListener {
            val intent = Intent(this, AddcardActivity::class.java)
            startActivity(intent)
        }

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