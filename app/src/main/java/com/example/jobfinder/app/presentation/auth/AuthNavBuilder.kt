package com.example.jobfinder.app.presentation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jobfinder.app.presentation.Routes
import com.example.jobfinder.app.presentation.auth.emailverification.EmailVerificationScreen
import com.example.jobfinder.app.presentation.auth.forgotpassword.ForgotPasswordScreen
import com.example.jobfinder.app.presentation.auth.login.LogInScreen
import com.example.jobfinder.app.presentation.auth.signup.SignUpScreen
import com.example.jobfinder.app.presentation.auth.success.SuccessVerificationScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(route = Routes.AuthNav.name,startDestination = Routes.SignUpScreen.name,){
        composable(Routes.SignUpScreen.name) {
            SignUpScreen(navController)
        }
        composable(Routes.LogInScreen.name) {
            LogInScreen(navController)
        }
        composable(Routes.ForgotPasswordScreen.name) {
            ForgotPasswordScreen(navController)
        }
        composable(Routes.EmailVerificationScreen.name) {
            EmailVerificationScreen(navController)
        }
        composable(Routes.SuccessVerificationScreen.name) {
            SuccessVerificationScreen(navController)
        }
    }
}
