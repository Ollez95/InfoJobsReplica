package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.ui.theme.Typography

@Composable
fun BuscadorTextLine(
    numberOfertas: Int
) {

    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Text(
            text = "$numberOfertas Ofertas Recomendadas",
            modifier = Modifier.padding(start = 16.dp),
            fontSize = Typography.h6.fontSize)
        Spacer(modifier = Modifier.height(4.dp))
        Divider(color = Color.Black, thickness = 1.dp)
    }

}

@Preview
@Composable
fun BuscadorTextLinePreview() {
    BuscadorTextLine(1)
}