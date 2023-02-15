package com.example.infojobsreplicajetpackcompose.composables

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.infojobsreplicajetpackcompose.R

@Composable
fun IJReplicaBottomBar() {

    BottomAppBar {

        Row(
           horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ){
            IJReplicaBottomBarItem(
                icon = Icons.Default.Search,
                textIcon = stringResource(id = R.string.buscador)
            )
            IJReplicaBottomBarItem(
                icon = Icons.Default.Search,
                textIcon = stringResource(id = R.string.mis_ofertas)
            )
            IJReplicaBottomBarItem(
                icon = Icons.Default.Person,
                textIcon = stringResource(id = R.string.cv)
            )
            IJReplicaBottomBarItem(
                icon = Icons.Default.Search,
                textIcon = stringResource(id = R.string.novedades)
            )
        }


    }

}

@Composable
fun IJReplicaBottomBarItem(
    icon: ImageVector,
    textIcon: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(imageVector = icon, contentDescription = textIcon)
        Text(text = textIcon)
    }

}

@Preview
@Composable
private fun IJReplicaBottomBarPreview() {
    IJReplicaBottomBar()
}

@Preview
@Composable
private fun IJReplicaBottomBarItemPreview(){
    IJReplicaBottomBarItem(
        icon = Icons.Default.Search,
        textIcon = "Buscador"
    )
}