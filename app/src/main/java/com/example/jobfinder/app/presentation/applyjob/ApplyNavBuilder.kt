package com.example.jobfinder.app.presentation.applyjob

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jobfinder.app.presentation.Routes
import com.example.jobfinder.app.presentation.applyjob.Home.HomeScreen
import com.example.jobfinder.app.presentation.applyjob.jobdescription.JobDetailScreen
import com.example.jobfinder.app.presentation.applyjob.upload.UploadCV
import com.example.jobfinder.app.presentation.auth.emailverification.EmailVerificationScreen
import com.example.jobfinder.app.presentation.auth.forgotpassword.ForgotPasswordScreen
import com.example.jobfinder.app.presentation.auth.login.LogInScreen
import com.example.jobfinder.app.presentation.auth.signup.SignUpScreen
import com.example.jobfinder.app.presentation.auth.success.SuccessVerificationScreen


fun NavGraphBuilder.applyNavGraph(navController: NavHostController){
    navigation(route = Routes.ApplyNav.name,startDestination = Routes.HomeScreen.name,){
        composable(Routes.HomeScreen.name) {
            HomeScreen(navController)
        }
        composable(Routes.JobDetailScreen.name) {
            JobDetailScreen(navController)
        }
        composable(Routes.UploadScreen.name) {
            UploadCV(navController)
        }


    }
}
