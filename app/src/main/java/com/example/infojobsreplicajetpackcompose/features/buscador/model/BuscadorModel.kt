package com.example.infojobsreplicajetpackcompose.features.buscador.model

data class BuscadorModel(
    val index: Int,
    val image: Any,
    val position: String,
    val company:String,
    val date: String,
    val city: String,
    val typeWork: String,
    val salary: String,
    val typeOfProcess: String,
    val inProcess: Boolean = false
)
