package com.example.cognifyzproject

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homePage"){
        composable("homePage"){
            HomePage(navController = navController , modifier = modifier)
        }
        composable("task1"){
            Task1(navController = navController, modifier = modifier)
        }
        composable("task2"){
            Task2(navController = navController , modifier = modifier)
        }
        composable("task3"){
            Task3(navController = navController , modifier = modifier)
        }
        composable("task4"){
            Task4(navController = navController , modifier = modifier)
        }
        composable("task5"){
            Task5(navController = navController , modifier = modifier)
        }
        composable("task6"){
            Task6(navController = navController , modifier = modifier)
        }
        composable("task7"){
            Task7(navController = navController , modifier = modifier)
        }
        composable("task8"){
            Task8(navController = navController , modifier = modifier)
        }
    }
}