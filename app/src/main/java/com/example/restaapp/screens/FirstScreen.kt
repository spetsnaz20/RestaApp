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
import com.example.restaapp.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstScreen(navController: NavController){
    Scaffold {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Bienvenido a RestaApp!", fontSize = 35.sp)
                Spacer(modifier = Modifier.height(50.dp))
                Button(onClick = {
                    navController.navigate(route = AppScreens.ScondScreen.route)
                }, modifier = Modifier
                    .height(60.dp)
                    .width(120.dp)) {
                    Text(text = "Acceder", fontSize = 15.sp)
                }
            }

        }
    }
}