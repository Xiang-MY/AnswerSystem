package com.kotlin.answersystem

import kotlin.collections.ArrayList

/**
 * @author: ffzs
 * @Date: 2020/9/10 上午10:31
 */

object Constants {

    const val QUESTION_COUNT = "question_count"
    const val CORRECT_COUNT = "correct_count"
    const val WRONG_COUNT = "wrong_count"


    fun getQuestions(count: Int): MutableList<Question> {
        val questions = ArrayList<Question>()
        val que1 = Question(1, "选出你看到的",
            R.drawable.eight, "7", "2", "9", "8", 4)
        val que2 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que3 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que4 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que5 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que6 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que7 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que8 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que9 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que10 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que11 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que12 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que13 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que14 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)
        val que15 = Question(2, "选出你看到的",
            R.drawable.fifty_two,"42", "38", "52", "103", 3)


        questions.addAll(
            listOf(que1, que2,que3,que4,que5, que6,que7,que8,que9, que10,que11,que12,que13, que14,que15)
        )

        questions.shuffle()
        return questions.subList(0, count)
    }
}