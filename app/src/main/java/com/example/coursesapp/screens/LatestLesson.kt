package com.example.coursesapp.screens
import androidx.compose.foundation.Image
import com.example.coursesapp.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun LatestLessonTex(modifier: Modifier ) {
    Text(text = "Latest Lesson",
        fontSize = 16.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Normal,
        color = Color.Black,
        modifier = modifier)
}

@Composable
fun SeeAllText(modifier: Modifier ) {
    Text(text = "See all",
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        color = Color.Blue,
        modifier = modifier)
}
@Composable
fun LessonCard(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 1.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            // Example content inside the card


            Spacer(modifier = Modifier.width(4.dp))

            ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                val (lessonDate,timeImg,
                    lessonSchedule,aiImg,lessonTitle,lessonDesc,
                    roomImg , roomTitle , roomDesc

                ) = createRefs()

                Text(
                    text = "Lesson Date",
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessonDate) {
                        top.linkTo(parent.top, margin = 5.dp)
                        start.linkTo(parent.start, margin = 4.dp)
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.time),
                    contentDescription = "time",
                    modifier = Modifier
                        .size(25.dp)
                        .constrainAs(timeImg) {
                            top.linkTo(lessonDate.bottom, margin = 8.dp)
                            start.linkTo(lessonDate.start)
                        }
                )
                Text(
                    text = "Thur Jun 6 | 8:00 - 8:30 AM",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(lessonSchedule) {
                        top.linkTo(timeImg.top)
                        start.linkTo(timeImg.end, margin = 8.dp)
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.ai),
                    contentDescription = "aiImg",
                    modifier = Modifier
                        .size(120.dp)
                        .constrainAs(aiImg) {
                        top.linkTo(lessonSchedule.bottom)
                        start.linkTo(lessonSchedule.start, margin = 0.dp) // or lessonSchedule.end if you meant right side
                    }
                )
                Text(
                    text = "Jetpack Compose",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(lessonTitle) {
                        top.linkTo(aiImg.top)
                        bottom.linkTo(aiImg.bottom)
                        start.linkTo(aiImg.end, margin = 20.dp)
                        // Move a bit above the center (0.5 is center, lower values are higher)
                        verticalBias = 0.08f
                    }
                )

                Text(
                    text = "To be a pro developer, you need to master jetpack compose in Android",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessonDesc) {
                        top.linkTo(lessonTitle.bottom, margin = 2.dp)
                        start.linkTo(lessonTitle.start)
                        end.linkTo(parent.end) // Optional: so text doesn't overflow
                        width = Dimension.fillToConstraints // Optional: keeps layout tidy
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.ai),
                    contentDescription = "roomImg",
                    modifier = Modifier
                        .size(120.dp)
                        .constrainAs(roomImg) {
                            top.linkTo(aiImg.bottom, margin = 20.dp)
                            start.linkTo(aiImg.start)
                        }
                )

                Text(
                    text = "Room Database",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(roomTitle) {
                        top.linkTo(roomImg.top)
                        bottom.linkTo(roomImg.bottom)
                        start.linkTo(roomImg.end, margin = 20.dp)
                        verticalBias = 0.08f
                    }
                )

                Text(
                    text = "Learn Room DB for efficient offline data persistence in Android apps",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(roomDesc) {
                        top.linkTo(roomTitle.bottom, margin = 2.dp)
                        start.linkTo(roomTitle.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.ai),
                    contentDescription = "roomImg",
                    modifier = Modifier
                        .size(120.dp)
                        .constrainAs(roomImg) {
                            top.linkTo(aiImg.bottom, margin = 20.dp)
                            start.linkTo(aiImg.start)
                        }
                )

                Text(
                    text = "Room Database",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(roomTitle) {
                        top.linkTo(roomImg.top)
                        bottom.linkTo(roomImg.bottom)
                        start.linkTo(roomImg.end, margin = 20.dp)
                        verticalBias = 0.08f
                    }
                )

                Text(
                    text = "Learn Room DB for efficient offline data persistence in Android apps",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(roomDesc) {
                        top.linkTo(roomTitle.bottom, margin = 2.dp)
                        start.linkTo(roomTitle.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                    }
                )











            }
        }
    }
}
