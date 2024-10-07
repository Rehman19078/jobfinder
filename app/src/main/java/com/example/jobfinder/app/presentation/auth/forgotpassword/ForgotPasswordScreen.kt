package com.example.jobfinder.app.presentation.auth.forgotpassword

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomTextField
import com.example.jobfinder.app.component.commoncomponent.CustomTittle
import com.example.jobfinder.app.component.commoncomponent.FontStyle
import com.example.jobfinder.app.presentation.Routes

@Composable
fun ForgotPasswordScreen(navController: NavController) {
    var forgotemail by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        CustomImage(
            painter = painterResource(id = R.drawable.forgoticon),
            contentDescription = "email",
            modifier = Modifier
                .height(146.dp)
                .width(146.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Forgot Password?", fontSize = 20.sp, font = FontStyle.MEDIUM)
        Spacer(modifier = Modifier.height(10.dp))
        CustomHeading(title = "To reset your password, you need your email or mobile number that can be authenticated")
        Spacer(modifier = Modifier.height(40.dp))
        CustomHeading(title = "Email",font = FontStyle.BOLD, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Start)
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(
            value = forgotemail,
            onValueChange = { forgotemail = it },
            placeholder = "Enter your email",
            isPassword = false,
            showTrailingIcon = false
        )

        Spacer(modifier = Modifier.height(43.dp))
        CustomButton(
            text = "Reset Password",
            onClick = {
                navController.navigate(Routes.EmailVerificationScreen.name)
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
    }
}