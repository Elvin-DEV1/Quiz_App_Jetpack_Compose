package com.example.quizapp.dashboard.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizapp.R
import com.example.quizapp.dashboard.components.Banner
import com.example.quizapp.dashboard.components.BottomNavigationBar
import com.example.quizapp.dashboard.components.CategoryGrid
import com.example.quizapp.dashboard.components.CategoryHeader
import com.example.quizapp.dashboard.components.GameModeButtons
import com.example.quizapp.dashboard.components.TopUserSection

@Composable
@Preview
fun MainScreen(
    onSinglePlayerClick: () -> Unit = {},
    onBoardClick: () -> Unit = {}
) {
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.grey))
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            TopUserSection()
            Spacer(modifier = Modifier.height(16.dp))
            GameModeButtons(onSinglePlayerClick)
            Spacer(modifier = Modifier.height(32.dp))
            CategoryHeader()
            CategoryGrid()
            Banner()
        }
        BottomNavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter),
            onItemSelected = { itemId ->
                if (itemId==R.id.home){
                    onBoardClick()
                }
            }
        )
    }
}