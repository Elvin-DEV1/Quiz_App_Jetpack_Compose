package com.example.quizapp.question.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuestionModel(
    val id: Int,
    val question: String?,
    val answer1: String?,
    val answer2: String?,
    val answer3: String?,
    val answer4: String?,
    val correctAnswer: Int,
    val score: Int,
    val picPath: String?,
    val clickedAnswer: String?
) : Parcelable
