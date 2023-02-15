package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BuscadorUpPart() {

    Column {
        BuscadorBox()
        BuscadorTextLine(numberOfertas = 1)
    }

}

@Preview
@Composable
fun BuscadorUpPartPreview() {
    BuscadorUpPart()
}