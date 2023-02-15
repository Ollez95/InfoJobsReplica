package com.example.infojobsreplicajetpackcompose.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.R

@Composable
fun IJReplicaMisOfertasTopAppBar() {
    TopAppBar {
        Text(text = stringResource(id = R.string.mis_ofertas_top_app))
        Spacer(modifier = Modifier.weight(1f))
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Ofertas Topbar")
    }

}

@Composable
fun IJReplicaNovedadesTopAppBar() {
    TopAppBar {
        Text(text = stringResource(id = R.string.novedades_top_app))
    }
}

@Composable
fun IJReplicaCVTopAppBar() {
    TopAppBar {
        Text(text = stringResource(id = R.string.cv_top_app))
        Spacer(modifier = Modifier.weight(1f))
        Icon(imageVector = Icons.Default.Comment, contentDescription = "CV Topbar")
        Spacer(modifier = Modifier.width(24.dp))
        Icon(imageVector = Icons.Default.Settings, contentDescription = "CV Topbar")
    }
}

@Composable
fun IJReplicaBuscadorTopAppBar(
    placeholder: String,
    text: MutableState<String>,
    percentageWidth: Float) {
    TopAppBar(
        modifier = Modifier.height(72.dp)
    ) {
        IJReplicaTextfield(
            placeholder = placeholder,
            text = text,
            percentageWidth = percentageWidth)
    }
}


@Preview
@Composable
private fun IJReplicaMisOfertasTopAppBarPreview() {
    IJReplicaMisOfertasTopAppBar()
}

@Preview
@Composable
private fun IJReplicaNovedadesTopAppBarPreview() {
    IJReplicaNovedadesTopAppBar()
}

@Preview
@Composable
private fun IJReplicaCVTopAppBarPreview() {
    IJReplicaCVTopAppBar()
}

@Preview
@Composable
private fun IJReplicaBuscadorTopAppBarPreview() {

    val text = remember { mutableStateOf("") }

    IJReplicaBuscadorTopAppBar(
        placeholder = "Puesto, empresa o palabra chave",
        text = text,
        percentageWidth = 1f
    )
}