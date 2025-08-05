package com.example.quizapp.leader

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizapp.R
import com.example.quizapp.leader.components.LeaderRow
import com.example.quizapp.leader.components.TopThreeSection
import com.example.quizapp.leader.components.onBackRow
import com.example.quizapp.leader.model.UserModel

@Composable
fun LeaderScreen(
    topUsers: List<UserModel>,
    otherUsers: List<UserModel>,
    onBackClick: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.grey)),
        verticalArrangement = Arrangement.Top
    ) {
        item {
            onBackRow(onBackClick)
        }
        item {
            TopThreeSection(topUsers)
            Spacer(modifier = Modifier.height(16.dp))
        }
        itemsIndexed(otherUsers) {index, user ->
            LeaderRow(user = user, rank = index + 4)
        }
    }
}

@Preview
@Composable
fun LeaderScreenPreview() {
    val topUsers = listOf(
        UserModel(id = 1, name = "John Doe", pic = "person1", score = 100),
        UserModel(id = 2, name = "Jane Smith", pic = "person2", score = 90),
        UserModel(id = 3, name = "Peter Jones", pic = "person3", score = 80)
    )
    val otherUsers = listOf(
        UserModel(id = 4, name = "Mary Brown", pic = "person4", score = 70)
    )
    LeaderScreen(
        topUsers = topUsers,
        otherUsers = otherUsers,
        onBackClick = {}
    )
}