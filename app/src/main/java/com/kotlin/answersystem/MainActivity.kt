package com.kotlin.answersystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        login_start_button.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            val questionCount = "15"
            questionCount.toInt()
            intent.putExtra(Constants.QUESTION_COUNT, questionCount)
            startActivity(intent)
            finish()
        }
    }}