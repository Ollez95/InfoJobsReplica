package com.example.infojobsreplicajetpackcompose.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IJReplicaTextfield(
    placeholder: String,
    text: MutableState<String>,
    percentageWidth: Float,
) {

    TextField(
        placeholder = {
            Text(
                text = placeholder,
                fontStyle = FontStyle.Italic
            )
        },
        value = text.value,
        onValueChange = {
                newText ->
            text.value = newText
        },
        shape = RoundedCornerShape(8.dp),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                      },
        modifier =
        Modifier
            .fillMaxWidth(percentageWidth)
            .padding(8.dp),
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Black,
            backgroundColor = Color.White
        ))

}

@Preview
@Composable
fun IJReplicaTextfieldPreview() {

    val text = remember { mutableStateOf("") }

    IJReplicaTextfield(
        placeholder = "Puesto, empresa o palabra chave",
        text = text,
        percentageWidth = 1f

    )

}
