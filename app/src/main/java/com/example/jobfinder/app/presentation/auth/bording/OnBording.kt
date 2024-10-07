package com.example.jobfinder.app.presentation.auth.bording

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomTittle
import com.example.jobfinder.app.component.commoncomponent.FontStyle
import com.example.jobfinder.app.presentation.Routes
import com.example.jobfinder.app.utilites.SharedPrefsHelper

@Composable
fun OnBordingScreen(navController: NavController) {
    val context = LocalContext.current
    val sharedPrefsHelper = SharedPrefsHelper(context)
    val scope = rememberCoroutineScope()
    Box(modifier = Modifier.fillMaxSize()) {
        CustomImage(
            painter = painterResource(id = R.drawable.onbording),
            contentDescription = "onbording"
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 40.dp, end = 40.dp)
        ) {
            CustomTittle(title = "WELCOME")
            Spacer(modifier = Modifier.height(20.dp))
            CustomHeading(title = "Find and get job recommendations, search and save your job vacancies", font = FontStyle.MEDIUM)
            Spacer(modifier = Modifier.height(114.dp))

                CustomButton(
                    text = "Start",
                    onClick = {
                        sharedPrefsHelper.setBoolean("onboarding", true)
                        navController.navigate(Routes.AuthNav.name){
                            popUpTo(Routes.SplashScreen.name){
                                inclusive =true
                            }
                        }
                    },
                    cornerRadius = 73.dp,
                    modifier = Modifier.width(140.dp)
                )
            Spacer(modifier = Modifier.height(78.dp))
            }

        }
    }
