package com.example.quizapp.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizapp.R

@Composable
@Preview
fun TopUserSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp, horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = null,
            Modifier.size(55.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "Hi, Bruno",
            fontSize = 20.sp,
            modifier = Modifier.weight(1f)
        )
        Row(
            modifier = Modifier
                .height(40.dp)
                .background(
                    color = colorResource(R.color.navy_blue),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.garnet),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "2400",
                color = colorResource(R.color.white)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(R.drawable.plus),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}