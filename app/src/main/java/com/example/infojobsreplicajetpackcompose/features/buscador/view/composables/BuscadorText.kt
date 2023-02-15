package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.ui.theme.Typography

@Composable
fun BuscadorText() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BuscadorTextItem(stringId =R.string.buscador_text_1,)
        BuscadorTextItem(stringId =R.string.buscador_text_2 )
        BuscadorTextItem(stringId =R.string.buscador_text_3 )

    }

}


@Composable
fun BuscadorTextItem(
    stringId: Int
) {
    Text(
        text = stringResource(id = stringId),
        fontWeight = FontWeight.Bold,
        fontSize = Typography.body1.fontSize)
}

@Preview
@Composable
fun BuscadorTextPreview() {
    BuscadorText()
}