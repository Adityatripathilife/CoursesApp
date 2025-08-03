package com.example.coursesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.coursesapp.R

@Composable
fun BackgroundConstraint(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.qw),
        contentDescription = "Main Background",
        contentScale = ContentScale.Crop,
        modifier = modifier.alpha(0.8f)
    )
}