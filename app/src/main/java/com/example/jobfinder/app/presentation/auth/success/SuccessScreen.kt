package com.example.jobfinder.app.presentation.auth.success

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

@SuppressLint("ResourceType")
@Composable
fun SuccessVerificationScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        CustomImage(
            painter = painterResource(id = R.drawable.successicon),
            contentDescription = "email",
            modifier = Modifier
                .height(146.dp)
                .width(146.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Successfully", fontSize = 20.sp, font = FontStyle.MEDIUM)
        Spacer(modifier = Modifier.height(10.dp))
        CustomHeading(title = "Your password has been updated, please change your password regularly to avoid this happening")
        Spacer(modifier = Modifier.height(66.dp))
        CustomButton(
            text = "Back to Login",
            onClick = {

                navController.navigate(Routes.LogInScreen.name) {
                    popUpTo(Routes.SignUpScreen.name){
                        inclusive = true
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )

    }
}