package com.example.restaapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.navigation.NavController
import com.example.restaapp.clases.Mesas

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Mesa(navController: NavController){
    Scaffold() {
        MesaBodyContent(navController = navController)
    }
}

@Composable
fun MesaBodyContent(navController: NavController){
    Mesa()
}

@Composable
fun Mesa(){
        Row() {
            Column() {
                Text(text = "Cuenta: "+0)
            }
            Column() {

            }
        }
}