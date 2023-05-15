package com.example.restaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.restaapp.clases.Mesas
import com.example.restaapp.screens.FirstScreen
import com.example.restaapp.screens.Mesa
import com.example.restaapp.screens.SecondScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.ScondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.Mesa.route){
            Mesa(navController)
        }
    }

}