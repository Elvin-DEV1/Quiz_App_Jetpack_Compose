package com.example.quizapp.leader

import android.os.Bundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapp.R
import com.example.quizapp.leader.model.UserModel

class LeaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.grey)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val topUsers = loadData().take(3)
        val otherUsers = loadData().drop(3)

        setContent {
            LeaderScreen(
                topUsers = topUsers,
                otherUsers = otherUsers,
                onBackClick = { finish() }
            )
        }
    }

    private fun loadData(): List<UserModel> {
        return listOf(
            UserModel(1, "Bruno", "person1", 5000),
            UserModel(2, "Bryan", "person2", 4800),
            UserModel(3, "Kobie", "person3", 4550),
            UserModel(4, "Harry", "person4", 4300),
            UserModel(5, "Tom", "person5", 4250),
            UserModel(6, "Ramus", "person6", 4000),
            UserModel(7, "Luke", "person7", 3800),
            UserModel(8, "Ayden", "person8", 3650),
            UserModel(9, "Mason", "person9", 3400),
            UserModel(10, "Diogo", "person10", 3210)
        )
    }
}