package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel
import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.composables.IJIconSavable
import com.example.infojobsreplicajetpackcompose.composables.IJImageState
import com.example.infojobsreplicajetpackcompose.composables.IJItemNoImage

@Composable
fun BuscadorItem(
    buscadorModel: BuscadorModel
) {

    val active = rememberSaveable { mutableStateOf(false) }
    Column{
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            
            Spacer(modifier = Modifier.width(8.dp))
            IJImageState(
                pathImageUrl = buscadorModel.image,
                size = 60.dp
            )
            IJItemNoImage(buscadorModel)
            IJIconSavable(active = active)
            Spacer(modifier = Modifier.width(8.dp))
        }
        Divider(color = Color.Black, thickness = 1.dp)
    }
}


@Preview
@Composable
fun BuscadorItemPreview() {

    BuscadorItem(buscadorModel = BuscadorModel(
        index = 0,
        image = R.drawable.management_solutions,
        position = "afsasfafsasfafsfas",
        company = "afssfaasfsfa",
        date = "fassfa",
        city = "asffassfa",
        typeWork = "fassfa",
        salary = "sfafsa",
        typeOfProcess = "fasfaafsfas"))

}