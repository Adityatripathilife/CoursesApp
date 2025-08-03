package com.example.coursesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesapp.R
@Composable
fun TextOurCourses(modifier: Modifier ) {
    Text(
        text = "New Courses",
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Black
    )
}
    @Composable
    fun AndroidCourseImg(modifier: Modifier ) {
        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Android Course",
            modifier = modifier
                .size(50.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }
@Composable
fun FlutterCourseImg(modifier: Modifier ) {
    Image(
        painter = painterResource(id = R.drawable.flutter),
        contentDescription = "Flutter Course",
        modifier = modifier
            .size(50.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}
@Composable
fun WebCourseImg(modifier: Modifier ) {
    Image(
        painter = painterResource(id = R.drawable.web),
        contentDescription = "Web Development Course",
        modifier = modifier
            .size(50.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}
@Composable
fun AndroidText(modifier: Modifier) {
    Text(
        text = "Android",
        modifier = modifier,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
}
@Composable
fun FlutterText(modifier: Modifier) {
    Text(
        text = "Flutter",
        modifier = modifier,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
}
@Composable
fun WebText(modifier: Modifier) {
    Text(
        text = "Web",
        modifier = modifier,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
}






