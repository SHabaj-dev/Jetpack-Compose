package com.sbz.navigationusingjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screens.Home.route
    ) {
        composable(
            route = Screens.Home.route
        ) {
            HomeScreen(navHostController)
        }

        composable(
            route = Screens.Detail.route
        ) {
            DetailScreen(navHostController)
        }
    }
}