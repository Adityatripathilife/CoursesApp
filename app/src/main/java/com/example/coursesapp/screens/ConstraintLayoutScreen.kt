package com.example.coursesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.coursesapp.R
import java.nio.file.WatchEvent

@Composable
fun ConstraintLayoutScreen() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.surface)
    ) {

        val (backgroundImage,ProfileImage,Notification,
            welcomeText, questionText, joinBtn, coursesImg,card,newCourses
        ,androidImg,flutterImg,webImg,androidText, flutterText, webText
            ) = createRefs()

        val (latestText, seeAllText,lessonCard) = createRefs()


        val topGuideline1 = createGuidelineFromTop(0.45f)

        BackgroundConstraint(
            modifier = Modifier
                .constrainAs(backgroundImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(topGuideline1)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })

        // Header : (chain example)
        val topGuideline = createGuidelineFromTop(30.dp)
        val startGuideline = createGuidelineFromStart(16.dp)
        val endGuideline = createGuidelineFromEnd (16.dp)

        // chain
        createHorizontalChain(
            ProfileImage,Notification,
            chainStyle = ChainStyle.SpreadInside
        )
        ProfileImage(modifier = Modifier.
        constrainAs(ProfileImage){
            top.linkTo(topGuideline)
        })
        Notification(modifier = Modifier
            .constrainAs(Notification) {
            top. linkTo(ProfileImage.top)
            bottom.linkTo(ProfileImage.bottom)
        })

        // Middle Part
        WelcomeText(modifier = Modifier
            .constrainAs(welcomeText) {
                top.linkTo(ProfileImage.bottom, margin = 32.dp)
                start.linkTo(startGuideline)
            })
        QuestionText(modifier = Modifier
            .constrainAs(questionText) {
                top.linkTo(welcomeText.bottom, margin = 8.dp)
                start.linkTo(welcomeText.start)
            })

        JoinNowButton(modifier = Modifier
            .constrainAs(joinBtn) {
                top.linkTo(questionText.bottom, margin = 32.dp)
                start.linkTo(questionText.start)
                end.linkTo(questionText.end)
            }){}
        CoursesImage(
            modifier = Modifier.constrainAs(coursesImg) {
                top. linkTo(Notification.bottom, margin = 16.dp)
                end.linkTo(endGuideline)
                width = Dimension.value(220.dp)
                height = Dimension.value(250.dp)
            }
        )
        MyCard(
            modifier = Modifier.constrainAs(card) {
                top.linkTo(topGuideline1, margin = (-16).dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        )
        // Our Courses Section
        TextOurCourses(
            modifier = Modifier.constrainAs(newCourses) {
                top.linkTo(card.top, margin = 24.dp)
                start.linkTo(card.start, margin = 16.dp)
            }
        )
        AndroidCourseImg(
            modifier = Modifier.constrainAs(androidImg) {
                top.linkTo(newCourses.bottom, margin = 16.dp)
            }
        )

        FlutterCourseImg(
            modifier = Modifier.constrainAs(flutterImg) {
                top.linkTo(newCourses.bottom, margin = 16.dp)
            }
        )

        WebCourseImg(
            modifier = Modifier.constrainAs(webImg) {
                top.linkTo(newCourses.bottom, margin = 16.dp)
            }
        )

        createHorizontalChain(
            androidImg, flutterImg, webImg,
            chainStyle = ChainStyle.Spread
        )
        AndroidText(
            modifier = Modifier.constrainAs(androidText) {
                top.linkTo(androidImg.bottom, margin = 8.dp)
                start.linkTo(androidImg.start)
                end.linkTo(androidImg.end)
            }
        )
        FlutterText(
            modifier = Modifier.constrainAs(flutterText) {
                top.linkTo(flutterImg.bottom, margin = 8.dp)
                start.linkTo(flutterImg.start)
                end.linkTo(flutterImg.end)
            }
        )
        WebText(
            modifier = Modifier.constrainAs(webText) {
                top.linkTo(webImg.bottom, margin = 8.dp)
                start.linkTo(webImg.start)
                end.linkTo(webImg.end)
            }
        )

        LatestLessonTex(
            modifier = Modifier.constrainAs(latestText) {
                top.linkTo(androidImg.bottom, margin = 56.dp) // Just below heading
                start.linkTo(parent.start, margin = 26.dp)

            }
        )

        SeeAllText(
            modifier = Modifier.constrainAs(seeAllText) {
                top.linkTo(webImg.bottom, margin = 56.dp) // Same top as LatestLessonTex
                end.linkTo(parent.end, margin = 26.dp)
            }
        )

        LessonCard(
            modifier = Modifier.constrainAs(lessonCard) {
                top.linkTo(latestText.bottom, margin = 16.dp)
                start.linkTo(latestText.start)
                end.linkTo(endGuideline)
                width = Dimension.fillToConstraints
                height = Dimension.wrapContent
            }
        )








    }
}

