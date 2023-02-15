package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel
import com.example.infojobsreplicajetpackcompose.ui.theme.Typography

@Composable
fun BuscadorItem(
    buscadorModel: BuscadorModel
) {



}


@Composable
fun BuscadorItemNoImage(buscadorModel: BuscadorModel) {

    Column(
        Modifier.padding(4.dp)
    ) {

        Text(text = buscadorModel.typeOfProcess, fontSize = Typography.body2.fontSize)
        Text(text = buscadorModel.position, fontWeight = FontWeight.Bold, fontSize = Typography.body1.fontSize)
        Text(text = buscadorModel.company, fontSize = 12.sp)
        Text(text = buscadorModel.date, fontSize = 12.sp)
        Text(text = buscadorModel.typeWork, fontSize = 12.sp)
        Text(text = buscadorModel.salary, fontSize = 12.sp)

    }

}

@Preview
@Composable
fun BuscadorItemNoImagePreview() {
    BuscadorItemNoImage(
        buscadorModel = BuscadorModel(
            image = "",
    position = "afsasfafsasfafsfas",
    company = "afssfaasfsfa",
    date = "fassfa",
    city = "asffassfa",
    typeWork = "fassfa",
    salary = "sfafsa",
    typeOfProcess = "fasfaafsfas")
    )


}