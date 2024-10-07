package com.example.jobfinder.app.presentation.auth.emailverification

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomTittle
import com.example.jobfinder.app.component.commoncomponent.FontStyle
import com.example.jobfinder.app.presentation.Routes

@Composable
fun EmailVerificationScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        CustomImage(
            painter = painterResource(id = R.drawable.emailicon),
            contentDescription = "email",
            modifier = Modifier
                .height(146.dp)
                .width(146.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Check Your Email", fontSize = 20.sp, font = FontStyle.MEDIUM)
        Spacer(modifier = Modifier.height(10.dp))
        CustomHeading(title = "We have sent the reset password to the email address brandonelouis@gmial.com")
        Spacer(modifier = Modifier.height(66.dp))
        CustomButton(
            text = "Open Your Email",
            onClick = {
                navController.navigate(Routes.SuccessVerificationScreen.name)
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        CustomButton(
            text = "Back to Login",
            onClick = {
                navController.navigate(Routes.LogInScreen.name){
                    popUpTo(Routes.LogInScreen.name){
                        inclusive = true
                    }
                }
            },
            backgroundColors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF)),
            textColor = Color(0xFF150B3D)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            CustomHeading(title = "You don't have an account yet? ")
            CustomHeading(title = "Resend", modifier = Modifier.clickable {
            }, color = Color(0xFF3847E5))
        }
    }
}