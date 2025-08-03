package com.example.coursesapp.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesapp.R

@Composable
fun WelcomeText(modifier: Modifier ) {
    Text(text = "Welcome Back!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier
        )
}

@Composable
fun QuestionText(modifier: Modifier = Modifier) {
    Text(text = "What do you want to learn",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun JoinNowButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF6F61)),
        modifier = modifier
    ) {
        Text(text = "Join Now!")
    }
}


@Composable
fun CoursesImage(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.courses),
        contentDescription = "Courses",
        modifier = modifier.size(80.dp) // Adjust size here
    )
}