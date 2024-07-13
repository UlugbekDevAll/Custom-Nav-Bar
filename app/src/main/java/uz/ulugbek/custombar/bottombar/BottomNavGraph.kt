package uz.ulugbek.custombar.bottombar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.ulugbek.custombar.screen.HomeScreen
import uz.ulugbek.custombar.screen.ProfileScreen
import uz.ulugbek.custombar.screen.ReportScreen
import androidx.compose.runtime.*

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavGraph(
    navController: NavHostController
) {


    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {

        composable(
            route = BottomBarScreen.Home.route,
           ) {
            ScreenWithAnimation {
                HomeScreen()
            }

        }
        composable(route = BottomBarScreen.Profile.route) {
            ScreenWithAnimation {
                ProfileScreen()
            }

        }
        composable(route = BottomBarScreen.Report.route) {
            ScreenWithAnimation {
                ReportScreen()
            }
        }
        composable(route = BottomBarScreen.Profile1.route) {
            ScreenWithAnimation {
               ReportScreen()
            }
        }
        composable(route = BottomBarScreen.Profile2.route) {
            ScreenWithAnimation {
                ReportScreen()
            }
        }
    }
}

@Composable
fun ScreenWithAnimation(content: @Composable () -> Unit) {
    var isVisible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        isVisible = true
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = fadeIn() + slideInHorizontally(initialOffsetX = { 100 }),
        exit = fadeOut() + slideOutHorizontally(targetOffsetX = { -100 })
    ) {
        content()
    }
}