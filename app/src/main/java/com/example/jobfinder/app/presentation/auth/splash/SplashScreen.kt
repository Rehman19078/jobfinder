package com.example.jobfinder.app.presentation.auth.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jobfinder.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    val context = LocalContext.current
    val sharedPrefsHelper = SharedPrefsHelper(context)
    var move by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(Unit) {
        move = sharedPrefsHelper.getBoolean("onboarding", false)
        delay(3000)
        if (move == true) {
            navController.navigate(Routes.AuthNav.name){
                popUpTo(Routes.SplashScreen.name) {
                    inclusive = true
                }
            }

        } else {
            navController.navigate(Routes.OnBoardingScreen.name){
               popUpTo(Routes.SplashScreen.name) {
                   inclusive = true
                }
            }
        }


    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF7551FF))
    ) {
        CustomImage(painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            Modifier.height(88.dp).width(104.dp))
    }
}