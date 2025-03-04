package com.example.descuentosapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalcularViewModel2  : ViewModel(){

    var precio by mutableStateOf("")
    private set //hacer privada
    var descuento by mutableStateOf("")
    private set //hacer privada
    var precioDescuento by mutableStateOf(0.0)
    private set //hacer privada
    var totalDescuento by mutableStateOf(0.0)
    private set //hacer privada

    var showAlert by mutableStateOf(false)
    private set


    fun cal(){
        precio = "afas"
    }

}