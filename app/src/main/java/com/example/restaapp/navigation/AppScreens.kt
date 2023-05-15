package com.example.restaapp.navigation

sealed class AppScreens(val route: String){
        object FirstScreen: AppScreens("first_screen")
        object ScondScreen: AppScreens("second_screen")
        object Mesa: AppScreens("mesa")
}
