package com.kotlin.answersystem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctCount = intent.getStringExtra(Constants.CORRECT_COUNT)
        val wrongCount = intent.getStringExtra(Constants.WRONG_COUNT)
        result_count.text = "答对${correctCount}道，答错${wrongCount}道"
        if(wrongCount=="0"){
            result_text2.text = "您不是色盲患者"
        }else if (correctCount.toString()>= 10.toString()){
            result_text2.text = "您有轻微色盲，快去视力恢复区训练吧"
        }else{
            result_text2.text = "您有重度色盲，快去视力恢复区训练吧"
        }
        result_button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
