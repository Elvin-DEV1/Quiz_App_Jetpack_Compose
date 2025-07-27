package com.example.quizapp.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.example.quizapp.R
import com.example.quizapp.dashboard.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.grey)
        setContent {
            MainScreen(
                onSinglePlayerClick = {

                },
                onBoardClick = {

                }
            )
        }
    }
}

