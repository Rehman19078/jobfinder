package com.example.jobfinder.app.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.jobfinder.app.presentation.applyjob.applyNavGraph
import com.example.jobfinder.app.presentation.auth.authNavGraph
import com.example.jobfinder.app.presentation.auth.emailverification.EmailVerificationScreen
import com.example.jobfinder.app.presentation.auth.forgotpassword.ForgotPasswordScreen
import com.example.jobfinder.app.presentation.auth.login.LogInScreen
import com.example.jobfinder.app.presentation.auth.bording.OnBordingScreen
import com.example.jobfinder.app.presentation.auth.signup.SignUpScreen
import com.example.jobfinder.app.presentation.auth.splash.SplashScreen
import com.example.jobfinder.app.presentation.auth.success.SuccessVerificationScreen

@Composable
fun MainNavigationScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SplashScreen.name) {
        composable(Routes.SplashScreen.name) {
            SplashScreen(navController)
        }
        composable(Routes.OnBoardingScreen.name) {
            OnBordingScreen(navController)
        }
        //auth navigation
        authNavGraph(navController)
        //apply navigation
        applyNavGraph(navController)
    }
}
enum class Routes {
    // Screens
    SplashScreen,
    OnBoardingScreen,
    SignUpScreen,
    LogInScreen,
    ForgotPasswordScreen,
    EmailVerificationScreen,
    SuccessVerificationScreen,
    HomeScreen,
    JobDetailScreen,
    UploadScreen,
    //Auth Navigation Holder
    AuthNav,
    //Apply Navigation Holder
    ApplyNav,
}

