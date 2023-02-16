package com.example.infojobsreplicajetpackcompose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun IJReplicaScaffold(
    topAppbar : @Composable () -> Unit,
    content : @Composable (paddingValues : PaddingValues) -> Unit
) {

    Scaffold(
        topBar = { topAppbar() },
        bottomBar = {
            IJReplicaBottomBar()
        }
    ) { paddingValues ->
        content(paddingValues)
    }

}


