package com.example.infojobsreplicajetpackcompose.features.buscador.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.infojobsreplicajetpackcompose.composables.IJReplicaBuscadorTopAppBar
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorUpPart

@Composable
fun BuscadorView() {

    val text = remember { mutableStateOf("") }

    Scaffold(
        topBar = { IJReplicaBuscadorTopAppBar(
            placeholder = "Puesto, empresa o palabra chave",
            text = text,
            percentageWidth = 1f
        )}
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {

            LazyColumn{
                item { BuscadorUpPart() }
            }

        }
    }

}

@Preview
@Composable
fun BuscadorViewPreview() {
    BuscadorView()
}