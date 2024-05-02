package com.kazakago.edgetoedge.material3.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "MainScreen",
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        composable("MainScreen") {
            MainScreen(
                onClickScaffoldLazyColumnScreen = {
                    navController.navigate("ScaffoldLazyColumnScreen")
                },
                onClickScaffoldTextFieldScreen = {
                    navController.navigate("ScaffoldTextFieldScreen")
                },
                onClickNoScaffoldLazyColumnScreen = {
                    navController.navigate("NoScaffoldLazyColumnScreen")
                },
                onClickNoScaffoldTextFieldScreen = {
                    navController.navigate("NoScaffoldTextFieldScreen")
                },
            )
        }
        composable("ScaffoldLazyColumnScreen") {
            ScaffoldLazyColumnScreen()
        }
        composable("ScaffoldTextFieldScreen") {
            ScaffoldTextFieldScreen()
        }
        composable("NoScaffoldLazyColumnScreen") {
            NoScaffoldLazyColumnScreen()
        }
        composable("NoScaffoldTextFieldScreen") {
            NoScaffoldTextFieldScreen()
        }
    }
}
