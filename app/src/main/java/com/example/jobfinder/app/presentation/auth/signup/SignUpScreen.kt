package com.example.jobfinder.app.presentation.auth.signup

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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
fun SignUpScreen(navController: NavController) {
    var fullname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(true) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        CustomImage(
            painter = painterResource(id = R.drawable.signupicon),
            contentDescription = "signup",
            modifier = Modifier
                .height(101.dp)
                .width(101.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Create an Account", fontSize = 20.sp, font = FontStyle.MEDIUM)
        Spacer(modifier = Modifier.height(10.dp))
        CustomHeading(
            title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor",
            modifier = Modifier.padding(start = 19.dp, end = 19.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        CustomHeading(
            title = "Full name",
            font = FontStyle.BOLD,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(
            value = fullname,
            onValueChange = { fullname = it },
            placeholder = "Enter your name",
            isPassword = false,
            showTrailingIcon = false
        )
        Spacer(modifier = Modifier.height(14.dp))
        CustomHeading(
            title = "Email",
            font = FontStyle.BOLD,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Enter your email",
            isPassword = false,
            showTrailingIcon = false
        )
        Spacer(modifier = Modifier.height(15.dp))
        CustomHeading(
            title = "Password",
            font = FontStyle.BOLD,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Enter your password",
            isPassword = true,
            showTrailingIcon = true
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xFF7551FF),
                        uncheckedColor = Color(0xFF524B6B),
                        checkmarkColor = Color.White
                    )
                )
                CustomHeading(title = "Remember me")
            }
            CustomHeading(title = "Forgot Password ?", modifier = Modifier.clickable {
                navController.navigate(Routes.ForgotPasswordScreen.name)

            }, color = Color(0xFF3847E5))
        }
        Spacer(modifier = Modifier.height(40.dp))
        CustomButton(
            text = "Sign Up",
            onClick = {
                navController.navigate(Routes.LogInScreen.name)
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        CustomButton(
            text = "Sign up with Google",
            onClick = { /*TODO*/ },
            backgroundColors = listOf(Color(0xFFFFFFFF), Color(0xFFFFFFFF)),
            textColor = Color(0xFF150B3D)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            CustomHeading(title = "You don't have an account yet? ")
            CustomHeading(title = " Sign in", modifier = Modifier.clickable {
                navController.navigate(Routes.LogInScreen.name)
            }, color = Color(0xFF3847E5))
        }
    }
}