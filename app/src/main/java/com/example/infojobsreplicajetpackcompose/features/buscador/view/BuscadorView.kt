package com.example.infojobsreplicajetpackcompose.features.buscador.view

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.composables.IJReplicaBuscadorTopAppBar
import com.example.infojobsreplicajetpackcompose.composables.IJReplicaScaffold
import com.example.infojobsreplicajetpackcompose.features.buscador.data.remote.FakeBuscadorRepository
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorBox
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorItem
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorTextLine
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorUpPart

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BuscadorView(
    buscadorList: List<BuscadorModel>
) {
    val text = remember { mutableStateOf("") }

    IJReplicaScaffold(
        topAppbar = { IJReplicaBuscadorTopAppBar(
            placeholder = "Puesto, empresa o palabra chave",
            text = text,
            percentageWidth = 1f
        )}
    ) {
        paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
        ) {

            LazyColumn{

                item { BuscadorBox()  }

                stickyHeader {
                    BuscadorTextLine(numberOfertas = buscadorList.size)
                }

                itemsIndexed(buscadorList) { index, buscadorItem ->
                    BuscadorItem(
                        buscadorModel = buscadorItem
                    )
                }
            }

        }
    }

}

@Preview
@Composable
fun BuscadorViewPreview() {

    Log.d("BuscadorList", FakeBuscadorRepository.listBuscadorItemsFake.toString())
    BuscadorView(FakeBuscadorRepository.listBuscadorItemsFake)
}

