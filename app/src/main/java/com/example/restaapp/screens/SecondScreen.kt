package com.example.restaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.restaapp.clases.Mesas
import com.example.restaapp.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController){
    Scaffold {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    MesasDisponibles(navController)
}

@Composable
fun MesasDisponibles(navController: NavController){
    val mesa1 = Mesas("1")
    val mesa2 = Mesas("2")
    val mesa3 = Mesas("3")
    val mesa4 = Mesas("4")
    val mesa5 = Mesas("5")
    val mesa6 = Mesas("6")
    val mesa7 = Mesas("7")


    val mesas = listOf(mesa1,mesa2,mesa3,mesa4,mesa5,mesa6,mesa7)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        mesas.forEach {
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = {
                navController.navigate(route = AppScreens.Mesa.route)
                             },
                modifier = Modifier
                    .height(110.dp)
                    .width(170.dp)
            ) {
                Text(text = "Mesa ${it.nombre}", fontSize = 30.sp)
            }
        }

    }
}